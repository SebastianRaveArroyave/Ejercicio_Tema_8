public class Main {
    public static void main(String[] args) {
        Persona Obj_Persona = new Persona();

        Obj_Persona.setNombre("Sebastian");
        Obj_Persona.setEdad(30);
        Obj_Persona.setTelefono("+57 444 444 4444");

        System.out.println("Nombre: " + Obj_Persona.getNombre());
        System.out.println("Edad: " + Obj_Persona.getEdad());
        System.out.println("Telefono: " + Obj_Persona.getTelefono());
    }
}