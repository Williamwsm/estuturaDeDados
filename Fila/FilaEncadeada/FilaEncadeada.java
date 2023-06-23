package FilaEncadeada;

import java.util.Scanner;

public class FilaEncadeada <T> {
    private No<T> ini;
    private No<T> fim;
    private int tamanho;
     public FilaEncadeada(){
         this.tamanho = 0;
         this.fim = null;
         this.ini = null;
     }

    public void enfileirar(T dado) {
        No <T> fila = new No<T>();
        fila.dado = dado;

        if (filaVazia()){
            this.ini = fila;
        }else {
            this.fim.prox  = fila;
        }
        fim= fila;
        tamanho++;
    }
    public void desenfileirar()  {
        if (filaVazia()){
            System.out.println("Lista vazia");
        }else {
            this.ini = ini.prox;
            tamanho--;
        }
    }

    private boolean filaVazia(){
        return  tamanho==0;
    }
    public int tamanho(){
        return tamanho;
    }
    public T inicio(){
        return ini.dado;
    }


    @Override
    public String toString() {
        return "FilaEncadeada \ttamanho da fila ["+ tamanho +"]\n["+ ini+" " ;
    }
}
