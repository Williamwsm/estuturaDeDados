package PilhaSequencial;

public class Pilha <T> {
    private int tamanho;
    private int tamanhoMaximo;
    private T [] pilha;
    private int fim;

    public Pilha(int capacidade){
        tamanho = 0;
        tamanhoMaximo = capacidade;
        pilha = (T[]) new Object[tamanhoMaximo];
        fim = -1;
    }

    public boolean pilhaChiea(){
        return tamanho == tamanhoMaximo;
    }
    public boolean pilhaVazia(){
        return tamanho == 0;
    }

    public void empilhar(T elemento){
        if (pilhaChiea()){
            System.out.println("Nao foi possivel empilhar o elemento. pois a pilha estar cheia");
        }else {
            fim++;
            pilha[fim] = elemento;
            tamanho++;
        }
    }

    public void desempilhar(){
        if (pilhaVazia()){
            System.out.println("A sua pilha ja estar vazia");
        }else {
            pilha[fim] = null;
            fim--;
            tamanho--;
            tamanhoMaximo--;
        }
    }

    public void topo(){
        if (pilhaVazia()){
            System.out.println("pilha vazia");
        }else {
            System.out.println("O topo da pilha é: " +fim);
        }

    }


    public String imprimir(){
         String str = "";
        for (T elelmento: pilha) {
            if (elelmento != null){
                str+="["+elelmento+"] ";
            }
        }
         return str ;
    }
}
