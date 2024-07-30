package Aplicacion_de_desiciones;

import java.util.Scanner;

public class tipoTriangulo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba la longitud del primer lado del triángulo");
        float primerLado = sc.nextFloat();

        System.out.println("Escriba la longitud del segundo lado del triángulo");
        float segundoLado = sc.nextFloat();

        System.out.println("Escriba la longitud del primer lado del triángulo");
        float tercerLado = sc.nextFloat();
        
        if (primerLado == segundoLado && primerLado == tercerLado && segundoLado == tercerLado) {
            System.out.println("Es un triángulo Equilátero");

        } else if (primerLado == segundoLado || primerLado == tercerLado || segundoLado == tercerLado) {
            System.out.println("Es un triángulo Isósceles");
            
        } else if (primerLado != segundoLado && primerLado != tercerLado && segundoLado != tercerLado) {
            System.out.println("Es un triángulo Escaleno");

        } else {
            System.out.println("Longitud de lados invalida");
        }

        sc.close();
    }
}
