package herencia;

public class Ejecutar {

    public static void main(String[] args) {
        Padre padre = new Padre("Juan", 20);
       padre.saludar();
    Hijo hijo = new Hijo("Pedro", 10, "Escuela 1");
    hijo.saludar();

System.out.println(hijo.jugar());

        Gato gato = new Gato("Mizifu");
        Perro perro = new Perro("Pluto");
        System.out.println(gato.comer());
        System.out.println(perro.comer());
        System.out.println(gato.maullar());
        System.out.println(perro.ladrar());

    }//cierra main





}//cierra clase


