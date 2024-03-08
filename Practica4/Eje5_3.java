package Practica4;

import java.util.Scanner;

public class Eje5_3 {
    public static void main(String[] args) {
        System.out.println("SUMA DE VECTORES");
        Scanner sc = new Scanner(System.in);
        int[] A;
        int[] B;
        int sum1=0,sum2=0,sumtot;
        System.out.println("TAMAÑO DEL VECTOR A");
        A = new int[sc.nextInt()];
        System.out.println("TAMAÑO DEL VECTOR B");
        B = new int[sc.nextInt()];
        for (int i = 0; i < A.length; i++) {
            System.out.println("INGRESE LOS VALORES DE A");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("INGRESE LOS VALORES DE B");
            B[i] = sc.nextInt();
        }
        for (int j=0;j< A.length;j++) {
            sum1 = sum1 + A[j];
        }
        for (int j=0;j< B.length;j++) {
            sum2 = sum2 + B[j];
        }
        sumtot=sum1+sum2;
        System.out.println("La suma de los vectores A y B son: "+sumtot);
        System.out.println("total A: "+ sum1);
        System.out.println("total B: "+ sum2);
    }
}