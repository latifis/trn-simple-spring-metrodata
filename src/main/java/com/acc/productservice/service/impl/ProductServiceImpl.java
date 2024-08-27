package com.acc.productservice.service.impl;

import com.acc.productservice.model.APIResponse;
import com.acc.productservice.repository.ProductRepository;
import com.acc.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public APIResponse findAllProduct() {
        return null;
    }

    @Override
    public APIResponse findProductById() {
        return null;
    }

    @Override
    public APIResponse addProduct() {
        return null;
    }

    @Override
    public APIResponse updateProduct() {
        return null;
    }

    @Override
    public APIResponse deleteProduct() {
        return null;
    }
}
