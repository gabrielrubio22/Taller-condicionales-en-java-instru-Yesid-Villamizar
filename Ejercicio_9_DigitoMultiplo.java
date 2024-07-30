package Soluciones_taller1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Ejercicio_9_DigitoMultiplo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero");
        int num = sc.nextInt();

        if (num < 100 && num > 9) {

            int ultimoDigito = num % 10;
            num = num /10;

            if (numeroMultiplo(num, ultimoDigito)) {
                System.out.println(MessageFormat.format("El dígito {0} es multiplo de {1}",num,ultimoDigito));

            } else if (numeroMultiplo(ultimoDigito, num)) {
                System.out.println(MessageFormat.format("El dígito {0} es multiplo de {1}",ultimoDigito,num));

            } else {
                System.out.println("Ninguno de los dígitos es multiplo del otro");
            }
            
        } else {
            System.out.println("El numero no tiene dos dígitos o es invalido");
        }

        sc.close();
    }

    public static boolean numeroMultiplo(int num1, int num2){
        if(num2 == 0) return false;

        return num1 % num2 == 0;
        
    }
}
