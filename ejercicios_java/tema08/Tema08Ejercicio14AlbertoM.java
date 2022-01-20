import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Programa que pega dos números para formar uno.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio14AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE PEGA DOS NÚMEROS PARA FORMAR UNO");
    System.out.println("----------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero1 = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca otro número entero, por favor: ");
    System.out.print("> ");
    long numero2 = Integer.parseInt(s.nextLine());
    System.out.println(" ");
  
    System.out.print("El nuevo número es " + funciones.funcionesTema801.pegaPorDelante(numero2, (int)numero1));
  }
}