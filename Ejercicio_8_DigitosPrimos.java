package Soluciones_taller1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ejercicio_8_DigitosPrimos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero de dos dígitos");
        int num = sc.nextInt();

        if(num < 100 && num >9){
            int ultimoDigito = num % 10;
            num = num / 10;
            if(numeroPrimo(num)){
                System.out.println(MessageFormat.format("El dígito {0} es primo",num));
            } else {
                System.out.println(MessageFormat.format("El dígito {0} no es primo", num));
            }

            if(numeroPrimo(ultimoDigito)){
                System.out.println(MessageFormat.format("El dígito {0} es primo",ultimoDigito));
            } else {
                System.out.println(MessageFormat.format("El dígito {0} no es primo", ultimoDigito));
            }

        } else {
            System.out.println("El numero no tiene dos dígitos o es incorrecto");
        }
        

        sc.close();
    }

    public static boolean numeroPrimo(int num){
        if (num <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++){

            if (num % i == 0) {
                return false;
            } 
             
        }
        return true;
    }
}
