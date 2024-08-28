package com.acc.productservice.service;

import com.acc.productservice.model.APIResponse;
import com.acc.productservice.model.request.ProductRequest;
import com.acc.productservice.model.response.ProductResponse;

import java.util.List;

public interface ProductService {

    APIResponse<List<ProductResponse>> findAllProduct();
    APIResponse<ProductResponse> findProductById(Long id);
    APIResponse<ProductResponse> addProduct(ProductRequest productRequest);
    APIResponse<ProductResponse> updateProduct(Long id, ProductRequest productRequest);
    APIResponse<ProductResponse> deleteProduct(Long id);
    APIResponse<Void> checkAvailable(Long id, int quantity);
    APIResponse<Void> reduceProduct(Long id, int quantity);

}
