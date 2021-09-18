package com.example.designpatterns.template;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

//criar a classe abstrata
public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    //o if veio pra ca
    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        } else {
            return proximo.calcular(orcamento);
        }
    }


    //forca as classes que herdam a ter esse metodo
    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);

}
