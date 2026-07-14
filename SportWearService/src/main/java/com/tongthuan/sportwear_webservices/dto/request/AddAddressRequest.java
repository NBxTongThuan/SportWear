package com.tongthuan.sportwear_webservices.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAddressRequest {
    private String toName;
    private String toPhone;
    private String toDistrict;
    private String toProvince;
    private String toWard;
    private String toAddress;
}
