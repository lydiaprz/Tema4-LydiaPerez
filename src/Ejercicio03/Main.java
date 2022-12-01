package Ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros aleatorios: ");
        int n1=sc.nextInt();
        NumerosAleatorios.numerosAleatorios(n1);
        System.out.println("Indique el numero limite maximo: ");
        int n2= sc.nextInt();
        NumerosAleatorios.numerosAleatorios(n1,n2);
        System.out.println("Introduzca el limite minimo: ");
        n2= sc.nextInt();
        System.out.println("Introduzca el limite maximo: ");
        int n3=sc.nextInt();
        NumerosAleatorios.numerosAleatorios(n1,n2,n3);
    }
}
