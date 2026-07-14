package com.tongthuan.sportwear_webservices.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tongthuan.sportwear_webservices.dto.request.UserAccountRequest.UserDetailRequest;
import com.tongthuan.sportwear_webservices.entity.UserDetail;
import com.tongthuan.sportwear_webservices.entity.Users;
import com.tongthuan.sportwear_webservices.repository.UserDetailsRepository;
import com.tongthuan.sportwear_webservices.repository.UsersRepository;
import com.tongthuan.sportwear_webservices.service.serviceInterface.UserDetailService;

@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Optional<UserDetail> findByUserName(String userName) {
        return Optional.of(userDetailsRepository.findByUserName(userName));
    }

    @Transactional
    @Override
    public UserDetail updateUserDetail(UserDetailRequest userDetailsRequest) {

        UserDetail userDetail = userDetailsRepository.findByUserDetailId(userDetailsRequest.getUserDetailId());
        if (userDetail == null) {
            return null;
        }
        userDetail.setUserDetailId(userDetailsRequest.getUserDetailId());
        Users user =
                usersRepository.findByUserName(userDetailsRequest.getUserName()).orElse(null);
        if (user == null) {
            return null;
        }
        userDetail.setUser(user);
        userDetail.setDateOfBirth(userDetailsRequest.getDateOfBirth());
        userDetail.setFirstName(userDetailsRequest.getFirstName());
        userDetail.setLastName(userDetailsRequest.getLastName());
        userDetail.setAddress(userDetailsRequest.getAddress());
        userDetail.setPhoneNumber(userDetailsRequest.getPhoneNumber());
        userDetail.setProvince(userDetailsRequest.getProvince());
        userDetail.setWard(userDetailsRequest.getWard());
        userDetail.setDistrict(userDetailsRequest.getDistrict());
        userDetail.setGender(userDetailsRequest.getGender());
        userDetailsRepository.saveAndFlush(userDetail);
        return userDetail;
    }
}
