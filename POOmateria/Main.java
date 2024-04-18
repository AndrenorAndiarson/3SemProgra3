package POOmateria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        private static List<Alumno> alumnos = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            boolean continuar = true;
            while (continuar) {
                System.out.println("\nMenú:");
                System.out.println("1. Registrar alumno");
                System.out.println("2. Seleccionar alumno");
                System.out.println("3. Listar alumnos");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        registrarAlumno();
                        break;
                    case 2:
                        seleccionarAlumno();
                        break;
                    case 3:
                        listarAlumnos();
                        break;
                    case 4:
                        continuar = false;
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente nuevamente.");
                }
            }

            scanner.close();
        }

        private static void registrarAlumno() {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombreAlumno = scanner.nextLine();
            Alumno nuevoAlumno = new Alumno(nombreAlumno);
            alumnos.add(nuevoAlumno);
            System.out.println("Alumno registrado correctamente.");
        }

        private static void seleccionarAlumno() {
            System.out.print("Ingrese el nombre del alumno que desea seleccionar: ");
            String nombreAlumno = scanner.nextLine();
            Alumno alumnoSeleccionado = buscarAlumnoPorNombre(nombreAlumno);

            if (alumnoSeleccionado == null) {
                System.out.println("Alumno no encontrado.");
                return;
            }

            System.out.println("Alumno seleccionado: " + alumnoSeleccionado.getNombre());
            boolean gestionarAlumno = true;
            while (gestionarAlumno) {
                System.out.println("\nMenú de alumno:");
                System.out.println("1. Agregar materia y nota");
                System.out.println("2. Eliminar materia y nota");
                System.out.println("3. Listar notas");
                System.out.println("4. Volver");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        agregarMateriaYNota(alumnoSeleccionado);
                        break;
                    case 2:
                        eliminarMateriaYNota(alumnoSeleccionado);
                        break;
                    case 3:
                        alumnoSeleccionado.mostrarNotas();
                        break;
                    case 4:
                        gestionarAlumno = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente nuevamente.");
                }
            }
        }

        private static void agregarMateriaYNota(Alumno alumno) {
            System.out.print("Ingrese el nombre de la materia: ");
            String nombreMateria = scanner.nextLine();
            System.out.print("Ingrese el código de la materia: ");
            String codigoMateria = scanner.nextLine();
            Materia materia = new Materia(nombreMateria, codigoMateria);
            System.out.print("Ingrese la nota de la materia: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();  // Limpiar el buffer de entrada

            alumno.agregarNota(materia, nota);
            System.out.println("Materia y nota agregadas correctamente.");
        }

        private static void eliminarMateriaYNota(Alumno alumno) {
            System.out.print("Ingrese el nombre de la materia a eliminar: ");
            String nombreMateria = scanner.nextLine();

            Materia materiaParaEliminar = null;
            for (Nota notaActual : alumno.notas) {
                if (notaActual.getMateria().getNombre().equals(nombreMateria)) {
                    materiaParaEliminar = notaActual.getMateria();
                    break;
                }
            }

            if (materiaParaEliminar != null) {
                alumno.eliminarNota(materiaParaEliminar);
                System.out.println("Materia y nota eliminadas correctamente.");
            } else {
                System.out.println("La materia especificada no se encontró.");
            }
        }

        private static void listarAlumnos() {
            System.out.println("Lista de alumnos registrados:");
            for (Alumno alumno : alumnos) {
                System.out.println("- " + alumno.getNombre());
            }
        }

        private static Alumno buscarAlumnoPorNombre(String nombre) {
            for (Alumno alumno : alumnos) {
                if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                    return alumno;
                }
            }
            return null;
        }
    }