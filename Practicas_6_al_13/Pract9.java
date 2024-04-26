package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pract9 {
  //Crear una cola y agregar los elementos "rojo", "verde", "azul" y "amarillo".
    // utiliza programación orientada a objetos Luego, eliminar el elemento rojo
    // y el elemento amarillo  e  imprimir los elementos de la cola.
  public static void main(String[] args) {
      Queue <pract9_colores> nombre=new LinkedList<>();
      Scanner sc=new Scanner(System.in);

      System.out.println("Ingrese el primer color");
      pract9_colores col1=new pract9_colores(sc.nextLine());
      System.out.println("Ingrese el segundo color");
      pract9_colores col2=new pract9_colores(sc.nextLine());
      System.out.println("Ingrese el tercer color");
      pract9_colores col3=new pract9_colores(sc.nextLine());
      System.out.println("Ingrese el cuarto color");
      pract9_colores col4=new pract9_colores(sc.nextLine());

      nombre.add(col1);
      nombre.add(col2);
      nombre.add(col3);
      nombre.add(col4);
      System.out.println("LOS COLORES SON:");
      for (pract9_colores i:nombre) {
          System.out.println(i);
      }
      System.out.println("LOS NUEVOS COLORES SON:");
      while (!nombre.isEmpty()) {
          pract9_colores nombres = nombre.peek();
          if (nombres.getNombres().equals("rojo") || nombres.getNombres().equals("amarillo")) {
              nombre.poll();
          } else {
              break;
          }
      }
      // Imprime los elementos restantes de la cola
      while (!nombre.isEmpty()) {
          System.out.println(nombre.poll());
      }

    }
}




