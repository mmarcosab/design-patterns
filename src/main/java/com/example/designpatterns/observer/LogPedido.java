package com.example.designpatterns.observer;

import com.example.designpatterns.command.Pedido;

public class LogPedido implements AcaoAposGerarPedido {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("log de pedido");
    }
}
