package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_7_NumeroNegativoPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero");
        int num = sc.nextInt();


        if (num > -100 && num < -9) {
            
            if (numPrimo(-num)) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero no es negativo o no esta dentro del rango de dos digitos");
        }
        sc.close();
    }

    public static boolean numPrimo(int num){
        if (num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}




