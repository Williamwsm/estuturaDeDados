package DuplamenteEncadeada;

public class AppLista {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.adicionarInicio(55);
        lista.adicionarInicio(1);
        lista.adicionarInicio(5);
        lista.adicionarInicio(9);
        System.out.println(lista);
    }
}
