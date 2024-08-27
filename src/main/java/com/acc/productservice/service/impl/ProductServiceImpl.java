package com.acc.productservice.service.impl;

import com.acc.productservice.model.APIResponse;
import com.acc.productservice.model.mapper.ProductMapper;
import com.acc.productservice.model.request.ProductRequest;
import com.acc.productservice.repository.ProductRepository;
import com.acc.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public APIResponse findAllProduct() {

//        List<ProductResponse> products = productRepository.findAll()
//                .stream()
//                .map(product -> {
//                    ProductResponse productResponse = new ProductResponse();
//                    productResponse.setName(product.getName());
//                    productResponse.setPrice(product.getPrice());
//                    productResponse.setQuantity(product.getQuantity());
//                    return productResponse;
//                }).collect(Collectors.toList());

//        return new APIResponse<>(productMapper.productToProductResponse());
//        return productMapper.mapToApiResponseListDto(
//                productRepository.findAll()
//        );
        return null;
    }

    @Override
    public APIResponse findProductById(Long id) {

        return null;
    }

    @Override
    public APIResponse addProduct(ProductRequest productRequest) {
        return null;
    }

    @Override
    public APIResponse updateProduct(Long id, ProductRequest productRequest) {
        return null;
    }

    @Override
    public APIResponse deleteProduct(Long id) {
        return null;
    }
}
