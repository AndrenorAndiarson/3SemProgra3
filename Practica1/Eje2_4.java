package Practica1;

import java.util.Scanner;

public class Eje2_4 {
    public static void main(String[] args) {

        System.out.println("Area de una circunferencia");
        float R,Ar;
        float Ri=0F;
float pi=3.1415F;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        R= sc.nextInt();
Ri= (float) Math.pow(R,2);
        Ar=pi*Ri;
        System.out.println("El area de la circunferencia es: "+ Ar);

    }
}
