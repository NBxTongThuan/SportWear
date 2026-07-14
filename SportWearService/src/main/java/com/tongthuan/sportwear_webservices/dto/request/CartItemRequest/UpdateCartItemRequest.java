package com.tongthuan.sportwear_webservices.dto.request.CartItemRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCartItemRequest {
    private String cartItemId;
    private int quantity;
}
