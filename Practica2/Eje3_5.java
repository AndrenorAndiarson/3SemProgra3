package Practica2;

import java.util.Scanner;

public class Eje3_5 {
    public static void main(String[] args) {
        System.out.println("Mayor de tres");
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el primer valor A:");
        a= sc.nextInt();
        System.out.println("ingrese el segundo valor B:");
        b= sc.nextInt();
        System.out.println("ingrese el tercer valor C:");
        c= sc.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("El mayor de los tres es A: "+a+ " de "+b+" y "+c);
            }else{
                System.out.println("El mayor de los tres  es C: "+c+ " de "+a+" y "+b);
            }
        }else if (b>c){
            System.out.println("El mayor de los tres  es B: "+b+ " de "+a+" y "+c);
        } else {
            System.out.println("El mayor de los tres  es C: "+c+ " de "+a+" y "+b);
        }


        }

    }
