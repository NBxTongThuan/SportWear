package com.tongthuan.sportwear_webservices.dto.adminRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductAttributeRequest {
    private String productAttributeId;
    private int quantity;
}
