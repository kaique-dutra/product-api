package com.github.ccbkaique_droid.productapi.repository;

import com.github.ccbkaique_droid.productapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product>findByName(String name);
}
