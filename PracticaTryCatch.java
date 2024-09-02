import java.util.Scanner;

public class PracticaTryCatch {
    public static void main(String[] args) {
        System.out.println("Práctica de control de excepciones");
        System.out.println("Introduce un número");
        //El programe pide por consola un número al usuario.
        Scanner sc = new Scanner(System.in);
        try{
            int numero=  sc.nextInt(); //si el usuario no introduce un número, generará un error
            //El programa debe mostrar un mensaje que indique si el número introducido es 4 o 7
            if(numero==4 || numero==7){
                System.out.println("Tienes buena suerte");
            }
            else{
                System.out.println("Mala suerte");
            }
        }
        catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
            System.out.print("Por favor, introduce un número");
        }




    }//cierra método main
}//cierra clase