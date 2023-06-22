package ListaSequencial;

public class SequencialList {
    int posicao;
    int posicaoRemovida;
    int posicaoVazia;
    private int [] elemento;

    public SequencialList (int capacidade){
        this.elemento = new int[capacidade];
    }

    public int[] getElemento() {
        return elemento;
    }

    public void setElemento(int[] elemento) {
        this.elemento = elemento;
    }

    public void adicionarInicio(int num){
        if (elemento[0] == 0){
            this.elemento[0] = num;
            posicaoVazia++;
        } else if (elemento[posicaoRemovida] == 0) {
            this.elemento[posicaoRemovida] = elemento[0];
            this.elemento[0] = num;
        } else if (posicaoVazia < elemento.length) {
            this.elemento[posicaoVazia] = elemento[0];
            this.elemento[0] = num;
            posicaoVazia++;
        } else {
            this.elemento[0] = num;
        }
    }

    public void adicionarUltimo(int num){
        int ultimo = this.elemento.length-1;
        if ( posicaoVazia < elemento.length){
            this.elemento[posicaoVazia] = num;
            posicaoVazia++;
        } else if (elemento[posicaoRemovida] == 0) {
            this.elemento[posicaoRemovida] = elemento[ultimo];
            this.elemento[ultimo] = num;
        } else {
            this.elemento[ultimo] = num;
        }
    }

    public int remover(int apagarPosicao){
        if (apagarPosicao >= elemento.length){
            System.out.println("A posicao: "+apagarPosicao+" ,nao foi encontrada na lista");
            return posicaoRemovida = 0;
        }else {
            this.elemento[apagarPosicao] = 0;
            return posicaoRemovida = apagarPosicao;
        }

    }
    public void listar(){
        for (int item:elemento) {
            System.out.print(item+" ");
        }
        System.out.println("\n");

    }

    public void buscar(int numBuscado){
        boolean posicaoEncontrada = false;
        for (int item:elemento) {
            if (item == numBuscado){
                System.out.println("O numero: "+numBuscado+" foi enontrado na posicao: "+posicao+" da lista ");
                posicaoEncontrada =  true;
                break;
            }
            posicao++;
        }
        if (posicaoEncontrada == false){
            System.out.println("O numero: "+numBuscado+" nao estar na lista");
        }
    }
}

