package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProcessadorDeTextoTest {

    ProcessadorDeTexto processador = new ProcessadorDeTexto();

    @Test
    public void testeInverterPalavras() {
        assertEquals("mundo olá", processador.inverterPalavras("olá mundo"));
    }

    @Test
    public void testeSubstituirPalavras() {
        assertEquals("olá universo", processador.substituirPalavras("olá mundo", "mundo", "universo"));
    }

    @Test
    public void testeContarOcorrencias() {
        assertEquals(2, processador.contarOcorrenciasDePalavra("olá mundo olá", "olá"));
    }

    @Test
    public void testeStringsVaziasENulas() {
        assertEquals("", processador.inverterPalavras(""));
        assertThrows(NullPointerException.class, () -> {
            processador.inverterPalavras(null);
        });
    }
}

