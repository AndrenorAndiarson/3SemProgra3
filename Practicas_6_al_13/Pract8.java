package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pract8 {
    public static void main(String[] args) {
        //Crear una cola y agregar los elementos "perro", "gato",
        // "conejo" y "loro" utiliza Programación orientada a
        // objetos. Luego, eliminar al conejo e
        // imprimir los elementos de la cola.//
        Scanner sc= new Scanner(System.in);
        Queue <pract8_Animales> nombres=new LinkedList<>();
            System.out.println("Ingrese el nombre");
            pract8_Animales perro=new pract8_Animales(sc.nextLine());
            System.out.println("Ingrese el nombre");
            pract8_Animales gato=new pract8_Animales(sc.nextLine());
            System.out.println("Ingrese el nombre");
            pract8_Animales conejo=new pract8_Animales(sc.nextLine());
            System.out.println("Ingrese el nombre");
            pract8_Animales loro=new pract8_Animales(sc.nextLine());
        nombres.add(perro);
        nombres.add(gato);
        nombres.add(conejo);
        nombres.add(loro);

        System.out.println("LISTA ANIMALES: ");
        for (pract8_Animales i:nombres) {
            System.out.println(i);
        }
        System.out.println("LISTA NUEVA ANIMALES");
        for (pract8_Animales i:nombres) {
            if (i.getAnimal().equals("conejo")){
                nombres.remove(i);
            }
            System.out.println(i);
        }
    }
}
