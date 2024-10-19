package com.loja.loja.product;

import com.loja.loja.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService {

    private final GenericRepository<Product, UUID> productGenericRepository;

    @Autowired
    public ProductService(GenericRepository<Product, UUID> productGenericRepository) {
        this.productGenericRepository = productGenericRepository;
    }

    public void createProduct(Product product) {
        productGenericRepository.save(product);
    }
}
