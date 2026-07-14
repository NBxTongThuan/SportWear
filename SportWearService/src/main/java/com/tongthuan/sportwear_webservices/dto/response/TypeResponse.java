package com.tongthuan.sportwear_webservices.dto.response;

import com.tongthuan.sportwear_webservices.entity.Types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeResponse {
    private int typeId;
    private String typeName;
    private String categoryName;
    private boolean enable;

    public TypeResponse(Types type) {
        this.typeId = type.getTypeId();
        this.typeName = type.getTypename();
        this.categoryName = type.getCategories().getCategoriesName();
        this.enable = type.isEnable();
    }
}
