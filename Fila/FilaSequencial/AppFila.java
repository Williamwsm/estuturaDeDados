package FilaSequencial;

public class AppFila<T> {
    public static void main(String[] args) {
    Fila<Integer>  fila = new Fila<>(5);
    fila.desenfileirar();
    fila.enfileirar(5);
    fila.enfileirar(4);
    fila.enfileirar(3);
    fila.enfileirar(2);
    fila.enfileirar(1);
    fila.desenfileirar();
    fila.enfileirar(55);
    System.out.println(fila.imprimirFila());
    }
}
