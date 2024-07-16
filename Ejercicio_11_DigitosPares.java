package Soluciones_taller1;

import java.util.Scanner;

public class Ejercicio_11_DigitosPares {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero de 3 dígitos");
        int num = sc.nextInt();

        if (num > 99 & num < 1000) {
            int tecerDigito = num % 10;
            num = num / 10;
            int segundoDigito = num % 10;
            int primerDigito = num / 10;
    
    
            if(digitosPar(tecerDigito)){
                System.out.println("El tercer dígito es par");
            } else{
                System.out.println("El tercer dígito no es par");
            }
            
            if (digitosPar(segundoDigito)) {
                System.out.println("El segundo dígito es par");
            } else{
                System.out.println("El segundo dígito no es par");
            }
            
            if (digitosPar(primerDigito)) {
                System.out.println("El primer dígito es par");
            } else{
                System.out.println("El primer dígito no es par");
            }
    
        } else {
            System.out.println("El numero no tiene 3 dígitos o es incorrecto");
        }
       
        sc.close();
    }

    public static boolean digitosPar(int num){
        return num % 2 == 0;
    }
}
