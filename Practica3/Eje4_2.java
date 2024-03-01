package Practica3;

import java.util.Scanner;

public class Eje4_2 {
    public static void main(String[] args) {
        System.out.println("SUMA CICLO DO WHILE");
        double sum,cont;
        sum=0;
        cont=1;

        int va;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Ingrese una variable");
            va= sc.nextInt();
            sum=sum+va;
            cont=cont+1;
}
while (cont<=10);
        System.out.println("La suma es: "+sum);
    }
}
