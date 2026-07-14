package com.tongthuan.sportwear_webservices.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tongthuan.sportwear_webservices.entity.Images;
import com.tongthuan.sportwear_webservices.repository.ImagesRepository;
import com.tongthuan.sportwear_webservices.service.serviceInterface.ImagesService;

@Service
public class ImageServiceImpl implements ImagesService {

    @Autowired
    private ImagesRepository imagesRepository;

    @Override
    public List<Images> findByProductId(String productId) {
        return imagesRepository.findByProductId(productId);
    }

    @Override
    public Optional<Images> findFirstByProductId(String productId) {
        return imagesRepository.findFirstImageByProductId(productId);
    }
}
