package Practica1;

import java.util.Scanner;

public class Eje2_8 {
    public static void main(String[] args) {
        System.out.println("DISTANCIA ENTRE DOS PUNTOS");
        float x1,y1,x2,y2,x,y,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer punto eje x");
        x1= sc.nextFloat();
        System.out.println("Ingrese el primer punto eje y");
        y1= sc.nextFloat();
        System.out.println("Ingrese el segundo punto eje x");
        x2= sc.nextFloat();
        System.out.println("Ingrese el segundo punto eje y");
        y2= sc.nextFloat();
        x=x2-x1;
        y=y2-y1;
        d= (float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("La distancia entre los puntos es: "+d);





    }
}
