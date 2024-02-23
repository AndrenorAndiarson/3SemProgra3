package Practica2;

import java.util.Scanner;

public class Eje3_4 {
    public static void main(String[] args) {
        System.out.println("EL HARAPIENTO");
        float ct,de,pf;
        Scanner sc=new Scanner(System.in);
        System.out.println("Precio traje:");
ct= sc.nextFloat();
        if (ct>2500){
            de= (float) (ct*0.15);
        }else {
            de=(float)(ct*0.08);
        }
        pf=ct-de;
        System.out.println("El precio final es: "+pf+" Bs.");
        System.out.println("Su descuento es: "+de+" Bs.");


    }
}
