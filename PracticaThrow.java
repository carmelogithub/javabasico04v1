import java.util.Scanner;

public class PracticaThrow {

    public static void main(String[] args){
        System.out.println("Práctica de control de excepciones con Throw");
        //adaptar el ejercicio de TryCatch a Throw.

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
            if(numero==0){
                throw new Exception("No se puede dividir por cero");
            }
        }
        catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
            System.out.print("Por favor, introduce un número");
           // throw new IllegalArgumentException("Las letras no son números");
        }//cierra catch
        finally{
            System.out.println("El programa ha finalizado");
        }//cierra finally



    }//cierra main

}//cierra clase
