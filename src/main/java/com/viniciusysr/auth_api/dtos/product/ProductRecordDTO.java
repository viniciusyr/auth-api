package com.viniciusysr.auth_api.dtos.product;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ProductRecordDTO(@NotBlank String name, @NotBlank BigDecimal price) {
}
