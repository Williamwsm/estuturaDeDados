package PilhaCircular;

public class App {
    public static void main(String[] args) {
        PilhaCircular<Integer> pilha = new PilhaCircular<Integer>(5);
        pilha.desempilhar();
        pilha.empilhar(5);
        pilha.empilhar(4);
        pilha.empilhar(3);
        pilha.desempilhar();
        pilha.desempilhar();
        System.out.println(pilha.imprimir());
        pilha.empilhar(2);
        pilha.empilhar(1);
        pilha.empilhar(55);
        pilha.empilhar(22);
        pilha.empilhar(6);
        System.out.println(pilha.imprimir());
        pilha.topo();
    }
}
