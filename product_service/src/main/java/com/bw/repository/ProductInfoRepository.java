package com.bw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pojo.ProductInfo;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findAllByProductStatusAndCategoryType(Integer status, Integer type);
}
