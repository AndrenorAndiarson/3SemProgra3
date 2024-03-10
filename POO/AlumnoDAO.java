package POO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlumnoDAO {
    public static void crearAlumnoDB(Alumno alumno) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_conConnection()) {
            try {
                String query = "INSERT INTO `PONER ACA BD`.`TABLA` (`Nombre`, `Telefono`, `Direccion`, `CorreoElectronico`) VALUES (?, ?, ?, ?)";
                try (PreparedStatement ps = conexion.prepareStatement(query)) {
                    ps.setString(1, alumno.getNombre());
                    ps.setString(2, alumno.getTelefono());
                    ps.setString(3, alumno.getDireccion());
                    ps.setString(4, alumno.getCorreoElectronico());

                    // Ejecutar la consulta de inserción
                    ps.executeUpdate();

                    System.out.println("Alumno insertado correctamente.");
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void leerAlumnoDB(){
        Conexion db_conexion = new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try (Connection conexion = db_conexion.get_conConnection()){
            String query= "SELECT * FROM alumno";
            ps = conexion.prepareStatement(query);
            rs= ps.executeQuery();
            while (rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("NOMBRE: "+rs.getString("Nombre"));
                System.out.println("TELEFONO: "+rs.getString("Telefono"));
                System.out.println("DIRECCION: "+rs.getString("Direccion"));
                System.out.println("CORREO ELECTRONICO: "+rs.getString("CorreoElectronico"));
                System.out.println("------------------------------");
            }

        } catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void eliminarAlumno(int idAlumno) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_conConnection()) {
            try {
                String query ="DELETE FROM `AGREAGAR BD`.`TABLA` WHERE `id` = ?";

                try (PreparedStatement ps = conexion.prepareStatement(query)) {
                    ps.setInt(1, idAlumno);

                    int filasAfectadas = ps.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("No se encontro el Alumno con el id proporcionado.");
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void actualizarAlumno(Alumno alumno) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_conConnection()) {
            try {
                String query = "UPDATE `AGREGAR BASE`.`TABLA` SET `Nombre` = ?, `Telefono` = ?, `Direccion` = ?, `CorreoElectronico` = ? WHERE `id` = ?";

                try (PreparedStatement ps = conexion.prepareStatement(query)) {
                    ps.setString(1, alumno.getNombre());
                    ps.setString(2, alumno.getTelefono());
                    ps.setString(3, alumno.getDireccion());
                    ps.setString(4, alumno.getCorreoElectronico());
                    ps.setInt(5, alumno.getId());

                    int filasAfectadas = ps.executeUpdate();

                    if (filasAfectadas > 0) {
                        System.out.println("Alumno actualizado correctamente.");
                    } else {
                        System.out.println("No se encontro el Alumno con la ID proporcionada.");
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
