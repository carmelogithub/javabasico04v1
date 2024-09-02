package herencia;

public class Perro extends Animal{

    public Perro(String nombre){
        super(nombre);//es una atributo de la clase Padre
    }//cierra constructor
    public String ladrar(){
        return "Guau";
    }

}//cierra clase Perro
