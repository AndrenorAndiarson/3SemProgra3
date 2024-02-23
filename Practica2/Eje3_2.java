package Practica2;

import java.util.Scanner;

public class Eje3_2 {
    public static void main(String[] args) {

        System.out.println("positivo negativo");
        int posi,nega;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un valor positivo o negativo:");
        posi= sc.nextInt();
        if (posi>=0){
            System.out.println(posi+" Es Positivo");
        } else {
            System.out.println(posi+" Es negativo");
        }
    }
}
