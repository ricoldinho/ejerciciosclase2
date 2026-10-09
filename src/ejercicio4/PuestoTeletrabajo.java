package ejercicio4;

import java.util.Scanner;

public class PuestoTeletrabajo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingresa el nombre del departamento:");
        String departamento = keyboard.nextLine();
        System.out.println("Ingresa la antigüedad en meses: ");
        int antiguedad = keyboard.nextInt();
        System.out.println("Ingresa distancia en km desde oficina a domicilio:");
        double distancia = keyboard.nextDouble();
        System.out.println("¿Te encuentras en período de prueba?");
        boolean enPeriodoPrueba = keyboard.nextBoolean();

        if(enPeriodoPrueba){
            System.out.println("No puede acceder al puesto de trabajo");
        }else {
                        //VIA A                      OR        //VIA B
            if((antiguedad > 12 && distancia > 25.0) || (antiguedad > 36)){
                if(departamento.equalsIgnoreCase("Sistemas")){
                    if(distancia < 50.0){
                        System.out.println("Puede acceder al puesto de trabajo");
                    }
                }else {
                    System.out.println("Puede acceder al puesto de trabajo");
                }
            }else{
                System.out.println("No puede acceder al puesto de trabajo");
            }
        }
    }
}
