package ejercicio1;

import java.util.Scanner;

public class EjercicioFacturaLuz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa los kW/h consumidos este último mes: ");
        int kWh = sc.nextInt();
        System.out.println("Precio fijado por kW/h en euros:");
        double precioKwH = sc.nextDouble();

        double consumoFijo = 5.20;

        double costeConsumo = kWh * precioKwH;

        double costeDelIva = (costeConsumo + consumoFijo) * 0.21;

        double costeTotal = costeConsumo + costeDelIva;

        System.out.println("CALCULOS DE FACTURA de cliente " + nombre + " :\n"
                        + "precio del kW/h: " + precioKwH + "€.\n"
                        + "precio del consumo fijo: " + consumoFijo + "€.\n"
                        + "coste del consumo: " + costeConsumo + "€.\n"
                        + "coste del IVA: " + costeDelIva + "€.\n"
                        + "coste Total con la suma aplicada: " + costeTotal + "€."
                );



    }
}
