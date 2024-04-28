package Practica14_al_33;

import java.util.Scanner;
import java.util.Stack;

public class Pract18 {
    public static void main(String[] args) {
        //Crear una pila de caracteres y verificar si una cadena
        // de caracteres dada es un palíndromo. (anitalavalatina)
        Stack<Character> pila=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE UN PALINDROMO");
        String palin=sc.nextLine();

        for (int i=0;i<palin.length();i++){
            pila.push(palin.charAt(i));
        }
        String inverida="";
        while (!pila.isEmpty()){
            inverida+=pila.pop();
        }
        if (palin.equals(inverida)){
            System.out.println(palin+ " Es un palindromo");
        }else {
            System.out.println(palin+ " No es un palindromo");
        }


    }
}
