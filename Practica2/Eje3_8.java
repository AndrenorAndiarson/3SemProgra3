package Practica2;

import java.util.Scanner;

public class Eje3_8 {
    public static void main(String[] args) {
        System.out.println("COMPAÑIA DE AUTOBUSES");
        int numalum;
        double precio,precioalum,total;
        total=0;
        int preciofijo=4000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos que asistira al viaje:");
        numalum=sc.nextInt();
        if (numalum>=100){
            precioalum=(numalum*65);
            total=precioalum+preciofijo;
            System.out.println("El precio total sera: "+total);
            System.out.println("Y el precio por alumno sera: "+precioalum/numalum);
        } else if (numalum>=50) {
            precioalum=((numalum*70));
            total=precioalum+preciofijo;
            System.out.println("El precio total sera: "+total);
            System.out.println("Y el precio por alumno sera: "+precioalum/numalum);
        } else if (numalum>=30) {
            precioalum=((numalum*95));
            total=precioalum+preciofijo;
            System.out.println("El precio total sera: "+total);
            System.out.println("Y el precio por alumno sera: "+precioalum/numalum);
        }
        else {
            precioalum=preciofijo/numalum;
            System.out.println("El precio por alumno total sera: "+precioalum);
        }

    }
}
