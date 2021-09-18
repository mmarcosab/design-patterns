package com.example.designpatterns.observer;

import com.example.designpatterns.command.Pedido;

public interface AcaoAposGerarPedido {
    void executar(Pedido pedido);
}
