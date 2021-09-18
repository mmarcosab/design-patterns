package com.example.designpatterns.state;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public abstract class Situacao {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento) throws Exception {
        throw new Exception("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) throws Exception {
        throw new Exception("Orcamento nao pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento)throws Exception {
        throw new Exception("Orcamento nao pode ser finalizado");
    }

}
