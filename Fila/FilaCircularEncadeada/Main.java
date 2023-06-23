package FilaCircularEncadeada;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.desenfileirar();
        fila.enfileirar(5);
        fila.enfileirar(4);
        fila.enfileirar(3);
        fila.desenfileirar();
        fila.inicio();
        fila.tamanho();
        System.out.println(fila);
    }
}
