package FilaInfinita;

public class App {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>(4);
        fila.enfileirar(5);
        fila.enfileirar(4);
        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(1);
        fila.enfileirar(6);
        fila.desenfileirar();
        fila.enfileirar(7);
        fila.enfileirar(8);
        fila.imprimir();

    }
}
