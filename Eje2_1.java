import java.util.Scanner;

public class Eje2_1 {
    public static void main(String[] args) {
        int a;
        int b;
        int s;
        System.out.println("Suma de dos numeros");
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        a = sc.nextInt();
        System.out.println("Ingrese otro numero:");
        b = sc.nextInt();

        s = a + b;
        System.out.println("La suma de los numeros es: "+s);
    }
}
