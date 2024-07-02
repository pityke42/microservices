package com.pityke17.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
        @NotNull(message = "Product required")
        Integer productId,
        @NotNull(message = "Quantity required")
        double quantity
) {
}
