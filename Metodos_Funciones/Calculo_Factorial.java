package Metodos_Funciones;

import java.util.Scanner;

public class Calculo_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular su factorial: ");
        int numero = scanner.nextInt();

        try {
            int resultado = calcularFactorial(numero);
            // Imprimir el resultado
            System.out.println("El factorial de " + numero + " es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
        }

    private static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}