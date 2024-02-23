package Practica1;

import java.util.Scanner;

public class Eje2_2 {
    public static void main(String[] args) {
        System.out.println("PROMEDIO");
float C1,C2,C3,C4,S,P;
        System.out.println("Ingrese la primera nota:");
        Scanner sc= new Scanner(System.in);
        C1= sc.nextInt();
        System.out.println("Ingrese la segunda nota:");
C2= sc.nextInt();
        System.out.println("Ingrese la tercera nota:");
        C3= sc.nextInt();
        System.out.println("Ingrese la cuarta nota");
        C4= sc.nextInt();
        S=C1+C2+C3+C4;
        P=S/4;
        System.out.println("El promedio total es: "+P);
    }
}
