package com.example.designpatterns.strategy;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));  //desconto de 10% acima de 5 produtos
        }
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));  //desconto de 10% acima de 500 reais
        }
        return BigDecimal.ZERO;
    }


}
