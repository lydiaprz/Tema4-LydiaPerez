package Ejercicio02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Esfera esfera=new Esfera();
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca el radio: ");
        esfera.radio= sc.nextDouble();
        System.out.println("La superficie es "+Esfera.superficie());
        System.out.println("La superficie es "+Esfera.volumen());
    }
}
