package Practica2;

import java.util.Scanner;

public class Eje3_9 {
    public static void main(String[] args) {
        System.out.println("CHIMEFON");
    int dia,turno,tiempo;
    double pago,total,imp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese del 1 al 7 el dia 1=Lunes 2=Martes...7=Domingo");
        dia= sc.nextInt();
            System.out.println("Ingrese el tiempo de chisme: ");
            tiempo= sc.nextInt();
            System.out.println("Ingrese 1 si es mañana o 2 si es tarde");
            turno= sc.nextInt();
            if (tiempo<5){
                pago=tiempo*1;
            } else if (tiempo<8) {
                pago=(tiempo-5)*0.8+5;
            } else if (tiempo<=10) {
                pago=(tiempo-8)*0.7+7.4;
            } else {
                pago=(tiempo-10)*0.5+8.8;
            }
if (dia==7){
    imp=pago*0.05;
} else if (turno==1) {
    imp=pago*0.15;
} else {
    imp=pago*0.10;
}
total=pago+imp;
        System.out.println("El pago por el chisme es: "+pago);
        System.out.println("El impuesto por chismoso es: "+imp);
        System.out.println("El total a pagar es: "+total);

    }
}
