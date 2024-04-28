package Practica14_al_33;

import java.util.Stack;

public class Pract21 {
    public static void main(String[] args) {
        //Crear una pila de enteros y calcular la suma de los elementos.
        Stack<Integer> pila=new Stack<>();
        for (int i=0;i<10;i++){
            pila.push(i);
        }
int suma=0;
        System.out.println("la pila contiene: "+pila);

        for (Integer i:pila             ) {
            suma=suma+i;
        }
        System.out.println("La suma total es:" + suma);
    }
}
