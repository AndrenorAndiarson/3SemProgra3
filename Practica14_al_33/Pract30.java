package Practica14_al_33;

import java.util.Stack;

public class Pract30 {
    public static void main(String[] args) {

        //Crear una lista de objetos "Producto" y encontrar el producto con el nombre más largo.
        Stack <Pract30_Producto> pila= new Stack<>();
        pila.push(new Pract30_Producto("leche"));
        pila.push(new Pract30_Producto("pan"));
        pila.push(new Pract30_Producto("queso"));
        pila.push(new Pract30_Producto("Pilfrut"));
        pila.push(new Pract30_Producto("huevo"));
       String productoMasLargo= null;
int largo=0;
String nomb = null;
for (Pract30_Producto i:pila){
    if (i.getNombre().length()>largo){
        largo=i.getNombre().length();
        nomb= i.getNombre();
    }
}
        System.out.println("Tamaño: "+largo +" Producto: "+ nomb);
    }
}
