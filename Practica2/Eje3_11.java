package Practica2;

import java.util.Scanner;

public class Eje3_11 {
    public static void main(String[] args) {
        System.out.println("HAMBURGUESA");
        Scanner sc=new Scanner(System.in);
        int tipoham,numham,tipopago;
double precioham,cargo,totsin,total;
        System.out.println("Ingrese la cantidad de hamburguesas: ");
        numham= sc.nextInt();
        System.out.println("Ingrese 1 si es Sencilla o 2 si es Doble:");
tipoham= sc.nextInt();
        System.out.println("ingrese 1 si paga en efectivo o 2 con tarjeta:");
    tipopago= sc.nextInt();

    if (tipoham==1){
        precioham=20;
    } else if (tipoham==2) {
        precioham=25;
    }else {
        precioham=28;
    }
totsin=precioham*numham;

    if (tipopago==2){
        cargo=totsin*0.05;
    }else {
        cargo=0;
    }
    total=totsin+cargo;
        System.out.println("La Hamburguesa cuesta: "+precioham);
        System.out.println("El total sin cargo es: "+totsin);
        System.out.println("El cargo es: "+cargo);
        System.out.println("El total a pagar es: "+total);

    }
}
