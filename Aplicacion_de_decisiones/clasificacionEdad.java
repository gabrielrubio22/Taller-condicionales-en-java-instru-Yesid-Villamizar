package Aplicacion_de_desiciones;

import java.util.Scanner;

public class clasificacionEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su edad");
        int edad = sc.nextInt();

        if (edad < 13 && edad > 0) {
            System.out.println("Usted es un niño");
        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Usted es un adolescente");
        } else if (edad >= 20 && edad <= 59) {
            System.out.println("Usted es un adulto");
        } else if (edad >= 60) {
            System.out.println("Usted es un anciano");
        } else{
            System.out.println("Edad invalida");
        }

        sc.close();
    } 
    
}