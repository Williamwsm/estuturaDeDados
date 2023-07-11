package FilaInfinita;

public class Fila <T>{
    private int tamanho;
    private int ini;
    private int fim;
    private int capacidade;
    private T fila[];
    private T novaFila[];

    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.ini =0;
        this.fim =0;
       fila = (T[]) new Object[capacidade];

    }

    public boolean filaCheia(){
        return tamanho == capacidade;
    }

    public boolean filaVazia(){
        return tamanho ==0;
    }

    public void enfileirar(T dado){
        if (filaCheia()){
            modificarFila(capacidade*2);
        }
        fila[fim]= dado;
        fim++;
        tamanho++;
    }

    public void desenfileirar(){
            if (filaVazia()){
                System.out.println("Sua fila estar vazia");
            } else {
                if (tamanho <= capacidade/4) {
                    modificarFila(capacidade/2);
                }
                fila[ini] = null;
                ini++;
                tamanho--;
                capacidade--;
            }
    }

    private void modificarFila(int novaCapacidade){
        novaFila = (T[])  new Object[novaCapacidade];
        System.arraycopy(fila, ini, novaFila, 0, tamanho);
         fila = novaFila;
         capacidade = novaCapacidade;

    }
    public  void imprimir(){
        String str = "";
        for (T item  : fila) {
            str+= " "+item;
        }
        System.out.println(str);
    }
}

