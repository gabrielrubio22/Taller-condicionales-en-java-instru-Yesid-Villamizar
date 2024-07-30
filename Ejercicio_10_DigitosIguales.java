package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_10_DigitosIguales {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un número");
        int num = sc.nextInt();

        int ultimoDigito = num % 10;
        int primerDigito = num / 10;

        if (ultimoDigito == primerDigito) {
            System.out.println("Los dos dígitos son iguales");
        } else {
            System.out.println("Los dos dígitos no son iguales");
        }

        sc.close();
    }
}
