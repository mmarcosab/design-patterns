package com.example.designpatterns.template;

import com.example.designpatterns.chain.CalculadoraDesconto;
import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 6);
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
        System.out.println(calculadoraDesconto.calcular(orcamento));
        orcamento = new Orcamento(new BigDecimal("800"), 3);
        System.out.println(calculadoraDesconto.calcular(orcamento));
    }



}
