package Aplicacion_de_desiciones;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class sistemaDescuentos {

    public static final int MANZANA = 1000;
    public static final int NARANJA = 2000;
    public static final int PERA = 5000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingresa el nombre de tu membresia");
        System.out.println("");
        System.out.println("Regular, miembro, VIP");
        String membresia = sc.nextLine();

        System.out.println("Escriba el nombre del producto a llevar");
        System.out.println("");
        System.out.println("___________Menú___________");
        System.out.println("Manzana........$ 1.000");
        System.out.println("Naranja........$ 2.000");
        System.out.println("Pera...........$ 5.000");
        System.out.println("");
        String producto = sc.nextLine();

        System.out.println("Escriba la cantidad a llevar");
        int cantidad = sc.nextInt();

        @SuppressWarnings("deprecation")
        Locale localeColombia = new Locale("es","CO");
        Currency cop = Currency.getInstance("COP");

        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(localeColombia);
        formatoMoneda.setCurrency(cop);

        double totalSinDescuento;
        double valorDescuento;
        double totalConDescuento;

        String totalFormateado;
        String valorDescuentoFormateado;

        if (membresia.equalsIgnoreCase("Regular")) {
            final float DESCUENTO = 0.05f;

            switch (producto.toLowerCase()) {
                case "manzana":
                    totalSinDescuento = (cantidad * MANZANA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                    break;
                case "naranja":
                    totalSinDescuento = (cantidad * NARANJA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                   break;
                case "pera":
                    totalSinDescuento = (cantidad * NARANJA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                    break;
                default:
                    System.out.println("Eleccion invalida");
                    break;
            }
        } else if (membresia.equalsIgnoreCase("Miembro")) {
            final float DESCUENTO = 0.1f;

            switch (producto.toLowerCase()) {
                case "manzana":
                    totalSinDescuento = (cantidad * MANZANA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                    break;
                case "naranja":
                    totalSinDescuento = (cantidad * NARANJA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                   break;
                case "pera":
                    totalSinDescuento = (cantidad * NARANJA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                    break;
                default:
                    System.out.println("Eleccion invalida");
                    break;
            }
        } else if (membresia.equalsIgnoreCase("VIP")) {
            final float DESCUENTO = 0.2f;

            switch (producto.toLowerCase()) {
                case "manzana":
                    totalSinDescuento = (cantidad * MANZANA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                    break;
                case "naranja":
                    totalSinDescuento = (cantidad * NARANJA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                   break;
                case "pera":
                    totalSinDescuento = (cantidad * NARANJA);
                    valorDescuento = totalSinDescuento * DESCUENTO;
                    totalConDescuento = totalSinDescuento - valorDescuento;

                    totalFormateado = formatoMoneda.format(totalConDescuento);
                    valorDescuentoFormateado = formatoMoneda.format(valorDescuento);
                    System.out.println(MessageFormat.format("Total a pagar: {0} \n Su descuento fue de: {1}" , totalFormateado,valorDescuentoFormateado));
                    break;
                default:
                    System.out.println("Eleccion invalida");
                    break;
            }
        }

        sc.close();
    }
}
