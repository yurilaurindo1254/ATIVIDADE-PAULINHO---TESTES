package org.example;

import org.example.model.Item;
import org.example.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDePedidos {
    private List<Pedido> pedidos;

    public GerenciadorDePedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public double calcularValorTotal(int idPedido) {
        return pedidos.stream()
                .filter(pedido -> pedido.getId() == idPedido)
                .flatMap(pedido -> pedido.getItens().stream())
                .mapToDouble(item -> item.getPreco() * item.getQuantidade())
                .sum();
    }
}


