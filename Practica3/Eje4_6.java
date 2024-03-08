package Practica3;

import java.util.Scanner;

public class Eje4_6 {
    public static void main(String[] args) {
        System.out.println("CICLO FOR");
        Scanner sc= new Scanner(System.in);
        int numal;
        int n;
        float prom;
        int sum=0;
        System.out.println("INGRESE EL NUMERO DE ALUMNOS: ");
        numal= sc.nextInt();
        for (int i=1;i<=numal;i++){
            System.out.println("INGRESE LA EDAD:");
            n= sc.nextInt();
            sum=sum+n;
        }
        prom=sum/numal;
        System.out.println("EL PROMEDIO DE LAS EDADES ES: "+prom);

    }
}
