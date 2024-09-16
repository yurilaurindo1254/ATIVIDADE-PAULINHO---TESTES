package org.example.model;

public class Conta {
    private int numero;
    private double saldo;
    private String nomeTitular;

    public Conta(int numero, String nomeTitular, double saldoInicial) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valor) {
        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public void creditar(double valor) {
        saldo += valor;
    }
}

