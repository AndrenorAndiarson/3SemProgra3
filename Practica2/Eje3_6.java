package Practica2;

import java.util.Scanner;

public class Eje3_6 {
    public static void main(String[] args) {
        System.out.println("LANGOSTA AHUMADA");
        int numper,total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de personas:");
        numper= sc.nextInt();
if (numper>300){
    total=numper*75;
}else if (numper>200){
    total=numper*85;
}else {
    total=numper*95;
}
        System.out.println("El total es: "+total);

    }
}
