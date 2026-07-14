package com.tongthuan.sportwear_webservices.dto.adminRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTypeRequest {

    private int typeId;
    private String typeName;
    private String categoryName;
}
