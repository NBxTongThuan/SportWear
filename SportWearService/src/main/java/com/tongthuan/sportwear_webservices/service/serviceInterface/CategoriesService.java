package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tongthuan.sportwear_webservices.dto.adminRequest.AddCategoryRequest;
import com.tongthuan.sportwear_webservices.dto.adminRequest.UpdateCategoryRequest;
import com.tongthuan.sportwear_webservices.entity.Categories;

public interface CategoriesService {

    Page<Categories> findAllPage(Pageable pageable);

    List<Categories> findALl();

    boolean checkExistsByCategoryName(String categoryName);

    boolean addCategory(AddCategoryRequest addCategoryRequest);

    boolean deleteCategory(int categoryId);

    boolean updateCategory(UpdateCategoryRequest updateCategoryRequest);

    boolean enableCategory(int categoryId);

    Optional<Categories> findById(int categoryId);

    Categories findByName(String categoryName);

    Page<Categories> findTopCategoriesByProductCount(Pageable pageable);
}
