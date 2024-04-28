package Practica14_al_33;

import java.util.Stack;

public class Pract19 {
   // Crear una pila de enteros y encontrar el número máximo y mínimo
    // en la pila.
   public static void main(String[] args) {

       Stack<Integer> pila=new Stack<>();
       for (int i=0;i<13;i++) {
           pila.push(i);
       }
       int max=0;
       int min=0;
       for (int i=0;i<pila.size();i++){
           if (i<=pila.firstElement()){
               min=i;
           }else {
               if (i<=pila.lastElement()){
                   max=i;

               }
       }
   }
       System.out.println(pila);
       System.out.println(min);
       System.out.println(max);
}}
