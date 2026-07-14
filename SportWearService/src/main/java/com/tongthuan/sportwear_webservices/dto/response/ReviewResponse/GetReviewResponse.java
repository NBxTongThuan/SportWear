package com.tongthuan.sportwear_webservices.dto.response.ReviewResponse;

import java.sql.Date;

import com.tongthuan.sportwear_webservices.constantvalue.Color;
import com.tongthuan.sportwear_webservices.entity.Reviews;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetReviewResponse {

    private String reviewId;
    private double rating;
    private String comment;
    private Date createdDate;
    private boolean isEdited;
    private String userName;
    private Color color;
    private String size;

    public GetReviewResponse(Reviews reviews) {
        this.reviewId = reviews.getReviewId();
        this.rating = reviews.getRating();
        this.comment = reviews.getComment();
        this.createdDate = reviews.getCreatedDate();
        this.isEdited = reviews.isEdited();
        this.userName = reviews.getUser().getUserName();
        this.color = reviews.getProductAttribute().getColor();
        this.size = reviews.getProductAttribute().getSize();
    }
}
