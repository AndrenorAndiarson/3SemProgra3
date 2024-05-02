package Practica14_al_33;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class Pract28 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Libro" y
        // ordenarla por el autor y luego por el título.

        Stack <Pract28_Libro> pila=new Stack<>();
        pila.push(new Pract28_Libro("El señor de los anillos", "J.R.R. Tolkien"));
        pila.push(new Pract28_Libro("Sangre de mestizos", "Augusto Cespedes"));
        pila.push(new Pract28_Libro("Harry Potter y la piedra filosofal", "J.K. Rowling"));
        pila.push(new Pract28_Libro("El código Da Vinci", "Dan Brown"));
        pila.push(new Pract28_Libro("Cien años de soledad", "Alberto Hurtado"));
        pila.push(new Pract28_Libro("Silmarillion", "J.R.R. Tolkien"));
        pila.push(new Pract28_Libro("El Hobbit", "J.R.R. Tolkien"));
        pila.push(new Pract28_Libro("Raza de bronce", "Alcides Arguedas"));
        pila.push(new Pract28_Libro("Borrachera verde", "Raul Botelho"));

        Collections.sort(pila, new Comparator<Pract28_Libro>() {
            @Override
            public int compare(Pract28_Libro o1, Pract28_Libro o2) {

                int compararAutor = o1.getAutor().compareTo(o2.getAutor());
               if (compararAutor !=0 ){
                   return compararAutor;

               }
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        });
        for (Pract28_Libro i : pila){
            System.out.println(i.getAutor()+"  -  "+i.getTitulo());
        }
    }
}
