package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_6_NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero para determinar si es menor que 20 y si es primo");
        int num = sc.nextInt();

        if (num < 20) {
            if (num % 2 == 0 || num % 3 == 0) {
                System.out.println("El numero no es primo");
            } else {
                System.out.println("El numero es primo y menor que 20");
            }
            
        } else {
            System.out.println("El numero no es menor que 20");
        }
        sc.close();
    }
}
