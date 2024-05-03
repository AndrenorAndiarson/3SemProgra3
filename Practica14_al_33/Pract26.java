package Practica14_al_33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Pract26 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Animal" y contar cuántos animales de cada especie hay en la lista.
        ArrayList<Pract26_Animal> lista=new ArrayList<>();
        lista.add(new Pract26_Animal("gato","felino"));
        lista.add(new Pract26_Animal("leon","felino"));
        lista.add(new Pract26_Animal("perro","canido"));
        lista.add(new Pract26_Animal("lobo","canido"));
        lista.add(new Pract26_Animal("nemo","pez"));
        lista.add(new Pract26_Animal("bagre","pez"));
        lista.add(new Pract26_Animal("tiburoncin","pez"));
        lista.add(new Pract26_Animal("mantis","insecto"));
        lista.add(new Pract26_Animal("gusano","insecto"));
        System.out.println(lista);

        Map<String, Integer> conteoAnimales = new HashMap<>();
        for (Pract26_Animal animal : lista) {
            String especie = animal.getEspecie();
            conteoAnimales.put(especie, conteoAnimales.getOrDefault(especie, 0) + 1);
        }

        System.out.println("Cantidad de animales de cada especie:");
        for (Map.Entry<String, Integer> entry : conteoAnimales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}