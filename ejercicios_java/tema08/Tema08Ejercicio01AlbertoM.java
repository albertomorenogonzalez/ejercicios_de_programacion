import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio01AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO ES O NO CAPICÚA");
    System.out.println("-----------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    if (funcionesTema801.esCapicua(numero)) {
      System.out.println(numero + " es capicúa");
    } else {
      System.out.println(numero + " no es capicúa");
    }
  }
}
