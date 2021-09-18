package com.example.designpatterns.chain;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQuinhentos extends Desconto{

    public DescontoValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));  //desconto de 10% acima de 500 reais
        }
        return proximo.calcular(orcamento);
    }


}
