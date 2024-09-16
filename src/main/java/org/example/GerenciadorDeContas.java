package org.example;

import org.example.model.Conta;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeContas {
    private Map<Integer, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarContaPorNumero(int numero) {
        return contas.get(numero);
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
        Conta origem = buscarContaPorNumero(numeroContaOrigem);
        Conta destino = buscarContaPorNumero(numeroContaDestino);

        if (origem == null || destino == null) {
            throw new IllegalArgumentException("Conta inexistente");
        }

        if (origem.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        origem.debitar(valor);
        destino.creditar(valor);
    }
}
