package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_1_NumeroTermina4 {
    public static void main(String[] args) {

        System.out.println("Por favor digite un numero");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 10 == 4) {
            System.out.println("El numero termina en 4");
        } else {
            System.out.println("El numero no termina en 4");
        }
        
        System.out.println("El valor ingresado en teclado es: " + num);
        

        sc.close();
    }
}
