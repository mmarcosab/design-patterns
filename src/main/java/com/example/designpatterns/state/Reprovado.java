package com.example.designpatterns.state;

import com.example.designpatterns.strategy.Orcamento;


public class Reprovado extends Situacao {

    //nao tem desconto

    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

}
