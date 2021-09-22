package com.example.designpatterns.composite;

import com.example.designpatterns.state.EmAnalise;
import com.example.designpatterns.state.Finalizado;
import com.example.designpatterns.state.Situacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento extends com.example.designpatterns.strategy.Orcamento implements Orcavel {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private Situacao situacao;
    private List<Orcavel> itens;

    public Orcamento(BigDecimal valor) {
        this.analisar();
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return itens.size();
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

    public void addItem(Orcavel item){
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }

}

