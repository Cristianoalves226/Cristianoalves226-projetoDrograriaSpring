package com.pro.cristiano.drogaria.service;

import com.pro.cristiano.drogaria.domain.Categoria;
import com.pro.cristiano.drogaria.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscarPorCodigo(Short codigo){
        Optional<Categoria> resultado  =  categoriaRepository.findById(codigo);
        if (resultado.isEmpty()) {
            throw new RuntimeException("Categoria não encontarda");
        }
        Categoria categoria = resultado.get();
        return categoria;
    }
}
