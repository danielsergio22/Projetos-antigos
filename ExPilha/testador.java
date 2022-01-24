package antigos.ExPilha;

public class testador {
  public static void main(String[] args) {
    ListaDeInteiros lista = new ListaDeInteiros(5);

    // Imprimir atributos
    System.out.println("Dados.....: " + lista.dados);
    System.out.println("Tamanho...: " + lista.tamanho);
    System.out.println("Capacidade: " + lista.capacidade);
    System.out.println("Lista Vazia? " + lista.vazia());
    System.out.println("Lista Cheia? " + lista.cheia());

    lista.imprimir();
    lista.adicionaFinal(3);
    lista.imprimir();
    lista.adicionaFinal(27);
    lista.imprimir();
    lista.adicionaFinal(14);
    lista.imprimir();
    lista.adicionaInicio(33);
    lista.imprimir();
    lista.adicionaInicio(12);
    lista.imprimir();
    System.out.println("\nLista Cheia? " + lista.cheia());
    lista.adicionaFinal(5);
    lista.adicionaFinal(12);
    lista.adicionaFinal(7);
    lista.imprimir();

    System.out.println("\nItem removido: " + lista.removeInicio());
    lista.imprimir();
    System.out.println("\nItem removido: " + lista.removeInicio());
    lista.imprimir();
    System.out.println("\nItem removido: " + lista.removeInicio());
    lista.imprimir();
    System.out.println("\nItem removido: " + lista.removeFinal());
    lista.imprimir();
    System.out.println("\nItem removido: " + lista.removeFinal());
    lista.imprimir();
    System.out.println("\nItem removido: " + lista.removeFinal());
    lista.imprimir();
  }
}
