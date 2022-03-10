import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema10Ejercicio03AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE ORDENA 10 NÚMEROS INTRODUCIDOS POR TECLADO");
    System.out.println("--------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca 10 números:");

    ArrayList<Integer> numero = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      System.out.print("> ");
      numero.add(Integer.parseInt(s.nextLine()));
      System.out.println(" ");
    }

    Collections.sort(numero);

    System.out.println("\nArray List ordenado:\n");

    System.out.println(numero);
  }
}