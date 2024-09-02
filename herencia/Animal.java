package herencia;

public class Animal {

    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }//cierra constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String comer(){
        return "Estoy comiendo";
    }

    public String saludar(){
        return "Hola, soy un animal";
    }

}//cierra clase
