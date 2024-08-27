package com.acc.productservice.service.impl;

import com.acc.productservice.entity.Product;
import com.acc.productservice.exception.CustomException;
import com.acc.productservice.model.APIResponse;
import com.acc.productservice.model.request.ProductRequest;
import com.acc.productservice.model.response.ProductResponse;
import com.acc.productservice.model.mapper.ProductMapper;
import com.acc.productservice.repository.ProductRepository;
import com.acc.productservice.service.ProductService;
import com.acc.productservice.util.ObjectValidator;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ObjectValidator<ProductRequest> objectValidator;

    @Override
    public APIResponse findAllProduct() {
//        List<Product> products = productRepository.findAll();
//        List<ProductResponse> responses = products
//                .stream()
//                .map(product -> {
//                    ProductResponse productResponse = new ProductResponse();
//                    productResponse.setId(product.getId());
//                    productResponse.setName(product.getName());
//                    productResponse.setPrice(product.getPrice());
//                    productResponse.setQuantity((product.getQuantity()));
//                    return productResponse;
//                }).collect(Collectors.toList());
//        return new APIResponse<>(products);
        return productMapper.mapToApiResponseListDto(
                productRepository.findAll()
        );
    }

    @Override
    public APIResponse findProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new CustomException(
                        String.format("Product with give id: %s not found", id),
                        "PRODUCT_NOT_FOUND",
                        404
                ));

//        ProductResponse productResponse = productMapper.modelToResponseDto(product);
//        productResponse.setCategory(new Category());

//        ProductResponse productResponse = new ProductResponse();
//        productResponse.setId(product.getId());
//        productResponse.setName(product.getName());
//        productResponse.setPrice(product.getPrice());
//        productResponse.setQuantity((product.getQuantity()));
        return productMapper.mapToApiResponseDto(product);
//        return productMapper.assignToApiResponseDto(productResponse);
    }

    @Override
    public APIResponse addProduct(ProductRequest productRequest) {
        List<String> validate = objectValidator.validate(productRequest);
        if (!validate.isEmpty()){
            return productMapper.mapErrorToApiResponseDto(validate);
        }
        Product product = productMapper.requestDtoToModel(productRequest);
        return productMapper.mapToApiResponseDto(
                productRepository.save(product)
        );
//        Product product = new Product();
//        product.setName(productRequest.getName());
//        product.setPrice(productRequest.getPrice());
//        product.setQuantity(productRequest.getQuantity());
//
//        Product result = productRepository.saveAndFlush(product);
//
//        ProductResponse productResponse = new ProductResponse();
//        productResponse.setId(result.getId());
//        productResponse.setName(result.getName());
//        productResponse.setPrice(result.getPrice());
//        productResponse.setQuantity(result.getQuantity());

//        Product product = productMapper.requestDtoToModel(productRequest);
//        return productMapper.mapToApiResponseDto(
//                productRepository.saveAndFlush(product)
//        );
    }

    @Override
    public APIResponse updateProduct(Long id, ProductRequest productRequest) {
        // Check Data by ID
        findProductById(id);

        List<String> validate = objectValidator.validate(productRequest);
        if (!validate.isEmpty()){
            return productMapper.mapErrorToApiResponseDto(validate);
        }

        // Mapping ProductRequest to Product
        Product product = productMapper.requestDtoToModel(productRequest);
//        Product product = new Product();
//        product.setId(id);
//        product.setName(productRequest.getName());
//        product.setPrice(productRequest.getPrice());
//        product.setQuantity(productRequest.getQuantity());

        //Save Product
//        Product result = productRepository.saveAndFlush(product);

        // Mapping Product to ProductResponse
//        ProductResponse productResponse = new ProductResponse();
//        productResponse.setId(result.getId());
//        productResponse.setName(result.getName());
//        productResponse.setPrice(result.getPrice());
//        productResponse.setQuantity(result.getQuantity());

        product.setId(id);  // agar bisa update
        return productMapper.mapToApiResponseDto(
                productRepository.saveAndFlush(product)
        );
    }

    @Override
    public APIResponse deleteProduct(Long id) {
        APIResponse product = findProductById(id);
        productRepository.deleteById(id);
        return product;
    }
}