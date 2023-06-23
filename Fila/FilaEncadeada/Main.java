package FilaEncadeada;

public class Main {
    public static void main(String[] args) {
        FilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
        fila.desenfileirar();
        fila.enfileirar(5);
        fila.enfileirar(4);
        fila.enfileirar(7);
        fila.enfileirar(1);
        fila.desenfileirar();
        System.out.println(fila);
    }
}
