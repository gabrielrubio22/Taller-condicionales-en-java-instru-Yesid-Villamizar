package Soluciones_taller1;

import java.util.Scanner;

public class Ejercico_4_SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero");
        int num = sc.nextInt();

        int ultimoDigito, suma;

            
            ultimoDigito = num % 10;
            num = num / 10;
            suma = num + ultimoDigito;
        

        System.out.println("La suma de los dos digitos es: " + suma);
        
        

        sc.close();
    }
}
