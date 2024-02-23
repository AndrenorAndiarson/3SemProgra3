package Practica2;

import java.util.Scanner;

public class Eje3_7 {
    public static void main(String[] args) {
        System.out.println("PRECIO UVAS");
        double tamaño,ganancia;
        double precio,kilos;
        String tipo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el tipo de uva A o B");
        tipo= sc.nextLine();
        System.out.println("Ingrese el tamaño de la uva 1 o 2:");
        tamaño= sc.nextDouble();
        System.out.println("Ingrese el precio:");
        precio= sc.nextDouble();
        System.out.println("ingrese los kilos de uva:");
        kilos= sc.nextDouble();
        if (tipo == String.valueOf('A')){
            if (tamaño==1){
                precio=precio+0.2;
            }else {
                precio=precio+0.3;
            }
        }else if (tamaño==2){
            precio=precio-0.3;
        }else {
            precio=precio-0.5;
        }
    ganancia=precio*kilos;
        System.out.println("La ganancia sera: "+ganancia);

    }
}
