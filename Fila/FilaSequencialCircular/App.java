package FilaSequencialCircular;

public class App {
    public static void main(String[] args) {


        FilaCircular<Integer> filaCircular = new FilaCircular<>(5);
        filaCircular.enfileirar(5);
        filaCircular.enfileirar(4);
        filaCircular.enfileirar(3);
        filaCircular.desenfileirar();
        filaCircular.enfileirar(2);
        filaCircular.enfileirar(1);
        System.out.println(filaCircular.imprimir());
        filaCircular.enfileirar(0);
        filaCircular.desenfileirar();
        filaCircular.enfileirar(5);
        System.out.println(filaCircular.imprimir());


    }
}
