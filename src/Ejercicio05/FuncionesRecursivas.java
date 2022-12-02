package Ejercicio05;

public class FuncionesRecursivas {
    public static int sumatorio(int numero){
        int suma=0;
        if(numero==1){
            return 1;
        }else {
            suma=suma+sumatorio(numero-1);
        }
        return suma;
    }
    public static double potencia(double a, int n){
        double potencia;
        if (n==0){
            return 1;
        }else {
            potencia=a*potencia(a, n-1);
        }
        return potencia;
    }
    public static int serieFibonacci(int numero){
        int fibonacci=0;
        if (numero==0||numero==1){
            fibonacci=numero;
        } else if (numero<0) {
            System.out.println("valor no valido");
        } else {
            fibonacci=serieFibonacci(numero-1)+serieFibonacci(numero-2);
        }
        return fibonacci;
    }
}
