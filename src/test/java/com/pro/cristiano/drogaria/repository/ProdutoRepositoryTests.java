package com.pro.cristiano.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.pro.cristiano.drogaria.domain.Produto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoRepositoryTests {

    @Autowired
     private ProdutoRepository produtoRepository;
     
     

    @Test
    public void inserir() {
        Produto p1 = new Produto(null, "coca cola", Byte.valueOf("15"), BigDecimal.valueOf(10.50), LocalDate.of(2021,9, 1),null);
        Produto p2 = new Produto(null, "Heiniken", Byte.valueOf("23"), BigDecimal.valueOf(8.00), LocalDate.of(2022,4, 1),null);
        
        produtoRepository.save(p1);
        produtoRepository.save(p2);
    }
}
