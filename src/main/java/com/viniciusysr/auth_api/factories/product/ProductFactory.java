package com.viniciusysr.auth_api.factories.product;

import com.viniciusysr.auth_api.dtos.product.ProductRecordDTO;
import com.viniciusysr.auth_api.dtos.product.ProductResponseDTO;
import com.viniciusysr.auth_api.models.product.ProductModel;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class ProductFactory {

    public ProductModel createProduct(ProductRecordDTO productRecordDTO){

        if(productRecordDTO == null){
            throw new RuntimeException("Product DTO is null");
        }

        return new ProductModel(
                productRecordDTO.name(),
                productRecordDTO.price(),
                Instant.now());
    }

    public ProductResponseDTO toResponseDTO(ProductModel productModel){
        return new ProductResponseDTO(
                productModel.getId(),
                productModel.getName(),
                productModel.getPrice(),
                productModel.getCreatedOn()
        );
    }
}
