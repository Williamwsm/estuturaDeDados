package FilaEncadeada;

public class No <T>{
      T dado;
     No<T> prox;


     @Override
     public String toString() {
          if (prox!= null) {
               return "" + dado +"\t"+ prox+"";
          }else {
               return dado+"]";
          }
     }
}
