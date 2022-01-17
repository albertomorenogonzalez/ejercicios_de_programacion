import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio04AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE PIDE UNA BASE Y UN EXPONENTE Y QUE CALCULE LA POTENCIA");
    System.out.println("--------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la base: ");
    System.out.print("> ");
    int base = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.println("Introduzca el exponente (entero positivo): ");
    System.out.print("> ");
    int exponente = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.println(base + " elevado a " + exponente + " es igual a " + funciones.funcionesTema801.potencia(base, exponente));
  }
}