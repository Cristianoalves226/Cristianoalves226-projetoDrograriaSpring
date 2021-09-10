package com.pro.cristiano.drogaria.repository;

import com.pro.cristiano.drogaria.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Short> {
    
}
