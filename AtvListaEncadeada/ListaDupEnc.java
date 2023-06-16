package AtvListaEncadeada;

public class ListaDupEnc <T extends Comparable<T>> extends Lista<T> {
    private NoDuplo<T> ini;
    private NoDuplo<T> aux;

    @Override
    public void incluir(T elemento) throws Exception {

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        NoDuplo<T> no = new NoDuplo<>();
        no.setDado(elemento);
        if (this.ini == null ) {
            this.ini = no;
            no.setProx(null);
            no.setAnt(null);
            return;
        }else {
            no.setAnt(null);
            no.setProx(this.ini);
            this.ini.setAnt(no);
            this.ini = no;
            return;
        }
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        int cont = 0;
        this.aux = this.ini;

        if ( posicao == 0) {
           incluirInicio(elemento);
        }else {
            NoDuplo<T> no = new NoDuplo<>();
            no.setDado(elemento);
            while (this.aux != null) {
                if (cont == posicao) {
                    no.setAnt(aux.getAnt());
                    aux.getAnt().setProx(no);
                    aux.setAnt(no);
                    no.setProx(aux);
                    return;
                } else {
                    cont++;
                    this.aux = this.aux.getProx();
                }
            }
            if (cont != posicao) {
                throw new Exception("Impossível adicionar seu número , porque a lista tem menos posições ou está vazia");
            }
        }

    }

    @Override
    public T get(int posicao) throws Exception {
        return null;
    }

    @Override
    public int get(T elemnto) throws Exception {
        return 0;
    }

    @Override
    public void remover(int posicao) throws Exception {

    }

    @Override
    public void limpar() {

    }

    @Override
    public int getTamanho() {
        return 0;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        return false;
    }

    @Override
    public Lista<T> subLista(int posicaoInicial, int posicaoFinal) throws Exception {
        ListaDupEnc<T> subLista = new ListaDupEnc<>();
        int cont = 0;
        this.aux = this.ini;
        while(this.aux != null && cont <= posicaoFinal){
            if((cont >= posicaoInicial)){
                subLista.incluir(this.aux.getDado());
                cont++;
                this.aux =this.aux.getProx();

            }
            else{
                cont++;
                this.aux = this.aux.getProx();
            }
        }
        if(cont < posicaoFinal){
            throw new Exception("Lista menoir que a posição final encontrada");
        }

        return subLista;
    }
    @Override
    public String toString() {
        return  "["+ ini +"\t";
    }

}