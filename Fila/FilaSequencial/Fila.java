package FilaSequencial;

public class Fila <T>{
    private int tamanhoMaximo;
    private int tamanhoAtual;
    private int ini;
    private int ultimo;
    private T [] vetorFila;

    public Fila (int tamanho){
        tamanhoMaximo = tamanho;
        vetorFila = (T[])  new Object[tamanhoMaximo];
        tamanhoAtual = 0;
        ini = 0;
        ultimo = -1;

    }

    public void enfileirar(T dado){
        if (filaCheia()){
            System.out.println("A fila estar cheia. Nao é possivel enfileirar mais um elemento ");
            return;
        }else {
            ultimo++;
            vetorFila[ultimo] = dado;
            tamanhoAtual++;
        }
    }
    public void desenfileirar(){
        if (filaVazia()){
            System.out.println("Nao é possivel desenfileirar um item da fila, pois ela estar vazia");
            return;
        }else {
            vetorFila[ini] = null;
            ini++;
            tamanhoAtual--;
            tamanhoMaximo--;
        }
    }
    private   boolean filaCheia(){
        return tamanhoAtual == tamanhoMaximo;
    }

    private   boolean filaVazia(){

        return tamanhoAtual ==0;
    }
    public int tamanho(){
        return tamanhoAtual;
    }
    public String imprimirFila(){
        String str = "";
        for (T elemento:vetorFila) {
            if (elemento != null){
                str+= "["+elemento+"] ";
            }
        }
        return str;
    }
}
