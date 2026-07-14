package com.tongthuan.sportwear_webservices.dto.response.AdminResponse;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterestByDateResponse {
    private LocalDate date;
    private Long total;
}
