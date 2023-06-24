package PilhaSequencial;

public class App {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);
        pilha.desempilhar();
        pilha.empilhar(5);
        pilha.empilhar(4);
        pilha.empilhar(3);
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.empilhar(2);
        pilha.empilhar(1);
        System.out.println(pilha.imprimir());
        pilha.empilhar(55);
        pilha.topo();

    }
}
