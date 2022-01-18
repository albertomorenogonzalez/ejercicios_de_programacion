import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Programa que le quita a un número n dígitos por delante (por la
 * izquierda)
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio10AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE LE QUITA A UN NÚMERO INTRODUCIDO POR PANTALLA UN NÚMERO INTRODUCIDO DE DÍGITOS POR LA IZQUIERDA");
    System.out.println("-------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el número de dígitos que quiere quitar por la izquierda: ");
    System.out.print("> ");
    int numDigitos = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.print("El nuevo número es " + funciones.funcionesTema801.quitaPorDelante(numero, numDigitos));
  }
}