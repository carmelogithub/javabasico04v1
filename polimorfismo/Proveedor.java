package polimorfismo;

public class Proveedor extends Interesado{

    public Proveedor(String nombre) {
        super(nombre);
    }

    public void facturar(){
        System.out.println("Al proveedor se factura dos veces al mes");
    }
}
