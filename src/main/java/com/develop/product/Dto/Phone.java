package com.develop.product.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Entity
@Table(name = "product_phone")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phoneId;

    private String phoneName;

    private String brand;

    private String productUrl;

    private String phoneImg;

    private String phonePrice;

    private String rating;

    private String totalReview;

    private String ansAsk;

    private String phoneDesc;

    private String specs;

    private String custReview;


}
