package com.loja.loja.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GenericRepository<T extends GenericEntity, L extends UUID> extends JpaRepository<T, UUID> {
}