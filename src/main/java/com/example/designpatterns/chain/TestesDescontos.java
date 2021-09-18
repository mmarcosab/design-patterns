package com.example.designpatterns.chain;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("700"), 6);
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.println(calculadoraDesconto.calcular(orcamento));
        orcamento = new Orcamento(new BigDecimal("900"), 3);
        System.out.println(calculadoraDesconto.calcular(orcamento));
    }



}
