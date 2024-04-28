package Practica14_al_33;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Pract26 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Animal" y contar cuántos animales de cada especie hay en la lista.
        Stack<Pract26_Animal> pila=new Stack<>();
        pila.push(new Pract26_Animal("gato","felino"));
        pila.push(new Pract26_Animal("leon","felino"));
        pila.push(new Pract26_Animal("perro","canido"));
        pila.push(new Pract26_Animal("lobo","canido"));
        pila.push(new Pract26_Animal("nemo","pez"));
        pila.push(new Pract26_Animal("bagre","pez"));
        pila.push(new Pract26_Animal("tiburoncin","pez"));
        pila.push(new Pract26_Animal("mantis","insecto"));
        pila.push(new Pract26_Animal("gusano","insecto"));
        System.out.println(pila);

        Map<String, Integer> conteoAnimales = new HashMap<>();
        for (Pract26_Animal animal : pila) {
            String especie = animal.getEspecie();
            conteoAnimales.put(especie, conteoAnimales.getOrDefault(especie, 0) + 1);
        }

        System.out.println("Cantidad de animales de cada especie:");
        for (Map.Entry<String, Integer> entry : conteoAnimales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}