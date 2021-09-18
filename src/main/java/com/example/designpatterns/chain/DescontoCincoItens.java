package com.example.designpatterns.chain;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoCincoItens extends Desconto{

    public DescontoCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));  //desconto de 10% acima de 5 produtos
        }
        return proximo.calcular(orcamento);
    }

}
