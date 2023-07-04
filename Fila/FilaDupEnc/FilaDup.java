package FilaDupEnc;

public class FilaDup <T> {
    private int tamanho;
    private  No<T> ini;
    private No<T> fim;

    public FilaDup(){
        tamanho = 0;
        ini.ant = null;
        fim.prox = null;
    }

    public boolean filaVazia(){
        return  tamanho == 0;
    }
    public boolean filaCheia(){
        return tamanho != 0;
    }

    public void enfileirar (T dado){
        No<T> fila = new No<>();
        fila.dado = dado;
        if (filaVazia()){
            ini = fila;
            fim = fila;
            fila.ant = null;
            fila.prox = null;
        }else{
            fim.prox = fila;
            fim.ant = fim;
            fim = fim.prox;
        }
        tamanho++;
    }

    public void desenfileirar(){
        if (filaVazia()){
            System.out.println("SUA FILA ESTAR VAZIA");
        }else {
            ini = ini.prox;
            ini.ant = null;
            tamanho--;
        }


    }
}
