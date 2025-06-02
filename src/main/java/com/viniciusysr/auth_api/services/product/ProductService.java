package com.viniciusysr.auth_api.services.product;

import com.viniciusysr.auth_api.dtos.product.ProductRecordDTO;
import com.viniciusysr.auth_api.dtos.product.ProductResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    ProductResponseDTO createProduct(ProductRecordDTO productRecordDTO);
}
