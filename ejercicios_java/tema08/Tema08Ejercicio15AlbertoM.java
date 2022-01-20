import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio15AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE MUESTRA LOS NÚMEROS PRIMOS QUE HAY ENTRE EL 1 Y EL 1000");
    System.out.println("---------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Los números primos que hay entre el 1 y el 1000 son:\n");

    for (int i = 1;i <= 1000; i++) {
      if (funciones.funcionesTema801.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}