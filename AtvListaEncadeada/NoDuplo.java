package AtvListaEncadeada;

public class NoDuplo<T> {
    public T dado;
    public NoDuplo<T> prox;
    public NoDuplo<T> ant;

    public NoDuplo<T> getProx() {
        return prox;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public void setProx(NoDuplo<T> prox) {
        this.prox = prox;
    }

    public NoDuplo<T> getAnt() {
        return ant;
    }

    public void setAnt(NoDuplo<T> ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        if (prox != null) {
            return dado +
                    "|" + prox;
        }else {
            return dado+"]";
        }
    }
}
