package Ejercicio01;

public class Numeros {
    boolean esPrimo(int n){
        boolean primo=true;
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                primo=false;
                break;
            }
        }
        return primo;
    }
    boolean esCapicua(int n){
        int aux;
        int inverso=0;
        int cifra;
        boolean capicuo;
        aux=n;
        while(aux!=0){
            cifra = aux % 10;
            aux/=10;
            inverso=(inverso*10)+cifra;
        }
        //comparar ambas variables para saber si el numero es capicua
        if(inverso==n){
            capicuo=true;
        }else {
            capicuo=false;
        }
        return capicuo;
    }
}
