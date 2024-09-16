package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.model.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GerenciadorDeContasTest {

    GerenciadorDeContas gerenciador;

    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorDeContas();
        gerenciador.adicionarConta(new Conta(1, "João", 100));
        gerenciador.adicionarConta(new Conta(2, "Maria", 200));
    }

    @Test
    public void testeAdicionarConta() {
        assertNotNull(gerenciador.buscarContaPorNumero(1));
    }

    @Test
    public void testeTransferenciaComSucesso() {
        gerenciador.transferir(1, 2, 50);
        assertEquals(50, gerenciador.buscarContaPorNumero(1).getSaldo());
        assertEquals(250, gerenciador.buscarContaPorNumero(2).getSaldo());
    }

    @Test
    public void testeSaldoInsuficiente() {
        assertThrows(IllegalArgumentException.class, () -> {
            gerenciador.transferir(1, 2, 150);
        });
    }

    @Test
    public void testeTransferenciaComContaInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            gerenciador.transferir(1, 999, 50);
        });
    }
}

