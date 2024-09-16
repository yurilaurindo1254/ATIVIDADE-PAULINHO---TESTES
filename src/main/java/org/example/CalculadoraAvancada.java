package org.example;

public class CalculadoraAvancada {
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número negativo");
        }
        return Math.sqrt(numero);
    }

    public double logaritmoNatural(double numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número deve ser positivo");
        }
        return Math.log(numero);
    }
}

