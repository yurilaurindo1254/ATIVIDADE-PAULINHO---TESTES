package org.example;

public class ProcessadorDeTexto {
    public String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder invertida = new StringBuilder();
        for (int i = palavras.length - 1; i >= 0; i--) {
            invertida.append(palavras[i]).append(" ");
        }
        return invertida.toString().trim();
    }

    public String substituirPalavras(String frase, String palavraAntiga, String palavraNova) {
        return frase.replace(palavraAntiga, palavraNova);
    }

    public int contarOcorrenciasDePalavra(String frase, String palavra) {
        String[] palavras = frase.split(" ");
        int contagem = 0;
        for (String p : palavras) {
            if (p.equals(palavra)) {
                contagem++;
            }
        }
        return contagem;
    }
}


