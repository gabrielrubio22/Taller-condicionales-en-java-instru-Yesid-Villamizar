package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_2_Numero3Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero");
        int num = sc.nextInt();

        if (num > 99 && num < 1000) {
            System.out.println("El numero es de tres dígitos");
        } else if( num < 100){
            System.out.println("El numero tiene menos de 3 dígitos");
        } else {
            System.out.println("El numero es invalido");
        }

        sc.close();
    }
}
