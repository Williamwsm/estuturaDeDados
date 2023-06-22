package AtvListaEncadeada;

public class TestList {
    public static void main(String[] args) throws Exception {
        ListaDupEnc<Integer> lista = new ListaDupEnc<>();
       lista.incluirInicio(5);
        lista.incluirInicio(9);
        lista.incluir(7,0);
        lista.incluirInicio(8);
        lista.incluir(2,1);
        lista.incluir(1,0);
        lista.incluir(2,5);
        lista.incluirInicio(99);
        System.out.println(lista);
    }
}
