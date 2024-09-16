package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Item;
import org.example.model.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GerenciadorDePedidosTest {

    private GerenciadorDePedidos gerenciador;

    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorDePedidos();
    }

    @Test
    public void testeAdicionarPedido() {
        Pedido pedido1 = new Pedido(1, "Cliente A");
        Pedido pedido2 = new Pedido(2, "Cliente B");

        gerenciador.adicionarPedido(pedido1);
        gerenciador.adicionarPedido(pedido2);

        assertEquals(2, gerenciador.listarPedidos().size()); // Esperando 2 pedidos
    }

    @Test
    public void testeCalcularValorTotal() {
        Pedido pedido = new Pedido(1, "Cliente A");
        pedido.adicionarItem(new Item("Item 1", 10.0, 2));
        pedido.adicionarItem(new Item("Item 2", 5.0, 3));

        gerenciador.adicionarPedido(pedido);

        assertEquals(35.0, gerenciador.calcularValorTotal(1));
    }
}

