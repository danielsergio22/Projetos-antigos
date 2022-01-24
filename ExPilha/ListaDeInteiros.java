package antigos.ExPilha;
public class ListaDeInteiros {
    // Atributos/propriedades
    int[] dados;
    int tamanho;
    int capacidade;
    
    // Método Construtor
    ListaDeInteiros(int c) {
        dados = new int[c];
        capacidade = c;
    }
    
    public boolean vazia(){
        return tamanho == 0;
    }
    
    public boolean cheia(){
        return tamanho == capacidade;
    }
    
    public void adicionaFinal(int item) {
        if (cheia()) {
            System.out.println("Item ("+item+") não incluido! Lista Cheia!");   
        } else {
            dados[tamanho] = item;  // item no final da lista
            tamanho++;              // somando 1 a tamanho
        }
    }
    
    public void adicionaInicio(int item) {
        if (cheia()) {
            System.out.println("Item ("+item+") não incluido! Lista Cheia!");   
        } else {
            for(int i=tamanho;i>0;i--){
                dados[i] = dados[i-1];  // item no final da lista
            }                                       // soma 1 do tamanho
         dados[0] = item;
         tamanho++;
        }
    }
    
    public int removeFinal(){
        int itemRemovido=0;
        if (vazia()) {
            System.out.println("Item não removido! Lista Vazia!");   
        } else {
            
            tamanho--;
            itemRemovido = dados[tamanho]; 
            dados[tamanho] = 0;
           
        }
        return itemRemovido;
    }
    
    public int removeInicio(){
         int itemRemovido=dados[0];
         if (vazia()) {
            System.out.println("Item não removido! Lista Vazia!");   
        } else {
            for(int i = 0; i < tamanho-1 ;i++)
            dados[i] = dados[i+1];
        }
        dados[tamanho-1] = 0;
        tamanho--;
        return itemRemovido;
    }
    public void imprimir() {
        System.out.print("\n[");
        for (int i=0; i < tamanho; i++){
            System.out.print(dados[i]);
            if (i < tamanho-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
    
}