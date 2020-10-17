package com.mystyle.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystyle.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
