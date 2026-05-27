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

}
