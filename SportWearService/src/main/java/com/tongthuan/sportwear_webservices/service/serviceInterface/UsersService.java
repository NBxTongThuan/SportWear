package com.tongthuan.sportwear_webservices.service.serviceInterface;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tongthuan.sportwear_webservices.dto.response.AdminResponse.TopBuyerResponse;
import com.tongthuan.sportwear_webservices.dto.response.AdminResponse.UserStatsResponse;
import com.tongthuan.sportwear_webservices.entity.Users;

public interface UsersService extends UserDetailsService {
    public Page<Users> findAllUsersPage(Pageable pageable);

    public boolean checkExistsByUserName(String userName);

    public boolean checkExistsByEmail(String email);

    Users findByUserName(String userName);

    // admin
    public UserStatsResponse getUserStats();

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    Page<TopBuyerResponse> findTopBuyer(Pageable pageable);
}
