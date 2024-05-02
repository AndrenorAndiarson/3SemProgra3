package Practica14_al_33;

import java.util.Stack;

public class Pract33 {
    public static void main(String[] args) {
        //Crear una lista de objetos "Estudiante" con una escala
        // de 1.0 a 10.0 pts. y filtrar solo los estudiantes que
        // tienen más de 5.0 de Pts.
        Stack<Pract33_Estudiante> pila=new Stack<>();
        pila.push(new Pract33_Estudiante("Doc",7.5));
        pila.push(new Pract33_Estudiante("Dre",9.5));
        pila.push(new Pract33_Estudiante("Yisus",5.5));
        pila.push(new Pract33_Estudiante("Lili",1.5));
        pila.push(new Pract33_Estudiante("Brasil",4.0));
        pila.push(new Pract33_Estudiante("Big Show",10.0));
Stack<Pract33_Estudiante> prom=new Stack<>();
for (Pract33_Estudiante i:pila){
    if (i.getPuntos()>5.0){
        prom.push(i);
    }
}
        System.out.println("Estudiantes con mas de 5.0 puntos");
while (!prom.isEmpty()){
    Pract33_Estudiante estudiantes=prom.pop();
    System.out.println(estudiantes.getNombre()+" "+estudiantes.puntos+" puntos");

}


    }
}
