package ejercicio3;

import java.util.Scanner;

public class RendimientoAcademico {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingresa el nombre del alumno: ");
        String nombre = kb.nextLine();
        System.out.println("Ingresa la primera calificación del alumno: ");
        double calificacion1 = kb.nextDouble();
        System.out.println("Ingresa la segunda calificación del alumno: ");
        double calificacion2 = kb.nextDouble();
        System.out.println("Ingresa la tercera calificación del alumno: ");
        double calificacion3 = kb.nextDouble();
        double mediaAritmetica = (calificacion1 + calificacion2 + calificacion3) / 3;

        System.out.println("Ingresa el número de faltas injustificadas del alumno: ");
        int numeroFaltas = kb.nextInt();
        System.out.println("¿Ha entregado el alumno la práctica obligatoria?");
        boolean haEntregado = kb.nextBoolean();
        if(!haEntregado){
            System.out.println("Suspenso por práctica no entregada");
        }else{
            boolean penalizado = false;
            double mediaFinalOriginal = mediaAritmetica;
            if(numeroFaltas > 10){
                //PENALIZACION APLICADA
                mediaFinalOriginal = mediaFinalOriginal - 1;
                penalizado = true;
            }
            String notaCualitativa = "sin nota";
            if(mediaFinalOriginal < 5){
                notaCualitativa = "Insuficiente";
                System.out.println("Insuficiente");
            } else if (mediaFinalOriginal < 6.9) {
                notaCualitativa = "Aprobado/Bien";
                System.out.println("Aprobado/Bien");
            } else if (mediaFinalOriginal < 8.9) {
                notaCualitativa = "Notable";
                System.out.println("Notable");
            } else if (mediaFinalOriginal <= 10) {
                notaCualitativa = "Sobresaliente";
                System.out.println("Sobresaliente");
            } else {
                System.out.println("Error");
            }

            System.out.println("BOLETIN FINAL DEL ALUMNO:" + nombre + "\n" +
                    "NOTA ORIGINAL :" + mediaAritmetica + "\n" +
                    "PENALIZADO: " + penalizado + "\n" +
                    "NOTA CUALITATIVA: " + notaCualitativa + "\n");
        }
    }
}
