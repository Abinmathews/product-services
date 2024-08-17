package com.develop.product.service;

import com.develop.product.Dto.Phone;
import com.develop.product.exception.ProductNotFoundException;
import com.develop.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.develop.product.constant.ErrorConstant.PRODUCT_NOT_FOUND_WITH_ID;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public List<Phone> getAllPhones() {
        return productRepository.findAll();
    }

    public Phone getPhoneById(Long phoneId) {
        return productRepository.findById(phoneId).orElseThrow(() -> new ProductNotFoundException(PRODUCT_NOT_FOUND_WITH_ID + phoneId));
    }
}
