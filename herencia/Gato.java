package herencia;

public class Gato extends Animal{

    public Gato(String nombre){
        super(nombre);//es una atributo de la clase Padre
    }//cierra constructor
    public String maullar(){
        return "Miau";
    }

}

