package POO;

import java.util.Scanner;

public class AlumnoService {
    public static void crearAlumno(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del nuevo cliente: ");
        String nombre;
        nombre=sc.nextLine();
        System.out.println("Ingrese Telefono: ");
        String telf;
        telf= sc.nextLine();
        System.out.println("Ingrese Direccion: ");
        String direccion;
        direccion= sc.nextLine();
        System.out.println("Ingrese su e-mail: ");
        String correo;
        correo= sc.nextLine();

        Alumno alumno= new Alumno();
        alumno.setNombre(nombre);
        alumno.setCorreoElectronico(correo);
        alumno.setTelefono(telf);
        alumno.setDireccion(direccion);
        AlumnoDAO.crearAlumnoDB(alumno);
    }
    public static void listarAlumno(){
        AlumnoDAO.leerAlumnoDB();
    }
    public static void eliminarAlumno() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el id del alumno que desea eliminar: ");
        int idAlumnoAEliminar = scanner.nextInt();

        AlumnoDAO.eliminarAlumno(idAlumnoAEliminar);

    }

    public static void editarAlumno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nuevo nombre: ");
        String nom= sc.nextLine();
        System.out.println("Escribe el nuevo telefono: ");
        String telf= sc.nextLine();
        System.out.println("Escribe el nuevo direccion: ");
        String dire= sc.nextLine();
        System.out.println("Escribe el nuevo correo electronico: ");
        String correo= sc.nextLine();

        System.out.println("Indica el ID del cliente a editar: ");
        int id_alu= sc.nextInt();
        Alumno actuaAlumno = new Alumno();
        actuaAlumno.setNombre(nom);
        actuaAlumno.setTelefono(telf);
        actuaAlumno.setDireccion(dire);
        actuaAlumno.setCorreoElectronico(correo);
        actuaAlumno.setId(id_alu);

        AlumnoDAO.actualizarAlumno(actuaAlumno);
    }

}
