package Practica2;

import java.util.Scanner;

public class Eje3_1 {
    public static void main(String[] args) {
        System.out.println("determinar mayor");
int a,b,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
a= sc.nextInt();
        System.out.println("Ingrese el segundo valor:");
        b= sc.nextInt();

        if (a > b){
            System.out.println(a+" es mayor que: "+b);
        } else {
            System.out.println(a+" NO es mayor que: "+b);
        }
    }
}
