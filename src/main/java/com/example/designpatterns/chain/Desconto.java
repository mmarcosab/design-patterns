package com.example.designpatterns.chain;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

//criar a classe abstrata
public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    //forca as classes que herdam a ter esse metodo
    public abstract BigDecimal calcular(Orcamento orcamento);

}
