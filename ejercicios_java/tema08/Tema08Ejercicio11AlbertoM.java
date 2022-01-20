import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Programa que añade un dígito a un número por detrás.

 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio11AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE AÑADE UN DÍGITO A UN NÚMERO POR DETRÁS");
    System.out.println("----------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el dígito que quiere añadir: ");
    System.out.print("> ");
    int numDigitos = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.print("El nuevo número es " + funciones.funcionesTema801.pegaPorDetras(numero, numDigitos));
  }
}