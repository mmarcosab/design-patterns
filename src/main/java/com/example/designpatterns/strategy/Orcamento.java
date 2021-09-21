package com.example.designpatterns.strategy;

import com.example.designpatterns.state.EmAnalise;
import com.example.designpatterns.state.Finalizado;
import com.example.designpatterns.state.Situacao;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private Situacao situacao;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.analisar();
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void calcularDescontoExtra(){
        this.situacao.calcularValorDescontoExtra(this);
    }


    public void aprovar() throws Exception {
        this.situacao.aprovar(this);
    }

    public void reprovar() throws Exception {
        this.situacao.reprovar(this);
    }

    public void finalizar() throws Exception {
        this.situacao.finalizar(this);
    }

    public void analisar(){
        this.situacao = new EmAnalise();
    }

    public boolean isFinalizado(){
        return situacao instanceof Finalizado;
    }

}

