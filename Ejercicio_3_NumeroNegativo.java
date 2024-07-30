package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_3_NumeroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Escriba un numero");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }

        sc.close();
    }
}
