package Practicas_6_al_13;

import java.util.LinkedList;
import java.util.Queue;

public class pract8_Animales {
    String animal;

    public pract8_Animales(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "pract8_Animales{" +
                "animal='" + animal + '\'' +
                '}';
    }
}
