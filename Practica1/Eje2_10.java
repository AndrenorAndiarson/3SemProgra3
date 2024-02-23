package Practica1;

import java.util.Scanner;

public class Eje2_10 {
    public static void main(String[] args) {
        System.out.println("Metros a Pulgadas");
float metros,pul;
        Scanner sc=new Scanner(System.in);
System.out.println("ingrese la cantidad de metros:");
        metros= sc.nextFloat();
        pul= (float) (metros/2.54);
        System.out.println("conversion a pulgadas es: "+pul+" pulgadas");
    }
}
