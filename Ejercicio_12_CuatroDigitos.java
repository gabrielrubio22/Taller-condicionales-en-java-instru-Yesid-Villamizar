package Soluciones_taller1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_12_CuatroDigitos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un número de cuatro dígitos");
        int num = sc.nextInt();

        if (num > 999 & num < 10000) {
            List<Integer> numeros = descomponer(num);

            if (numeros.get(1).equals(numeros.get(2))) {
                System.out.println("El segundo dígito es igual al penúltimo");
            } else{
                System.out.println("El segundo dígito no es igual al penúltimo");
            }

        } else{
            System.out.println("El numero no tiene cuatro dígitos o es invalido");
        }

        sc.close();
    }

    public static List<Integer> descomponer(int num){

        List<Integer> digitos = new ArrayList<>();

       while (num > 0) {
        int digito = num % 10;
        digitos.add(0,digito);
        num = num /10;
       }
       return digitos;
        
    }
}
