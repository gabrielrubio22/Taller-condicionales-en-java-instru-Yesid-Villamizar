package Ejercicios_For;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            
            System.out.println("Escriba un numero");
            while (!sc.hasNextInt()) {
                System.out.println("El numero debe ser entero");
                sc.next();
            }

            num = sc.nextInt();

            if (num > 0) {
                for(int i = 1; i <= num; i++){
                    System.out.println(i);
                }
                break;
            } else {
                System.out.println("El numero debe ser positivo");
            }

            
        }
        sc.close();
        // Cerrar el escáner
       
    }
}