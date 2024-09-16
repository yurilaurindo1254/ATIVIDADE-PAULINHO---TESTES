package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraAvancadaTest {

    CalculadoraAvancada calculadora = new CalculadoraAvancada();

    @Test
    public void testePotencia() {
        assertEquals(8.0, calculadora.potencia(2, 3));
    }

    @Test
    public void testeRaizQuadrada() {
        assertEquals(4.0, calculadora.raizQuadrada(16));
    }

    @Test
    public void testeLogaritmoNatural() {
        assertEquals(0.0, calculadora.logaritmoNatural(1));
    }

    @Test
    public void testeExcecoes() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.raizQuadrada(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.logaritmoNatural(0);
        });
    }
}
