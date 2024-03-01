package Practica3;

import java.util.Scanner;

public class Eje4_3 {
    public static void main(String[] args) {
        System.out.println("SUMA CICLO FOR");
        Scanner sc= new Scanner(System.in);
        int suma=0;
        int n;
        for (int i=0;i<=9;i++){
            System.out.println("Ingresa un numero:");
            n= sc.nextInt();
            suma=suma+n;
        }
        System.out.println("La suma total es: "+suma);
    }
}
