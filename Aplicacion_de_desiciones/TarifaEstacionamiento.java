package Aplicacion_de_desiciones;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TarifaEstacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("***** Bienvenido al estacionamiento Gabriel-Cars ******");
        System.out.println("");
        System.out.println("_______Tarifas______");
        System.out.println("");
        System.out.println("Menos de 1 hora ...... $ 1.800");
        System.out.println("De 1 a 3 horas ...... $ 4.800");
        System.out.println("Mas de 3 horas ...... $ 7.500");
        System.out.println("");

        System.out.println("Escriba el tiempo en minutos que duró su vehiculo parqueado");
        int tiempoParqueado = sc.nextInt();

        final int MENOSDEHORA = 1800;
        final int UNAHORAYTRESHORAS = 4800;
        final int MASDETRESHORAS = 7500;

        NumberFormat vF = NumberFormat.getCurrencyInstance(Locale.US);


        

        if (tiempoParqueado < 60) {

            String valor = vF.format(MENOSDEHORA);

            System.out.println(MessageFormat.format("Su valor a pagar por {0} minutos es: {1}", tiempoParqueado, valor));
        } else if (tiempoParqueado >= 60 & tiempoParqueado <= 180) {
            String valor = vF.format(UNAHORAYTRESHORAS);
            System.out.println(MessageFormat.format("Su valor a pagar por {0} minutos es: {1}", tiempoParqueado, valor));
            
        } else if (tiempoParqueado > 180) {
            String valor = vF.format(MASDETRESHORAS);
            System.out.println(MessageFormat.format("Su valor a pagar por {0} minutos es: {1}", tiempoParqueado, valor));
            
        } else {
            System.out.println("Tiempo de parqueo invalido");
        }

        sc.close();

    }
}
