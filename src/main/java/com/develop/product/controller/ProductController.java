package com.develop.product.controller;

import com.develop.product.Dto.Phone;
import com.develop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * Get all products.
     *
     * @return the ResponseEntity with status 200 (OK) and with body of the list of products
     */
    @GetMapping("/products/phones")
    public List<Phone> getAllPhones() {
        return productService.getAllPhones();
    }

    @GetMapping("/products/phones/{id}")
    public Phone getPhoneById(@PathVariable("id") Long phoneId) {
        return productService.getPhoneById(phoneId);
    }

}
