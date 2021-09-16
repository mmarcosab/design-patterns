package com.example.designpatterns.strategy;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 6);
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.println(calculadoraDesconto.calcular(orcamento));
        orcamento = new Orcamento(new BigDecimal("1000"), 3);
        System.out.println(calculadoraDesconto.calcular(orcamento));
    }

}
