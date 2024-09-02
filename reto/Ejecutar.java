package reto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejecutar {
    public static void main(String[] args){
        //Muestra la fecha actual
        //la fecha de examen es 21/10/2024. Dime cuántos días quedan
        //muestra la fecha actual con este formato, Madrid, hoy 02 de septiembre del año 2024
        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);
        LocalDate fechaExamen = LocalDate.of(2024, 10, 21);
        long dias = fechaActual.until(fechaExamen).getDays();
        System.out.println("Quedan " + dias + " días para el examen");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("'Madrid, hoy' dd 'de' MMMM 'del año' yyyy");
        System.out.println(fechaActual.format(formato));
    }//cierra main

}//cierra clase
