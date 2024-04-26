package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pract13 {
    public static void main(String[] args) {
//Crea un programa en el cual te deje agrega personas a la cola, quitar de la cola y mostrar la cola con un menú interactivo por ejemplo:
//
//agregar a la cola
//retirar de la cola
//mostrar la cola
//salir
        Queue<String> cola=new LinkedList();
        Scanner sc=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
       boolean mientras=true;
        while (mientras){
            System.out.println("MENU");
            System.out.println("1.- Agregar nombre");
            System.out.println("2.- Quitar nombre");
            System.out.println("3.- Mostrar nombre");
            System.out.println("1.- Salir");
            int opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre:");

                    cola.add(str.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la persona que desea retirar de la cola: ");
                    String persona = str.nextLine();
                    if (cola.remove(persona)) {
                        System.out.println(persona + " ha sido retirado(a) de la cola.");
                    } else {
                        System.out.println(persona + " no se encontraba en la cola.");
                    }
                    break;
                case 3:

                    System.out.println(cola);

                    break;
                case 4:
                    mientras=false;
                    System.out.println("Saliendo del programa");
                    break;

            }
        }

    }
}
