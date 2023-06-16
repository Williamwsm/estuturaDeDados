package DuplamenteEncadeada;

public class Lista<T> {
     No<T> ini;
    No<T> fim;
    int tamanho;

    public void adicionarInicio(T elemento){
        No<T> no = new No<T>();
        no.elemento = elemento;
        no.anterior = null;
        no.proximo = ini;
        ini = no;
        if (ini != null){
            ini.anterior = null;
        }
        if (tamanho == 0){
            fim = ini;
        }
        tamanho++;
    }
    public  void  adicionarUltimo(T elemento){
        No<T> no = new No<T>();
        no.elemento = elemento;
        no.proximo = null;
        no.anterior = fim;
        if (fim != null){
            fim.proximo = no;
        }
        fim  = no;
        if (tamanho == 0){
            ini = fim;
        }
        tamanho++;
   }
   public T removerInicio(){
        if (ini ==  null){
            return  null;
        }
        T out = ini.elemento;
        ini = ini.proximo;
        if(ini != null){
            ini.anterior = null;
        }else{
            fim = null;
        }
        tamanho --;
        return out;
   }
   public T removerFim(){
        if (fim == null){
            return null;
        }
        T out = fim.elemento;
        fim = fim.anterior;
        if (fim != null){
            fim.proximo = null;
        }else {
            ini = null;
        }
        tamanho--;
        return  out;
   }

   public T removerMeio(int indece){
        if (indece < 0 || indece >=  tamanho|| ini == null){
            return  null;
        } else if (indece == 0) {
            return  removerInicio();
        }else if (indece == tamanho-1){
            return removerFim();
        }else {
            No<T>  local = ini;
            for (int i = 0; i < indece; i++) {
                local = local.proximo;
            }
                if (local.anterior !=  null){
                    local.anterior.proximo = local.proximo;
                }
                if (local.proximo != null){
                    local.proximo.anterior = local.anterior;
                }
                tamanho --;
            return local.elemento;
        }
   }

   public void adicionarMeio(int indece, T elemento){
        if (indece <= 0){
            adicionarInicio(elemento);
       } else if (indece >= tamanho){
            adicionarUltimo(elemento);
        }else {
            No local  = ini;
            for(int i = 0; i < indece-1; i ++ ){
                local = local.proximo;
            }
            No no = new No();
            no.elemento = elemento;
            no.anterior= local;
            no.proximo = local.proximo ;
            local.proximo = no;
            no.proximo.anterior = local;
            tamanho++;

        }
   }

    @Override
    public String toString() {
        String str = "["+tamanho+ "] ";
        No local = ini;
        while (local != null){
            str += local.elemento + " ";
            local = local.proximo;
        }
        return  str;
    }
}
