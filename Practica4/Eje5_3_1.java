package Practica4;

import java.util.Scanner;

public class Eje5_3_1 {
    public static void main(String[] args) {
        System.out.println("BIG OLD");
        int n,i,x;
        System.out.println("Ingrese la cantidad de choferes");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        char nombres [][]=new char[n][30];
        int kil[][]=new int[n][6];
        char [][] dias =new char [5][];
dias[][]="Lunes","Martes","Miercoles","Jueves","Viernes","Sabado" ;
        };
for (i = 0; i < n; i++)//filas
    {
        printf("\nIntroduzca el nombre del chofer: %d\n", i + 1);
        scanf("%s", nombres[i]);

        for (x = 0; x < 6; x++)//columnas
        {
            printf("\nIntroduzca la velocidad de kilometros a los que conduce:\n");
            scanf("%d", &kilometros[i][x]);
        }
    }

  for (i = 0; i < n; i++)//filas
    {
        int suma[i];
        suma[i] = 0;
        printf("\nConductor %d\n", i + 1);
        printf("Nombre: %s\n", nombres[i]);
        suma[i] += kilometros[i][x];
        for (x = 0; x < 6; x++)//columnas
        {
            printf("Dia: %s\n", dias[x]);
            printf("%d Km\n", kilometros[i][x]);
        }
        printf("El total de kilometros recorridos en la semana: %d\n\n", suma[i]);
    }
    }
}
