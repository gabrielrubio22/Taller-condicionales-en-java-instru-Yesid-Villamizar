package Aplicacion_de_desiciones;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Usar punto como separador decimal
        try {
            System.out.println("_____conversion de temperatura_____");
            System.out.println("");
            System.out.println("Elija la escala que tiene en este momento su temperatura");
            System.out.println("");
            System.out.println("Fahrenheit \n Celsius");
            String escalaActual = sc.nextLine();

            System.out.println("");
            System.out.println("Elija la escala a la que desea convertir");
            System.out.println("");
            System.out.println("Fahrenheit \n Celsius");
            String escala = sc.nextLine();

            System.out.println("");
            System.out.println("Escriba la temperatura");
            float temp = sc.nextFloat();

            float temFinal;

            if (escalaActual.equalsIgnoreCase(escala)){
                System.out.println("No se puede convertir a una misma escala");
            
            } else if (escalaActual.equalsIgnoreCase("Fahrenheit")) {
                //convertir de fahrenheit a celsius
                temFinal = (5/9f) * (temp - 32);
                System.out.println(MessageFormat.format("{0} grados {1} a {2} es: {3} grados" ,temp, escalaActual, escala, temFinal));
        
            } else if (escalaActual.equalsIgnoreCase("celsius")) {
                //convertir de celsius a fahrenheit
                temFinal = (9/5f * temp ) + 32;
                System.out.println(MessageFormat.format("{0} grados {1} a {2} es: {3} grados" ,temp, escalaActual, escala, temFinal));
                
            } else {
                System.out.println("valores o escala invalidos");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: por favor utilice punto (.) para separar los decimales");
            
        } finally {
            sc.close();
        }
        

        
    }
}
