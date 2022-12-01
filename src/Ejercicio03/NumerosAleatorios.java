package Ejercicio03;

public class NumerosAleatorios {
    public static void numerosAleatorios(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
    }
    public static void numerosAleatorios(int n1, int n2){
        for (int i = 0; i < n1; i++) {
            System.out.println((int)(Math.random()*n2));
        }
    }
    public static void numerosAleatorios(int n1, int n2, int n3){
        for (int i = 0; i < n1; i++) {
            System.out.println((int)(Math.random()*(n3-n2)+n2));
        }
    }
}
