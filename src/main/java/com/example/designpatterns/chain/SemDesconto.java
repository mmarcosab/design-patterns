package com.example.designpatterns.chain;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

//Encerra o ciclo
public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

}
