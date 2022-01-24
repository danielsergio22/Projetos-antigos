package antigos.prova;

import java.util.Arrays;

public class fila{
	String[] dados;
	int tamanho;
	int capacidade;
	int inicio;
	int fim;
	public fila(int c)
	{
	    capacidade = c;
	    tamanho = 0;
	    dados = new String[c];
	}
	public boolean vazia(){
		return tamanho == 0;
	}
	public boolean cheia(){
		return tamanho == capacidade;
	}
	public void adicionar(String frase){
		if (cheia()){
			System.out.println("ERRO! Fila Cheia!");
		} else{
			dados[fim] = frase;
			fim = (fim+1) % capacidade;
			tamanho++;
		}
	}
	public String remover(){
		String frase = null;
		if (vazia()){
			System.out.println("ERRO! Fila Vazia");
		} else{
			frase = dados[inicio];
			dados[inicio] = null;
			inicio = (inicio+1) % capacidade;
			tamanho--;
		}
		return frase;
	}
	@Override
	public String toString(){
		return "Fila [dados=" + Arrays.toString(dados) + 
				", capacidade=" + capacidade + ", tamanho=" + tamanho
				+ ", inicio=" + inicio + ", fim=" + fim + "]";
	}
}