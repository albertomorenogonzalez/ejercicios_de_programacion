import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio06AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE PIDE UN NUMERO Y LUEGO LO MUESTRA AL REVÉS");
    System.out.println("--------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println(numero + " volteado es " + funciones.funcionesTema801.voltea(numero));
  }
}