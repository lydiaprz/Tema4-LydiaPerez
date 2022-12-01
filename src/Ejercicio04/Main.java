package Ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Operaciones op=new Operaciones();
        System.out.println("Introduzca un numero: ");
        op.n1= sc.nextDouble();
        System.out.println("Introduzca un numero: ");
        op.n2= sc.nextDouble();
        System.out.println("La suma de ambos numeros es: "+op.suma());
        System.out.println("La resta de ambos numeros es: "+op.resta());
        System.out.println("La multiplicacion de ambos numeros es: "+op.multiplicar());
        System.out.println("La division de ambos numeros es: "+op.dividir());
    }
}
