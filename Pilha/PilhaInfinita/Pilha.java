package PilhaInfinita;

public class Pilha <T>{
    private int tamanho;

    private T pilha[];
    private int capacidade;
    private  T novaPilha[];

    public Pilha(int capacidade){
        this.tamanho = 0;
        this.capacidade = capacidade;
        pilha = (T[]) new Object[capacidade];
    }

    public boolean pilhaVazia(){
        return tamanho == 0;
    }

    public  boolean pilhaCheia(){
        return tamanho == capacidade;
    }

    public void empilhar(T dado){
        if (pilhaCheia()){
            modificarPilha(capacidade*2);
        }
        pilha[tamanho] = dado;
        tamanho++;
    }

    public  void desempilhar(){
        if (pilhaVazia()){
            System.out.println("sua pilha estar vazia");
        }else{
            if (tamanho <= capacidade/4){
                modificarPilha(capacidade/2);
            }
            pilha[tamanho]= null;
            tamanho--;
        }
    }

    public T topo(){
        if (pilhaVazia()) {
            return  null;
        }else {
            return pilha[tamanho-1];
        }
    }

    public void modificarPilha(int novaCapacidade){
          novaPilha = (T[])  new Object[novaCapacidade];
          System.arraycopy(pilha, 0, novaPilha, 0, tamanho);// copia os elementos da pilha e coloca na novaPilha
          pilha = novaPilha;
          capacidade = novaCapacidade;

    }
}
