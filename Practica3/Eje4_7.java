package Practica3;

import java.util.Scanner;

public class Eje4_7 {
    public static void main(String[] args) {
        int cp=0;
        int cn=0;
        int ca;
        Scanner sc=new Scanner(System.in);
        int n;
        int nu;
        int c=1;
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS A COMPARAR");
 nu= sc.nextInt();
        do {
     System.out.println("Ingrese una cantidad:");
     n= sc.nextInt();
     if(n>0){
         cp=cp+1;
     }else {
         cn=cn+1;
     }
c=c+1;
 }while (c<=nu);
        System.out.println("Positivos: "+cp);
        System.out.println("Negativos: "+cn);
    }
}
