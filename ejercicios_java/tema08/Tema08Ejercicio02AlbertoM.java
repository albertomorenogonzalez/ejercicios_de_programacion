import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio02AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO INTRODUCIDO ES PRIMO");
    System.out.println("----------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    if (funciones.funcionesTema801.esPrimo(numero)) {
      System.out.println("El "+ numero + " es primo");
    } else {
      System.out.println("El " + numero + " no es primo");
    }
  }
}