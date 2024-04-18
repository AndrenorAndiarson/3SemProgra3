package Metodos_Funciones;

import java.util.Scanner;

public class Suma_Matrices {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Leer las dimensiones de las matrices
                System.out.print("Ingrese el numero de filas de las matrices: ");
                int filas = scanner.nextInt();
                System.out.print("Ingrese el numero de columnas de las matrices: ");
                int columnas = scanner.nextInt();

                // Crear las matrices
                int[][] matriz1 = leerMatriz(scanner, filas, columnas);
                int[][] matriz2 = leerMatriz(scanner, filas, columnas);

                try {
                    int[][] resultado = sumarMatrices(matriz1, matriz2);
                    imprimirMatriz(resultado);
                } catch (IllegalArgumentException e) {
                    System.out.println("Las matrices tienen dimensiones diferentes");
                }

                scanner.close();
            }

    // Método para leer una matriz desde el teclado
    public static int[][] leerMatriz(Scanner scanner, int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Posicion: [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    // Método para sumar dos matrices
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener la misma dimensión");
        }

        int filas = a.length;
        int columnas = a[0].length;
        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        return suma;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Suma de las matrices:");
                for (int i = 0; i < matriz.length; i++) {
            System.out.print(" [");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "][");
            }
        }
    }
}