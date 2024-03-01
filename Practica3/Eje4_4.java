package Practica3;

import java.util.Scanner;

public class Eje4_4 {
    public static void main(String[] args) {
        int sum=0;
        int n;
        int numal,cont;
        cont=0;
        double prom;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos:");
        numal= sc.nextInt();
        cont=cont+numal;
        while (cont<=numal){
            System.out.println("Ingrese la edad:");
            n = sc.nextInt();
            sum=sum+n;
        }
        prom=sum/numal;
        System.out.println("La edad promedio de los alumnos es: "+prom);

    }
}
