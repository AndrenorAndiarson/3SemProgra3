package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("==== MENU PRINCIPAL ====");
            System.out.println("1- Crear Alumno");
            System.out.println("2- Listar Alumnos");
            System.out.println("3- Editar Alumno");
            System.out.println("4- Eliminar Alumno");
            System.out.println("5- Salir");
            System.out.print("Seleccione una opcion: ");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    AlumnoService.crearAlumno();
                    break;
                case 2:
                    AlumnoService.listarAlumno();
                    break;
                case 3:
                    AlumnoService.editarAlumno();
                    break;
                case 4:
                    AlumnoService.eliminarAlumno();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor seleccione una opccion valida ");


            }


        } while (opcion!=4);{

            sc.close();
        }

    }
}
