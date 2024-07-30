package Aplicacion_de_desiciones;

import java.util.Scanner;

public class tamañoCamiseta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la medida en pulgadas de su pecho");
        float medida = sc.nextFloat();

        if (medida <= 34) {
            System.out.println("El tamaño es S");
        } else if (medida >= 35 & medida <=38) {
            System.out.println("Su medida es M");
        } else if (medida >= 39 & medida <=42) {
            System.out.println("Su medida es L");
            
        } else if (medida > 42 ) {
            System.out.println("Su medida es xl");
            
        } else {
            System.out.println("Talla invalida");
        }

        sc.close();
    }
}
