package antigos.prova;

import java.util.Scanner;

public class mainteste {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[]args){
        int opcao = 0;

        System.out.println("digite a capacidade da pilha");
        pilha novaPilha = new pilha(ler.nextInt());
        System.out.println("digite a capacidade da fila");
        fila novaFila = new fila(ler.nextInt());

        String menu = "\nMenu de teste (1,2 pilha) (3,4 fila)\n"
                          +"0 - ENCERRAR\n"
                          +"1 - Empilhar\n"
                          +"2 - Desempilhar\n"
                          +"3 - Adicionar\n"
                          +"4 - Remover\n";

        do {
            System.out.println(menu);
            System.out.print("Digite a Opção --> ");
            opcao = ler.nextInt();
            switch (opcao){
            case 1:
                System.out.println("digite a palavra que deseja empilhar");
                novaPilha.empilhar(ler.next());
                System.out.println(novaPilha);
                break;
            case 2:
                novaPilha.desempilhar();
                System.out.println(novaPilha);
                break;
            case 3:
                System.out.println("digite a palavra que deseja adicionar");
                novaFila.adicionar(ler.next());
                System.out.println(novaFila);
                break;
            case 4:
                novaFila.remover();
                System.out.println(novaFila);
                break;
            default:
                System.out.println("Opção invalida");
            }
        } while (opcao != 0);
        System.out.println(novaFila);
        System.out.println(novaPilha);
        System.out.println("\nFim do Programa!!!");
    }
}