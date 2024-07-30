package Soluciones_taller1;

import java.util.Scanner;

public class EjercicioDireccionEdadNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su nombre: ");
        String name = sc.nextLine();

        System.out.println("Escriba su direccion: ");
        String address = sc.nextLine();

        System.out.println("Escriba su edad: ");
        float age = sc.nextFloat();
        
        System.out.println("Hola " + name + " " + "usted tiene " + age + " años " + "y vive en la dirección " + address );


        sc.close();
    }
}
