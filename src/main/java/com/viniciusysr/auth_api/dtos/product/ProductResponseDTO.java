package com.viniciusysr.auth_api.dtos.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductResponseDTO {

    private UUID id;
    private String name;
    private BigDecimal price;
    private Instant createdOn;

}

