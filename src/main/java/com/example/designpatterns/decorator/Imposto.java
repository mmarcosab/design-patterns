package com.example.designpatterns.decorator;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    //segundo imposto
    private Imposto segundoImposto;

    public Imposto(Imposto segundoImposto) {
        this.segundoImposto = segundoImposto;
    }

    //cada classe deve implementar esse metodo
    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto =  realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if(segundoImposto != null){
            valorOutroImposto = segundoImposto.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }
}
