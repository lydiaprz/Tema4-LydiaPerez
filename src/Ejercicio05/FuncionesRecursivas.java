package Ejercicio05;

public class FuncionesRecursivas {
    public static int sumatorio(int numero){
        int suma=0;
        for (int i = 1; i <= numero; i++) {
            suma+=i;
        }
        return suma;
    }
    public static double potencia(double a, int n){
        return Math.pow(a,n);
    }
    public static int serieFibonacci(int numero){
        return (numero-1)+(numero-2);
    }
}
