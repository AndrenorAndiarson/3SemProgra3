package Practica4;

import java.util.Scanner;

public class Eje5_2_1 {
    public static void main(String[] args) {
int [][] A;
int fil=3;
int col=3;
int ceros=0;
        Scanner sc= new Scanner(System.in);
        A = new int[fil][col];
        for (int i=0;i< fil;i++){
            for (int j=0;j<col;j++){
                System.out.println("Ingrese los numeros de 0 a 9:");
                A[i][j]= sc.nextInt();
            }
        }
        for (int i=0;i< fil;i++){
            for (int j=0;j<col;j++){
if (A[i][j]==0){
ceros=ceros+1;
}
    }}
        if (ceros>0) {
            System.out.println("Hay: " + ceros + " ceros en los numeros dados");
        }else {
            System.out.println("No hay ceros en los numeros dados");
        }
        }
}
