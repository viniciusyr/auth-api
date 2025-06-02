package com.viniciusysr.auth_api.controllers.product;

import com.viniciusysr.auth_api.dtos.product.ProductRecordDTO;
import com.viniciusysr.auth_api.dtos.product.ProductResponseDTO;
import com.viniciusysr.auth_api.services.product.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<ProductResponseDTO> registerProduct(@RequestBody @Valid ProductRecordDTO data){
        ProductResponseDTO product = productService.createProduct(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

}
