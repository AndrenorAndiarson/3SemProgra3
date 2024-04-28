package Practica14_al_33;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Pract25 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Producto" y encontrar el producto con el precio más alto.
        Stack<Pract25_Producto> pila=new Stack<>();
        pila.push(new Pract25_Producto("calculadora",50));
        pila.push(new Pract25_Producto("carpeta",20));
        pila.push(new Pract25_Producto("plastoformo",10));
        pila.push(new Pract25_Producto("lapiz",5));
        pila.push(new Pract25_Producto("traper",40));

        System.out.println(pila);
        Pract25_Producto productoMasCaro = null;
        double precioMasAlto = Double.MIN_VALUE;

        for (Pract25_Producto producto : pila) {
            if (producto.getPrecio() > precioMasAlto) {
                precioMasAlto = producto.getPrecio();
                productoMasCaro = producto;
            }
        }
        System.out.println("Producto con el precio más alto:");
        System.out.println(productoMasCaro.toString());
    }
}