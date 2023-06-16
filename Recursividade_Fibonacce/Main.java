package Recursividade_Fibonacce;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
        int num =0;
        int somaTotal = 0 ;
        System.out.println("informe um numero: ");
        num = ler.nextInt();
        for (int x = 1; x<= num; x++){
            if (x == num) {
                System.out.print(Fibonacce.calcularSequencia(x) + " = ");
                somaTotal += Fibonacce.calcularSequencia(x);
            }else {
                System.out.print(Fibonacce.calcularSequencia(x)+ " + ");
                somaTotal += Fibonacce.calcularSequencia(x);
            }
        }
        System.out.print(somaTotal);

    }
}
