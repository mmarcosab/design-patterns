package com.example.designpatterns.command;

import com.example.designpatterns.observer.AcaoAposGerarPedido;
import com.example.designpatterns.strategy.Orcamento;

import java.time.LocalDate;
import java.util.List;

public class CommandHandler {

    //aqui eu injeto as dependencias de fato

    List<AcaoAposGerarPedido> acoes;

    public CommandHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        acoes.forEach(a -> a.executar(pedido));

        System.out.println("salvar pedido");
        System.out.println("enviar email");
    }

}
