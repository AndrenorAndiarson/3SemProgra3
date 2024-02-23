package Practica2;

import java.util.Scanner;

public class Eje3_3 {
    public static void main(String[] args) {
        System.out.println("CALCULAR COSTO LAPICES POR CANTIDAD");
        double x,pag;
        Scanner sc=new Scanner(System.in);
        x= sc.nextDouble();
        if (x>=1000){
            pag=x*0.85;
            System.out.println("El costo por mas de 1000 unidades es: "+pag);
        } else {
            pag=x*0.9;
            System.out.println("El costo por menos de 1000 unidades es: "+pag);
        }

    }
}
