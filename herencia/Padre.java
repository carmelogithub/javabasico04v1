package herencia;

public class Padre {
    private String nombre;
    private int edad;

    public Padre(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }
}//cierra clase
