package Practica1;

import java.util.Scanner;

public class Eje2_11 {
    public static void main(String[] args) {
        System.out.println("Metros cubicos");
        float largo,ancho,costo,alto,vol,pago;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la altura:");
        alto= sc.nextFloat();
        System.out.println("Ingrese el largo:");
        largo= sc.nextFloat();
        System.out.println("Ingrese el ancho");
        ancho= sc.nextFloat();
        System.out.println("Ingrese costo por metro cubico:");
        costo= sc.nextFloat();
        vol=(alto*largo*ancho);
        pago=costo*vol;
        System.out.println("El precio total sera: "+pago);

    }
}
