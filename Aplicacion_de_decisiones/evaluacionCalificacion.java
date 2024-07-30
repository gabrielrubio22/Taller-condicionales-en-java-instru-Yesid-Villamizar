package Aplicacion_de_desiciones;

import java.util.Scanner;

public class evaluacionCalificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la primer nota de 10 a 50");
        float primerNota = sc.nextFloat();

        System.out.println("Escriba la segunda nota de 10 a 50");
        float segundaNota = sc.nextFloat();

        System.out.println("Escriba la tercer nota de 10 a 50");
        float tercerNota = sc.nextFloat();

        double sumaNotas = primerNota + segundaNota + tercerNota;

        if (sumaNotas >= 90) {
            System.out.println("El rendimiento es excelente");
        } else if (sumaNotas >= 80 & sumaNotas <= 89) {
            System.out.println("El rendimiento es muy bueno");
        } else if (sumaNotas >= 70 & sumaNotas <= 79) {
            System.out.println("El rendimiento es bueno");
            
        } else if (sumaNotas >= 60 & sumaNotas <= 69) {
            System.out.println("El rendimiento es suficiente");
            
        } else if (sumaNotas < 60) {
            System.out.println("El rendimiento es insuficiente");
            
        } else {
            System.out.println("Notas no reconocidas");
        }

        sc.close();
    }
}
