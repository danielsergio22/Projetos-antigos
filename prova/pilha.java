package antigos.prova;

import java.util.Arrays;

public class pilha {
    String[] dados;
    int topo;
    int capacidade;
    public pilha(int capacidade){
        topo = -1;
        dados = new String[capacidade];
        this.capacidade = capacidade;
    }
    public boolean cheia(){
        return (topo == capacidade-1);
    }
    public boolean vazia(){
        return (topo == -1);
    }
    public void empilhar(String frase){
        if (cheia()){
            System.out.println("ERRO! Pilha Cheia!");
        } else{
            topo++;
            dados[topo] = frase;
        }
    }
    public String desempilhar(){
        String frase = null;
        if (vazia()){
            System.out.println("ERRO! Pilha Vazia!");
        } else{
            frase = dados[topo];
            dados[topo] = null;
            topo--;
        }
        return frase;
    }
    @Override
    public String toString(){
        return "Pilha [dados=" + Arrays.toString(dados) + 
        ", capacidade=" + capacidade +", topo=" + topo + "]";
    }
}