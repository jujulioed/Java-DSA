package com.jujulioed.javadsa.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Jeito 1: não otimizado
    // public void adiciona(String elemento) {
    //     for (int i = 0; i < this.elementos.length; i++) {
    //         if (this.elementos[i] == null) {
    //             this.elementos[i] = elemento;
    //             break;
    //         }
    //     }
    // }

    public boolean adiciona(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for(int i = 0; i < this.tamanho - 1; i++) {
            sb.append(elementos[i]);
            sb.append(", ");
        }

        if (this.tamanho > 0) {
            sb.append(elementos[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

}
