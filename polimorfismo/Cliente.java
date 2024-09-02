package polimorfismo;

public class Cliente extends Interesado{

    public Cliente(String nombre) {
        super(nombre);
    }

    public void facturar(){
        System.out.println("Al cliente se factura a final de mes");
    }
}//cierra clase
