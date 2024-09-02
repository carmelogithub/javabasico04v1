import java.io.FileNotFoundException;

public class PracticaFichero {

    public static void main(String[] args) throws FileNotFoundException {
        //Leer el contenido de un archivo que es en C:\Users\Tecnicos\Documents\mensaje.txt
        //muestra el contenido del archivo en consola
        //controla las excepciones de no acceso al archivo, porque no existe, permisos, formatos...

        String ruta="C:\\Users\\Tecnicos\\Documents\\mensaje.txt";
        try{
            java.io.FileReader fr = new java.io.FileReader(ruta);
            java.io.BufferedReader br = new java.io.BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }//cierra while
            br.close();
            fr.close();
        }
        catch(java.io.FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
            System.out.println("No se ha encontrado el archivo");
           // throw new FileNotFoundException("no encuentro el fichero con throw");
        }
        catch(java.io.IOException e){
            System.out.println("Error: "+e.getMessage());
            System.out.println("Error de acceso al archivo");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("El programa ha finalizado");
        }

    }//cierra main

}//cierra clase
