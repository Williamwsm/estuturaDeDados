package PilhaEncadeadaCircular;

public class Pilha <T>{
    private int tamanho;
    private No<T> ultimo;

    public Pilha(){
        tamanho = 0;
        ultimo.anterior= null;
    }

    public void empilhar(T dado){
        No <T> pilha = new No<>();
        pilha.dado = dado;
        if (pilhaVazia()){
            ultimo = pilha; // aponta para ele msm
        }else {
            ultimo.anterior = ultimo; // aponta para apos o topo
            ultimo = pilha;
        }
        tamanho++;
    }
    public void desempilhar(){
        if (pilhaVazia()){
            System.out.println("Sua pilha estar vazia");
        }else if (tamanho == 1){
            ultimo = null;
            System.out.println("pilha vazia");
        }else{
            ultimo = ultimo.anterior;// o topo aponta para o proximo apos o topo
        }
        tamanho--;
    }
    private boolean pilhaVazia(){
        return  tamanho ==0;
    }
    public int tamanho(){
        return tamanho;
    }
    public T topo(){
        if (pilhaVazia()){
            return null;
        }
        return ultimo.dado;
    }
}
