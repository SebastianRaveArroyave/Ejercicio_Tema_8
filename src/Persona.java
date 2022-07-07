public class Persona {
    private String Nombre, Telefono;
    private int Edad;

    public Persona() {
    }

    public Persona(String nombre, String telefono, int edad) {
        Nombre = nombre;
        Telefono = telefono;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }
}
