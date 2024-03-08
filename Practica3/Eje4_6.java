package Practica3;

import java.util.Scanner;

public class Eje4_6 {
    public static void main(String[] args) {
        System.out.println("CICLO FOR");
        Scanner sc= new Scanner(System.in);
        int ahorro=0;
        int anual;
        int sum=1;
        int n;
        while (sum<=12) {
            System.out.println("INGRESE CUANTO VA A AHORRAR: ");
            n = sc.nextInt();
            ahorro = ahorro + n;
            System.out.println("El ahorro del mes: " + sum + " es: " + n);
            sum = sum + 1;

        }
         anual=ahorro;
        System.out.println("EL ahorro anual es: "+anual);
        }
    }

