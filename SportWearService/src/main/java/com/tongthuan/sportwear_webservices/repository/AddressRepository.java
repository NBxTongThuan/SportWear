package com.tongthuan.sportwear_webservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tongthuan.sportwear_webservices.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

    @Query("SELECT a FROM Address a WHERE a.user.userName = :userName")
    List<Address> findByUserName(@Param("userName") String userName);

    @Query("DELETE FROM Address a WHERE a.addressId = :addressId")
    void deleteById(@Param("addressId") String addressId);
}
