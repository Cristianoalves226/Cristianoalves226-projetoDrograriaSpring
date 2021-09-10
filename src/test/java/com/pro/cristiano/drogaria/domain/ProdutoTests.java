package com.pro.cristiano.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {
    @Test
    public void criar() {
        Produto p = new Produto(Short.valueOf("1"), "coca cola", Byte.valueOf("15"), BigDecimal.valueOf(10.50), LocalDate.of(2021,9, 1),null);
        System.out.println(p);
    }
}
