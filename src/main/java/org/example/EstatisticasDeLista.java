package org.example;

import java.util.Collections;
import java.util.List;

public class EstatisticasDeLista {
    public double calcularMedia(List<Double> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Lista vazia");
        }
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.size();
    }

    public double calcularMediana(List<Double> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Lista vazia");
        }
        Collections.sort(numeros);
        int tamanho = numeros.size();
        if (tamanho % 2 == 0) {
            return (numeros.get(tamanho / 2 - 1) + numeros.get(tamanho / 2)) / 2.0;
        } else {
            return numeros.get(tamanho / 2);
        }
    }

    public double calcularDesvioPadrao(List<Double> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Lista vazia");
        }
        double media = calcularMedia(numeros);
        double somaQuadrados = 0;
        for (double num : numeros) {
            somaQuadrados += Math.pow(num - media, 2);
        }
        // Desvio padrão amostral (N - 1)
        return Math.sqrt(somaQuadrados / (numeros.size() - 1));
    }
}

