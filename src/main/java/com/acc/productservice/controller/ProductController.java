package com.acc.productservice.controller;

import com.acc.productservice.model.APIResponse;
import com.acc.productservice.model.request.ProductRequest;
import com.acc.productservice.model.response.ProductResponse;
import com.acc.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<APIResponse<List<ProductResponse>>> getAllProduct(){
        return new ResponseEntity<>(productService.findAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<List<ProductResponse>>> getByProductId(
            @PathVariable("id") Long productId
    ){
        return new ResponseEntity<>(productService.findProductById(productId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<APIResponse<List<ProductResponse>>> addProduct(
            @RequestBody ProductRequest productRequest
            ){
        return new ResponseEntity<>(productService.addProduct(productRequest), HttpStatus.OK);
    }

}
