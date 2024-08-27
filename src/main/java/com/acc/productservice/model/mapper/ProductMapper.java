package com.acc.productservice.model.mapper;

import com.acc.productservice.entity.Product;
import com.acc.productservice.model.APIResponse;
import com.acc.productservice.model.request.ProductRequest;
import com.acc.productservice.model.response.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper extends APIResponseMapper<Product, ProductRequest, ProductResponse> {

        //    ProductResponse productToProductResponse (Product product);
//
//    @Mapping(target = "name", defaultValue = "Johan")
//    Product productRequestToProduct (ProductRequest productRequest);
        default APIResponse<ProductResponse> assignToApiResponseDto (ProductResponse s) {
                return new APIResponse<>(s);
        }
}