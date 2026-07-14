package com.tongthuan.sportwear_webservices.dto.response.AdminResponse;

import com.tongthuan.sportwear_webservices.dto.response.UserResponse.UserResponse;
import com.tongthuan.sportwear_webservices.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopBuyerResponse {

    public UserResponse userResponse;
    public long totalBuy;

    public TopBuyerResponse(Users users, long totalBuy) {
        this.userResponse = new UserResponse(users);
        this.totalBuy = totalBuy;
    }
}
