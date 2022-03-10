import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema10Ejercicio04AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE ORDENA 10 PALABRAS INTRODUCIDAS POR TECLADO");
    System.out.println("--------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca 10 palabras:");

    ArrayList<String> lista = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      System.out.print("> ");
      lista.add(s.nextLine());
      System.out.println(" ");
    }

    Collections.sort(lista);

    System.out.println("\nArray List ordenado:\n");

    System.out.println(lista);
  }
}