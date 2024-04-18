package Metodos_Funciones;

import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra para ver si es palindromo: ");
        String palin= sc.nextLine();
        String rev="";
        char palabra;
        for (int i=0;i<palin.length();i++){
            palabra=palin.charAt(palin.length()-1-i);
            rev=rev+palabra;
        }
        System.out.println(rev);
        if (palin.equals(rev)){
            System.out.println("Es Palindromo");
        } else {
            System.out.println("No es Palindromo");
        }


    }

}
