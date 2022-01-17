import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. 
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio05AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE PIDE UNA BASE Y UN EXPONENTE Y QUE CALCULE LA POTENCIA");
    System.out.println("--------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");
    
    System.out.println("El número tiene " + funciones.funcionesTema801.digitos(numero) + " dígitos");
  }
}