package ejercicio2;

import java.util.Scanner;

public class EjercicioServidorCloud {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el nombre del clúster");
        String nombreCluster = entrada.nextLine();
        System.out.println("¿Cuántos GB de RAM tiene el servidor?");
        int numGigas = entrada.nextInt();
        System.out.println("¿Cuántas VM quieres desplegar?");
        int numVM = entrada.nextInt();

        if(numVM <= 0){
            System.out.println("Error crítico: El número de VMs debe ser mayor a 0.");
        }else{
            int gbPorVm = numGigas / numVM;
            int gbSinAsignar = numGigas % numVM;
            double porcentajeExactoMemoriaSinAsignar = (numGigas - gbSinAsignar) / (double) numGigas;
            System.out.println("El nombre del clúster es: " + nombreCluster +"\n" +
                                "La cantidad en GB de RAM es: " + numGigas + "\n" +
                                "La cantidad de máquinas virtuales a desplegar es: " + numVM + "\n" +
                                "Los GB por cada VM son: " + gbPorVm + "\n" +
                                "La cantidad de GB sin asignar es: " + gbSinAsignar + "\n" +
                                "El porcentaje exacto de memoria sin asignar es: " + porcentajeExactoMemoriaSinAsignar + "%\n" +
                                "El porcentaje de memoria asignada es: " + (100 - porcentajeExactoMemoriaSinAsignar) + "%");
        }


    }
}
