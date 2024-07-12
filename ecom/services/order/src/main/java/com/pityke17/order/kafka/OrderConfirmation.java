package com.pityke17.order.kafka;

import com.pityke17.order.customer.CustomerResponse;
import com.pityke17.order.payment.PaymentMethod;
import com.pityke17.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod  paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
