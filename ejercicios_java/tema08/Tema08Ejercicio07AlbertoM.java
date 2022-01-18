import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Devuelve el dígito que está en la posición n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio07AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE DEVUELVE EL DÍGITO DE LA POSICIÓN INTRODUCIDA DE UN NÚMERO INTRODUCIDO");
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca la posición de la que quiere ver el dígito (la primera posición es la número 0 y va de izquierda a derecha): ");
    System.out.print("> ");
    int posicion = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.println("El dígito en la posición número " + posicion + " es el " + funciones.funcionesTema801.digitoN(numero, posicion));
  }
}