package PilhaDupEnc;

public class PilhaDup <T> {
    private  int tamanho;
    private No<T> fim;

    public PilhaDup(){
        tamanho = 0;
        fim.ant = null;
        fim.prox = null;

    }

    public  boolean pilhaVazia(){
        return tamanho == 0;

    }

     public boolean pilhaCheia(){
        return  tamanho != 0;

     }

     public  void  empilhar(T dado){
        No<T> pilha = new No<>();
        pilha.dado = dado;
         if (pilhaVazia()){
             fim = pilha;
             pilha.ant = null;
             pilha.prox = null;

         }else {
             fim.prox = pilha;
             fim.ant = fim;
             fim = fim.prox;
         }
         tamanho++;
     }

     public void desenpilhar(){
        fim = fim.ant;
        fim.prox = null;
        tamanho--;
     }

     public  T topo(){
        return fim.dado;
     }
}
