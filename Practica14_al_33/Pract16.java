package Practica14_al_33;

import Practicas_6_al_13.pract8_Animales;

import java.util.Scanner;
import java.util.Stack;

public class Pract16 {
    public static void main(String[] args) {
//Crear una pila de enteros y determinar si un número dado está en la pila.
        Stack<Integer> pila=new Stack<>();
pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        Scanner sc= new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO DEL 1 AL 10:");
        int num= sc.nextInt();
        boolean encontrado=false;
        for (int elemento : pila) {
            if (elemento == num) {
                encontrado = true;
                break;
            }
        }

            if (encontrado){
                System.out.println("el numero: "+num +" se encuentra en la pila");
            }else {
                System.out.println("No se encuentra");
            }


    }
}
