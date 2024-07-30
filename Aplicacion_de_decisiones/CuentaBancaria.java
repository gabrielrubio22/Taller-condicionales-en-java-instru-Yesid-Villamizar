import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el saldo de su cuenta bancaria");
        double saldoActual = sc.nextDouble();

        if (saldoActual < 0) {
            System.out.println("Su saldo está sobregirado");
        } else if (saldoActual == 0) {
            System.out.println("Usted está sin saldo");
        } else if (saldoActual > 0) {
            System.out.println("Su estado es activo");
        } else {
            System.out.println("Error en la respuesta");
        }

        sc.close();
    }
}
