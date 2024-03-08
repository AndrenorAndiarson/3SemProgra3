package Practica4;

import java.util.Scanner;

public class Eje5_1 {
    public static void main(String[] args) {


        int[] edad;
        int n=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS");
        edad= new int[sc.nextInt()];
        for (int i=0;i< edad.length;i++){
            System.out.println("INGRESE LAS EDADES A GUARDAR");
        edad[i]= sc.nextInt();
        }
        for (int j=0;j< edad.length;j++) {
            System.out.println("Las edades guardadas son: " + edad[j]);
        }
    }
}
