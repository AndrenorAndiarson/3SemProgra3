package Practica1;

import java.util.Scanner;

public class Eje2_9 {
    public static void main(String[] args) {
        System.out.println("Sueldo semanal por hora");
        float hora,pago,sueldo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas:");
        hora= sc.nextFloat();
        System.out.println("Ingrese el pago por hora");
        pago= sc.nextFloat();
        sueldo=hora*pago;
        System.out.println("El sueldo de la semana es: "+sueldo);



    }
}
