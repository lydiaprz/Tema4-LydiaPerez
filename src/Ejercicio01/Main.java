package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        Numeros numeros=new Numeros();

        System.out.print("Introduzca un numero: ");
        n= sc.nextInt();
        System.out.println("¿El numero es primo? "+numeros.esPrimo(n));

        System.out.print("Introduzca un numero: ");
        n= sc.nextInt();
        System.out.println("¿El numero es capicua? "+numeros.esCapicua(n));
    }
}
