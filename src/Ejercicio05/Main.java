package Ejercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero para el sumatorio: ");
        int n= sc.nextInt();
        System.out.println(FuncionesRecursivas.sumatorio(n));
        System.out.println("Introduzca un numero y a lo que desee que sea elevado: ");
        double num= sc.nextDouble();
        n= sc.nextInt();
        System.out.println(FuncionesRecursivas.potencia(num,n));
        System.out.println("Introduzca un numero: ");
        n= sc.nextInt();
        System.out.println(FuncionesRecursivas.serieFibonacci(n));
    }
}
