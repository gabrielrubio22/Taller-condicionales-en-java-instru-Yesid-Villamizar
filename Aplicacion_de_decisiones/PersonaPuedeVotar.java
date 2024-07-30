package Aplicacion_de_desiciones;

import java.util.Scanner;

public class PersonaPuedeVotar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Usted es ciudadano de Colombia o extranjero?");
        System.out.println("SI / NO");
        String respCiudadano = sc.nextLine();

        
        if (respCiudadano.equalsIgnoreCase("si")) {
            System.out.println("Por favor ingrese su edad:");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Usted puede votar");
            } else {
                System.out.println("Usted no puede votar por ser menor de edad.");
            }
            
        } else if(respCiudadano.equalsIgnoreCase("no")){
            System.out.println("Usted no puede votar");
        } else {
            System.out.println("Su respuesta es incorrecta");
        }

        sc.close();
    }
}
