package POO;

public class Alumno {
    int id;
    String Nombre;
    String Telefono;
    String Direccion;
    String CorreoElectronico;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String telefono, String direccion, String correoElectronico) {
        this.id = id;
        Nombre = nombre;
        Telefono = telefono;
        Direccion = direccion;
        CorreoElectronico = correoElectronico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }
}

