package com.viniciusysr.auth_api.models.product;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(schema = "TB_PRODUCTS")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private BigDecimal price;
    private Instant createdOn;

    public ProductModel(String name, BigDecimal price, Instant createdOn) {
        this.name = name;
        this.price = price;
        this.createdOn = createdOn;
    }
}
