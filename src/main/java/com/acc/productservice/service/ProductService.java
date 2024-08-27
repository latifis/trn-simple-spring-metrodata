package com.acc.productservice.service;

import com.acc.productservice.model.APIResponse;
import com.acc.productservice.model.request.ProductRequest;

public interface ProductService {

    APIResponse findAllProduct();
    APIResponse findProductById(Long id);
    APIResponse addProduct(ProductRequest productRequest);
    APIResponse updateProduct(Long id, ProductRequest productRequest);
    APIResponse deleteProduct(Long id);
}
