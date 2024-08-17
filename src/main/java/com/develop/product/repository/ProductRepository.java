package com.develop.product.repository;

import com.develop.product.Dto.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Phone, Long> {

}
