package com.example.designpatterns.decorator;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS(Imposto segundoImposto) {
        super(segundoImposto);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }

}
