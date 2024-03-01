package Practica2;

import java.util.Scanner;

public class Eje3_12 {
    public static void main(String[] args) {
        System.out.println("CONSULTORIO");
        Scanner sc=new Scanner(System.in);
        int numcons;
        double costocita,costotrat;
        System.out.println("Ingrese el numero total de consultas:");
        numcons= sc.nextInt();
        if (numcons<=3){
            costocita=200;
            costotrat=numcons*costocita;
        } else if (numcons<=5) {
            costocita=150;
            costotrat=(numcons-3)*150+600;
        } else if (numcons<=8) {
            costocita=100;
            costotrat=(numcons-5)*100+900;
        }else {
            costocita=50;
            costotrat=(numcons-8)*50+1200;
        }
        System.out.println("El costo de la consulta es: "+costocita);
        System.out.println("El costo del tratamiento es: "+costotrat);

    }

}
