package polimorfismo;

public abstract class Interesado {//impide que se pueda crear un objeto. NO puede ser instanciada la clase Interesado

private String nombre;

    public Interesado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar(){
        System.out.println("Interesado: "+nombre);
    }

    public void facturar(){
        System.out.println("Facturando a: "+nombre);
    }

}//cierra clase
