package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_5_DigitosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero");
        int num = sc.nextInt();

        int ultimoDigito;

        ultimoDigito = num % 10;
        num = num / 10;

        if (num % 2 == 0 && ultimoDigito % 2 == 0) {
            System.out.println("Ambos dígitos son pares");
        } else {
            System.out.println("No son pares los dos dígitos");
        }
        sc.close();
    }
}
