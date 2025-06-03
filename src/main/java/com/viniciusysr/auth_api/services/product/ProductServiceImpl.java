package com.viniciusysr.auth_api.services.product;

import com.viniciusysr.auth_api.dtos.product.ProductRecordDTO;
import com.viniciusysr.auth_api.dtos.product.ProductResponseDTO;
import com.viniciusysr.auth_api.factories.product.ProductFactory;
import com.viniciusysr.auth_api.models.product.ProductModel;
import com.viniciusysr.auth_api.repositories.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    private final ProductFactory productFactory;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductFactory productFactory) {
        this.productRepository = productRepository;
        this.productFactory = productFactory;
    }

    @Override
    public ProductResponseDTO createProduct(ProductRecordDTO productRecordDTO) {
        if(productRecordDTO == null){
            throw new RuntimeException("Product DTO is null");
        }

        ProductModel product = productFactory.createProduct(productRecordDTO);
        productRepository.save(product);

        return productFactory.toResponseDTO(product);
    }
}
