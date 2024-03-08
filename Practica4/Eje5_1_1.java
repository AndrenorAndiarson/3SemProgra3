package Practica4;

import java.sql.Array;
import java.util.Scanner;

public class Eje5_1_1 {
    public static void main(String[] args) {
        int[][] A;
        int fila, columna;
        String[][] cole;
        String nombre, materia;

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE LAS FILAS:");
        fila = sc.nextInt();
        System.out.println("INGRESE LAS COLUMNAS:");
        columna = sc.nextInt();
        A = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("Ingrese las calificaciones: ");
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("Las calificaciones son: " + A[i][j]);

            }
        }
    }
}