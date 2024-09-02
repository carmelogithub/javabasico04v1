package polimorfismo;

public class Gestionar {

    public static void main(String[] args){
        Object[] grupo= new Object[5];
        grupo[0]=new Cliente("Juan");
        grupo[1]=new Proveedor("Pedro");
        grupo[2]=new Cliente("Maria");
        grupo[3]=new Proveedor("Luis");
        grupo[4]=new Cliente("Ana");

        //no puedo crear un objeto Interesado porque es abstracta
       // Interesado interesado=new Interesado("Carlos");

        System.out.println(grupo);
        for (int i = 0; i < grupo.length; i++) {
            if(grupo[i] instanceof Cliente){
                Cliente c=(Cliente)grupo[i];
                c.mostrar();
                c.facturar();//Polimofismo. El mismo método retorna diferentes elementos dependiendo del objeto que lo llama
            }
            if(grupo[i] instanceof Proveedor){
                Proveedor p=(Proveedor)grupo[i];
                p.mostrar();
                p.facturar();
            }
        }
    }

}//cierra clase
