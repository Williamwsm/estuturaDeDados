package ListaSequencial;

public class TestSequencial {
    public static void main(String[] args) {
        SequencialList sequencialList = new SequencialList(5);
        sequencialList.adicionarInicio(5);
        sequencialList.adicionarInicio(6);
        sequencialList.adicionarUltimo(9);
        sequencialList.adicionarUltimo(8);
        sequencialList.adicionarInicio(1);
        sequencialList.adicionarInicio(2);

        sequencialList.remover(3);
        sequencialList.adicionarInicio(55);
        sequencialList.remover(9);
        sequencialList.adicionarUltimo(88);





        sequencialList.listar();
        sequencialList.buscar(8);


    }
}
