package com.tongthuan.sportwear_webservices.dto.request.OrderRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemRequest {
    private Long price;
    private int quantity;
    private String productAttributeId;
}
