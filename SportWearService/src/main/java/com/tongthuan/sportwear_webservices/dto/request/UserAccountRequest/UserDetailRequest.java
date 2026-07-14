package com.tongthuan.sportwear_webservices.dto.request.UserAccountRequest;

import java.sql.Date;

import com.tongthuan.sportwear_webservices.constantvalue.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailRequest {

    private String userDetailId;
    private String userName;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String avatar;
    private Date dateOfBirth;
    private String phoneNumber;
    private String province;
    private String district;
    private String ward;
    private String address;
}
