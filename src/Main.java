public class Main {
    public static void main(String[] args) {
        Persona Tomas = new Persona();
        Tomas.setEdad(23);
        Tomas.setNombre("Tomas");
        Tomas.setTelefono("motorola");

        System.out.println(Tomas.getEdad());
        System.out.println(Tomas.getTelefono());
        System.out.println(Tomas.getNombre());

    }
}








class Persona{
    private int edad;
    private String nombre;
    private String telefono;


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
