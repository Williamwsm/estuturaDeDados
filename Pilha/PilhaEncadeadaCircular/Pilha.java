package PilhaEncadeadaCircular;

public class Pilha <T>{
    private int tamanho;
    private No<T> ultimo;

    public Pilha(){
        tamanho = 0;
        ultimo.proximo= null;
    }

    public void empilhar(T dado){
        No <T> pilha = new No<>();
        pilha.dado = dado;
        if (pilhaVazia()){
            pilha.proximo =  pilha; // aponta para ele msm
        }else {
            pilha.proximo = ultimo.proximo = pilha; // aponta para apos o topo
        }
        ultimo = pilha; //o no se torna o topo
        tamanho++;
    }
    public void desempilhar(){
        if (pilhaVazia()){
            System.out.println("Sua pilha estar vazia");
        }else if (tamanho == 1){
            ultimo = null;
            System.out.println("pilha vazia");
        }else{
            ultimo = ultimo.proximo.proximo;// o topo aponta para o proximo apos o topo
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
