package com.example.fabio.dscommerce.repositories;

import com.example.fabio.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
