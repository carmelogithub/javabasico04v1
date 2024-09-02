package herencia;

public class Hijo extends Padre{
    private String escuela;

    public Hijo(String nombre, int edad, String escuela){
        super(nombre, edad);
        this.escuela = escuela;
    }//cierra constructor

    public String jugar(){
        return "Estoy jugando";
    }

    @Override
    public void saludar(){//sobreescritura de métodos
        System.out.println("Hola, soy " + getNombre() + " y tengo " + getEdad() + " años y estudio en " + escuela);
    }
}
