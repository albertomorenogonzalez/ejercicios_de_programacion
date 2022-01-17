import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Devuelve el dígito que está en la posición n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio06AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE DEVUELVE EL DÍGITO DE LA POSICIÓN INTRODUCIDA DE UN NÚMERO INTRODUCIDO");
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca la posición de la que quiere ver el dígito: ");
    System.out.print("> ");
    int posicion = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.println(funciones.funcionesTema801.digitoN(numero, posicion));
  }
}