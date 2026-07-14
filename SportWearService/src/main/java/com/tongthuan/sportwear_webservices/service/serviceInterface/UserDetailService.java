package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.util.Optional;

import com.tongthuan.sportwear_webservices.dto.request.UserAccountRequest.UserDetailRequest;
import com.tongthuan.sportwear_webservices.entity.UserDetail;

public interface UserDetailService {

    public Optional<UserDetail> findByUserName(String userName);

    UserDetail updateUserDetail(UserDetailRequest userDetailsRequest);
}
