package FilaInfinita;

public class Fila<T> {
    private  int tamanho;
    private int capacidade;
    private int ini;
    private int fim;
    private T fila[];
    private T novaFila[];
    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.fim = -1;
        this.ini =0;
        fila = (T[])  new Object[capacidade];

    }

    public boolean filaCheia(){
        return tamanho == capacidade;
    }
    public  boolean filaVazia(){
        return tamanho == 0;
    }

    public  void enfileirar(T dado){
        if (filaCheia()){
            modificarFila(capacidade*2);
            fim = tamanho-1;
        }
        fim = (fim +1)% capacidade;
        fila[fim] = dado;
        tamanho++;
    }

    public void desenfileirar(){
        if (filaVazia()){
            System.out.println(" sua fila ja estar vazia");
        }else{
            if (tamanho <= capacidade/4){
                modificarFila(capacidade/2);
            }
            fila[ini]= null;
            ini = (ini+1)%capacidade;
            tamanho--;
        }
    }

    public void modificarFila(int tamanho){
        int novaCapacidade = tamanho;
        novaFila = (T[]) new Object[tamanho];
        System.arraycopy(fila, 0, novaFila, 0,capacidade);
        fila =  novaFila;
        capacidade = novaCapacidade;
    }

}
