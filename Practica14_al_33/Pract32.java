package Practica14_al_33;

import java.util.Stack;

public class Pract32 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Fruta" y filtrar solo las frutas
        // que tienen más de 50 calorías por porción.
        Stack<Pract32_Frutas> pila=new Stack<>();
        pila.push(new Pract32_Frutas("Manzana",60));
        pila.push(new Pract32_Frutas("Platano",100));
        pila.push(new Pract32_Frutas("Naranja",45));
        pila.push(new Pract32_Frutas("Pera",49));
        pila.push(new Pract32_Frutas("Mandarina",70));
        pila.push(new Pract32_Frutas("Sandia",30));
Stack<Pract32_Frutas> filtro=new Stack<>();
for (Pract32_Frutas i:pila){
    if (i.getCalorias()>50){
        filtro.push(i);
    }

}
        System.out.println("LISTA FRUTAS");
        System.out.println(pila);
        System.out.println("FRUTAS CON MAS DE 50 CALORIAS:");
        while (!filtro.isEmpty()){
          Pract32_Frutas fruta=filtro.pop();
            System.out.println(fruta.getNombre()+" - "+fruta.getCalorias()+" calorias");
        }

    }
}
