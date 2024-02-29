package Practica2;

import java.util.Scanner;

public class Eje3_7 {
    public static void main(String[] args) {
        System.out.println("PRECIO UVAS");
        int tama,kilos;
        double precio;
        String tipo;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese los kilos de uva:");
        kilos= sc.nextInt();
        System.out.println("Ingrese el precio:");
        precio= sc.nextDouble();
        System.out.println("Ingrese el tipo de uva A o B");
        tipo = sc.next(); sc.nextLine();
        System.out.println("Ingrese el tamaño de la uva 1 o 2:");
        tama= sc.nextInt();


        if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
                (tama == 1 || tama == 2))) {
            System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
        } else {
            if (tipo.toUpperCase().equals("A") && tama == 1) {
                System.out.println("La ganancia final es de: " + ((kilos * precio)+(kilos*0.20)));
            } else if (tipo.toUpperCase().equals("A") && tama == 2) {
                System.out.println("La ganancia final es de: " + ((kilos*precio)+(kilos*0.30)));
            } else if (tipo.toUpperCase().equals("B") && tama == 1) {
                System.out.println("La ganancia final es de: " + ((kilos * precio)-(kilos*0.30)));
            } else if (tipo.toUpperCase().equals("B") && tama == 2) {
                System.out.println("La ganancia final es de: " + ((kilos*precio)-(kilos*0.50)));

}}}}