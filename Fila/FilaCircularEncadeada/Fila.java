package FilaCircularEncadeada;

public class Fila <T> {
    private int tamanho;
    private No<T> ini;
    private No<T> fim;

    public Fila(){
        tamanho = 0;
        this.ini =null;
        this.fim = null;
    }

    public void enfileirar(T elemento){
        No <T> fila = new No<>();
        fila.elemento = elemento;
        if(filaVazia()){
            ini = fila;
            fim = fila;
        } else {
            fim.prox = fila;
            fila.prox = ini;
            fim = fila;
        }
        tamanho++;

    }
    public void desenfileirar(){
        if(filaVazia()){
            System.out.println("Sua fila estar vazia, voce nao pode remover nenhum item");
        } else {
            this.ini = ini.prox;
            this.fim.prox = ini;
            tamanho--;
        }

    }

    private boolean filaVazia(){
        return tamanho==0;
    }
    public int tamanho(){
        return tamanho;
    }
    public T inicio(){
        if (filaVazia()){
            return null;
        }
        return ini.elemento;
    }

    @Override
    public String toString() {
        if (filaVazia()) {
            return "Fila vazia.";
        }

        StringBuilder sb = new StringBuilder();
        No<T> atual = ini;

        do {
            sb.append(atual.elemento).append(" ");
            atual = atual.prox;
        } while (atual != ini);

        return sb.toString().trim();
    }

}
