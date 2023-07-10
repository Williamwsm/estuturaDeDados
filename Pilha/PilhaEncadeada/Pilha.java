package PilhaEncadeada;

public class Pilha <T> {
    private int tamanho;
    private No<T> ultimo;

    public Pilha() {
        tamanho = 0;
        ultimo.anterior = null;
    }

    public void empilhar(T elemento) {
        No<T> pilha = new No<>();
        pilha.elemento = elemento;
        if (pilhaVazia()) {
            ultimo = pilha;
        } else {
            ultimo.anterior = ultimo;
            ultimo = pilha;
        }
        tamanho++;

    }

    public void desempilhar() {
        if (pilhaVazia()) {
            System.out.println("Nao foi possivel remover a pilha, pois ela estar vazia");
        } else if (tamanho == 1) {
            ultimo = null;
            tamanho--;
            System.out.println("Sua lista estar vazia");

        } else {
            ultimo = ultimo.anterior;
            tamanho--;
        }
    }

    public boolean pilhaVazia() {
        return tamanho == 0;
    }

    public T topo() {
        return ultimo.elemento;
    }


}
