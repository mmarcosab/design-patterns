package com.example.designpatterns.template;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQuinhentos extends Desconto {

    public DescontoValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return proximo.efetuarCalculo(orcamento);
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }


}
