package Practica1;

import java.util.Scanner;
import java.util.*;

public class Eje2_6 {
    public static void main(String[] args) {
        System.out.println("Area gota");
        float radio,hipo,cateto,at,ac,are;
        float pi=3.1416F;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        radio= sc.nextInt();
        System.out.println("Ingrese la diagonal:");
        hipo= sc.nextInt();
        cateto= (float) Math.sqrt(Math.pow(hipo,2)-Math.pow(radio,2));
at=2*(radio*cateto)/2;
ac= (float) (pi*Math.pow(radio,2)/2);
are=at+ac;
        System.out.println("El area de la gota es: "+ are);



    }

}
