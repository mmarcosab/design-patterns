package com.example.designpatterns.state;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends Situacao{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

}
