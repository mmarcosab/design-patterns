package com.example.designpatterns.proxy;

import com.example.designpatterns.strategy.Orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.valor = valor;
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if(valor == null){
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }


}
