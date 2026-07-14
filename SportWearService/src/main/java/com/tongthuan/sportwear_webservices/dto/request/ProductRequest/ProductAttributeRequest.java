package com.tongthuan.sportwear_webservices.dto.request.ProductRequest;

import com.tongthuan.sportwear_webservices.constantvalue.Color;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductAttributeRequest {

    private Color color;
    private String size;
    private int quantity;
}
