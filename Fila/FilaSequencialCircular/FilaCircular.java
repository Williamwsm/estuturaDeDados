package FilaSequencialCircular;

public class FilaCircular <T>{
    private int capacidade;
    private  int ini;
    private  int fim;
    private T[] vetorFila;
    private int tamanho;

    public FilaCircular(int capacidade){
        this.capacidade = capacidade;
        ini = 0;
        fim = -1;
        tamanho = 0;
        vetorFila = (T[]) new Object[capacidade];
    }

    public boolean filaVazia(){
        return tamanho == 0;
    }

    public boolean filaCheia(){
        return  tamanho == capacidade;
    }
    public void enfileirar(T elemento){
        if (filaCheia()){
            System.out.println("Nao foi possivel enfileirar. Pois a fila estar cheia.  ");
        }else {
            if (fim == capacidade-1){
                fim = -1;
            }
            fim++;
            vetorFila[fim] = elemento;
            tamanho++;
        }
    }

    public void desenfileirar(){
        if (filaVazia()){
            System.out.println("A fila ja estar vazia");
        }else {
            vetorFila[ini] = null;
            ini++;
            tamanho--;
        }
    }
    public String imprimir(){
        String str = "";
        for (T elemento: vetorFila) {
            if (elemento != null) {
                str += "[" + elemento + "] ";
            }
        }
        return str+"\ninicio: "+ini+"\nfim: "+fim;
    }
}
