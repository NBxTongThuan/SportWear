package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;

import com.tongthuan.sportwear_webservices.dto.UpdateAddressRequest;
import com.tongthuan.sportwear_webservices.dto.request.AddAddressRequest;
import com.tongthuan.sportwear_webservices.entity.Address;

public interface AddressService {

    boolean AddAddress(AddAddressRequest addAddressRequest, HttpServletRequest request);

    boolean updateAddress(UpdateAddressRequest updateAddressRequest, HttpServletRequest request);

    List<Address> findByUser(HttpServletRequest request);

    boolean deleteAddress(String addressId, HttpServletRequest request);
}
