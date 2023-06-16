package Recursividade_Fibonacce;

public class Fibonacce {
    static int calcularSequencia(int n ){
        if (n<2){
            return 1;
        }else {
            return calcularSequencia(n-1) + calcularSequencia(n-2) ;
        }
    }
}
