package Practica3;

import java.util.Scanner;

public class Eje4_1 {
    public static void main(String[] args) {
        System.out.println("SUMA DE 10 VALORES");
        Scanner sc=new Scanner(System.in);
        int cont;
     double valsum,suma;
     cont=1;
     suma=0;
   while (cont<=10){
       System.out.println("Ingrese un valor: ");
       valsum= sc.nextInt();
       suma=suma+valsum;
       cont=cont+1;
   }
        System.out.println("La suma total es: "+suma);


    }
}
