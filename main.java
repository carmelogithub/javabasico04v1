public class main {//No recomendable nombrar a la clase con el misno nombre que el método
    public static void main(String[] args) {
        System.out.println("Control de excepciones en Java - ud7");

        try{
            float numero1=5.3f;
            float numero2=0.0f;
            float cociente=numero1/numero2;
            if(numero2==0)
             {
                 System.out.println("no se puede dividir por cero");
             }
            System.out.println("El cociente de "+numero1+" y "+numero2+" es "+cociente);

        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }




    }
}
