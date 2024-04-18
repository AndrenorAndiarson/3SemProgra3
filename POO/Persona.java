package POO;

public class Persona {
    private int ci;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    public Persona(int ci, String nombre, String apellido1, String apellido2, int edad){
        this.ci = ci;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }
    public void Show(){
        System.out.println("//");
        System.out.println(ci);
        System.out.println(nombre);
        System.out.println(apellido1);
        System.out.println(apellido2);
        System.out.println(edad);
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
