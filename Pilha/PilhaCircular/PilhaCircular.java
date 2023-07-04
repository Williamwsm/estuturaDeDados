package PilhaCircular;

public class PilhaCircular<T> {
    private int tamanho;
    private int ini;
    private int  fim;
    private T [] pilhaCircular;
    private int capacidade;

    public PilhaCircular(int capacidade){
        this.capacidade =(capacidade);
        tamanho = 0;
        fim = -1;
        ini = 0;
        pilhaCircular = (T[]) new Object[capacidade];

    }

    public boolean pilhaCheia(){
        return tamanho == capacidade;
    }
    public boolean pilhaVazia(){
        return tamanho == 0;
    }

    public void empilhar(T elemento){
        if (pilhaCheia()){
            System.out.println("A pilha estar cheia, nao foi possivel adicionar o item");
        }else {
            if (fim == capacidade-1){
                fim = ini;
            }
            fim++;
            pilhaCircular[fim]= elemento;
            tamanho++;
        }
    }

    public void desempilhar(){ 
        if (pilhaVazia()){
            System.out.println("A pilha ja estar vazia");
        }else {
            pilhaCircular[fim] = null;
            fim--;
            tamanho--;
        }
    }

    public T topo(){
       return fim;
    }

    public String imprimir(){
        String str = "";
        for (T elemento: pilhaCircular) {
            if (elemento!= null){
                str += "["+elemento +"] ";
            }

        }
        return str;
    }

}
