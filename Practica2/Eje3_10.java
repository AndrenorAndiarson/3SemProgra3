package Practica2;

import java.util.Scanner;

public class Eje3_10 {
    public static void main(String[] args) {
        System.out.println("COMPAÑIA AUTOBUSES");
        int tipobus;
        double preciokm = 0,total,costper;
        int numper,nummin,numkil;
        nummin=20;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el tipo de bus que escogera A=1, B=2 y C=3");
        tipobus= sc.nextInt();
        System.out.println("Ingrese la cantidad de kilometros a recorrer:");
    numkil= sc.nextInt();
        System.out.println("Ingrese la cantidad de personas:");
        numper= sc.nextInt();
        if (tipobus==1){
            preciokm=2;
        } else if (tipobus==2) {
            preciokm=2.5;
        } else  {
            preciokm=3;
        }
        if (numper<20){
            numper=nummin;
        }else {
            numper=numper;
        }
        total=numper*preciokm*numkil;
        costper=total/numper;
        System.out.println("El costo por persona es: "+ costper+ " y el costo total es: "+total);


    }
}
