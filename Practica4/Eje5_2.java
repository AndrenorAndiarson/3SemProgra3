package Practica4;

import java.util.Scanner;

public class Eje5_2 {
    public static void main(String[] args) {
        int[] edad;
        int n=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS A SUMAR");
        edad= new int[sc.nextInt()];
        for (int i=0;i< edad.length;i++){
            System.out.println("INGRESE UN VALOR");
            edad[i]= sc.nextInt();
        }
        for (int j=0;j< edad.length;j++) {
            n=n+edad[j];

        }
        System.out.println("La suma de las cantidades guardadas es: " + n);


    }
}
