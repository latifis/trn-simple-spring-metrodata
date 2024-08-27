package com.acc.productservice.service;

import com.acc.productservice.model.APIResponse;

public interface ProductService {

    APIResponse findAllProduct();
    APIResponse findProductById();
    APIResponse addProduct();
    APIResponse updateProduct();
    APIResponse deleteProduct();
}
