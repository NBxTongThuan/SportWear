package com.tongthuan.sportwear_webservices.dto.response;

import com.tongthuan.sportwear_webservices.constantvalue.Color;
import com.tongthuan.sportwear_webservices.entity.ProductAttributes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductAttributeResponse {
    private String productAttributeId;
    private Color color;
    private String size;
    private int quantity;

    public ProductAttributeResponse(ProductAttributes productAttributes) {
        this.productAttributeId = productAttributes.getProductAttributeId();
        this.color = productAttributes.getColor();
        this.size = productAttributes.getSize();
        this.quantity = productAttributes.getQuantity();
    }
}
