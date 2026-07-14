package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tongthuan.sportwear_webservices.entity.Brand;

public interface BrandService {

    //   User
    public Optional<Brand> findByProductID(String productId);

    //    Admin
    public Page<Brand> getAllBrand(Pageable pageable);

    public List<Brand> getAllBrands();
}
