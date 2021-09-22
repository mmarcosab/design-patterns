package com.example.designpatterns.proxy;

import com.example.designpatterns.composite.Orcamento;

import java.math.BigDecimal;

public class TestesProxy {

    public static void main(String[] args) {
        Orcamento novo = new Orcamento(new BigDecimal("500"));
        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        //cria uma camada que guarda em cache, pode executar validacoes etc
        //o proprio hibernate tem o conceito de proxy
        //dois bons motivos para usar o proxy: performance e segurança
        System.out.println(proxy.getValor());
    }



}
