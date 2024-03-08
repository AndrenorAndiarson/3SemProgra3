package Practica3;

import java.util.Scanner;

public class Eje4_5 {
    public static void main(String[] args) {
        System.out.println("DO-WHILE");
        int sum=0;
        int cont=1;
        int numal;
        int n;
        float prom;
        Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS");
        numal= sc.nextInt();
do {
    System.out.println("Ingrese la edad: ");
    n= sc.nextInt();
    sum=sum+n;
    cont=cont+1;
}while (cont<=numal);
prom=sum/numal;
        System.out.println("EL promedio de las edades es: "+prom);

    }
}
