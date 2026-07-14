package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tongthuan.sportwear_webservices.dto.request.ReviewRequest.AddReviewRequest;
import com.tongthuan.sportwear_webservices.dto.request.ReviewRequest.UpdateReviewRequest;
import com.tongthuan.sportwear_webservices.entity.Reviews;

public interface ReviewsService {
    List<Reviews> findByProductId(String productId);

    boolean addReviews(AddReviewRequest reviewRequest);

    Reviews findByOrderItemId(String orderItemId);

    boolean updateReview(UpdateReviewRequest updateReviewRequest);

    // Admin

    public Page<Reviews> getAllReview(Pageable pageable);
}
