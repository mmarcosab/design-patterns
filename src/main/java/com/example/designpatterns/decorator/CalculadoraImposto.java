package com.example.designpatterns.decorator;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){

        return imposto.realizarCalculo(orcamento);
    }

}
