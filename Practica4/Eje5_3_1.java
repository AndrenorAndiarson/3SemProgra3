package Practica4;

import java.util.*;

public class Eje5_3_1 {
    public static void main(String[] args) {
        System.out.println("BIG OLD");
        int n;
        int dias=7;
        System.out.println("Ingrese la cantidad de choferes");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int datosChof [][]= new int[n][dias];
        int totkm[]= new int[n];
        int km=0;
for (int i=0;i<n;i++) {
    System.out.println("Ingrese los km recorridos por el chofer: "+(i + 1)+ " durante la semana");
        for (int j=0;j<7;j++) {
            System.out.println("Dia "+(j+1)+" : ");
            dias= sc.nextInt();
        }
    }
for (int i=0;i<totkm.length;i++){
    km=km+dias;
for (int j=0;j<7;j++){
    totkm [i] =totkm [i]+ km;
    }
}

        System.out.println("Total de km recirridos por cada chofer");
for (int i=0;i<n;i++){
    System.out.println(" Chofer: "+ (i+1)+ " : "+ totkm[i]+" km");

}

    }
}
