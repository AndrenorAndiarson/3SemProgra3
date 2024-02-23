package Practica1;

import java.util.Scanner;

public class Eje2_7 {
    public static void main(String[] args) {
float litros,precio,tg,ga;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese los litros:");
        litros= sc.nextFloat();
        System.out.println("Ingrese el precio por galon");
        precio= sc.nextFloat();
        tg= (float) (litros/3.785);
ga=precio*tg;
        System.out.println("El total de ganancias es: "+ga);

    }
}
