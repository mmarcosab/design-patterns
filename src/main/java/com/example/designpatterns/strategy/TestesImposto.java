package com.example.designpatterns.strategy;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 5);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calcular(orcamento, new ISS()));
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS()));
    }

}
