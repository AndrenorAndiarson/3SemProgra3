package Practica1;

import java.util.Scanner;

public class Eje2_3 {
    public static void main(String[] args) {

        float A,B,Area;
        System.out.println("Area de un rectangulo");

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        A= sc.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        B= sc.nextInt();
        Area=B*A;
        System.out.println("El area del rectangulo es: "+Area);
    }
}
