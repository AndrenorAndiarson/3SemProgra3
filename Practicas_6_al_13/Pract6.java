package Practicas_6_al_13;
import  java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Pract6 {
    public static void main(String[] args) {
        //Crear una cola vacía y agregar los primeros 10 números impares. Luego, imprimir los elementos de la cola. //
        Queue<Integer> cola = new LinkedList<>();
        int num = 1;
        for (int i=1;i<10;i=i+2){
            cola.add(i);
        }

        for (Integer i:cola  ) {
            System.out.println(i);
        }

    }}