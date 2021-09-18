package com.example.designpatterns.chain;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoCincoItens(
                new DescontoValorMaiorQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }


}
