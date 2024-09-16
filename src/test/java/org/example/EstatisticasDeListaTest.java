package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

public class EstatisticasDeListaTest {

    EstatisticasDeLista estatisticas = new EstatisticasDeLista();

    @Test
    public void testeCalcularMedia() {
        assertEquals(5.0, estatisticas.calcularMedia(Arrays.asList(4.0, 5.0, 6.0)));
    }

    @Test
    public void testeCalcularMediana() {
        assertEquals(5.0, estatisticas.calcularMediana(Arrays.asList(3.0, 5.0, 7.0)));
    }

    @Test
    public void testeCalcularDesvioPadrao() {
        assertEquals(1.0, estatisticas.calcularDesvioPadrao(Arrays.asList(4.0, 5.0, 6.0)));
    }

    @Test
    public void testeListaVazia() {
        assertThrows(IllegalArgumentException.class, () -> {
            estatisticas.calcularMedia(Collections.emptyList());
        });
    }
}

