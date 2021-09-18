package com.example.designpatterns.template;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

//Encerra o ciclo
public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }

}