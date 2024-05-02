package Practica14_al_33;

import java.util.Stack;

public class Pract29 {
    public static void main(String[] args) {
        //Crear una lista de objetos "CuentaBancaria" y calcular la suma total de los saldos.

        Stack<Pract29_CuentaBancaria> pila=new Stack<>();
        pila.push(new Pract29_CuentaBancaria(01,new int[]{90,80,100}));
        pila.push(new Pract29_CuentaBancaria(02,new int[]{50,80,100}));
        pila.push(new Pract29_CuentaBancaria(03,new int[]{110,80,100}));
        pila.push(new Pract29_CuentaBancaria(04,new int[]{50,80,100}));
        pila.push(new Pract29_CuentaBancaria(05,new int[]{100,80,100}));

double sumaTotal=calcularSuma(pila);
        System.out.println("La suma total de los saldos es: "+ sumaTotal);

    }

    public static double calcularSuma(Stack<Pract29_CuentaBancaria> cuentas) {
        double sumaTot = 0;
        for (Pract29_CuentaBancaria cuenta : cuentas) {
            sumaTot += cuenta.sumaSaldos();
        }
        return sumaTot;
    }
}


