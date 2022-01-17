import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Escribe un programa que devuelva por pantalla el menor número primo
 * que sea mayor a un número introducido
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio03AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE DEVUELVE POR PANTALLA EL MENOR NÚMERO PRIMO QUE SEA MAYOR A UN NÚMERO INTRODUCIDO");
    System.out.println("-----------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.println("El menor número primo que sea mayor a " + numero + " es " + funciones.funcionesTema801.siguientePrimo(numero));
  }
}