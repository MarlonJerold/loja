package com.loja.loja.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface ProductRepository extends JpaRepository<Product, UUID> {
}