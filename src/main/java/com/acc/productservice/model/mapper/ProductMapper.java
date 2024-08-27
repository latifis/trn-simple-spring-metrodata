package com.acc.productservice.model.mapper;

import com.acc.productservice.entity.Product;
import com.acc.productservice.model.request.ProductRequest;
import com.acc.productservice.model.response.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends APIResponseMapper<Product, ProductRequest, ProductResponse>{

    ProductResponse productToProductResponse (Product product);
    // target                                  // source

}
