package Practica1;

import java.util.Scanner;

public class Eje2_5 {
    public static void main(String[] args) {
        System.out.println("Area de un rectangulo triangulo");
        float a,b,c;
        float at,ar,are;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la base:");
        b= sc.nextInt();
        System.out.println("ingrese el lado mas grande:");
        a= sc.nextInt();
        System.out.println("ingrese el lado mas corto:");
        c= sc.nextInt();
        at=(b*(a-c))/2;

        ar=b*c;

        are=at+ar;
        System.out.println("El area del triangulo es: "+ at+ " y el area del rectangulo es: "+ ar);
        System.out.println("el area total es: "+are);


    }
}
