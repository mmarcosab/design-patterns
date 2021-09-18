package com.example.designpatterns.command;

import com.example.designpatterns.observer.ArmazenarPedido;
import com.example.designpatterns.observer.EnviarEmail;
import java.math.BigDecimal;
import java.util.Arrays;



public class TestesPedidos {

    public static void main(String[] args) {
        //vou deixar os dados fixos, mas o certo seria receber por linha de comando, por controller etc
        String cliente = "cliente 1";
        BigDecimal valorOrcamento = new BigDecimal("10000");
        Integer quantidadeItens = 18;

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        //aqui eu defino os interessados
        //injeto as dependencias ali em cima e chamo aqui
        CommandHandler handler = new CommandHandler(Arrays.asList(new ArmazenarPedido(), new EnviarEmail()));

        handler.execute(geraPedido);
        //nota: aqui abrimos mão um pouco dos conceitos de juntar dados e comportamentos em prol de uma melhor
        // organizacao do projeto. esse eh o caso do handler

    }

}
