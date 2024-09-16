package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private String cliente;
    private List<Item> itens;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }
}

