import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Programa que toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio13AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE DADAS UNAS POSICIÓN INICIAL Y UNA POSICIÓN FINAL DENTRO DE UN NÚMERO TE DA EL CORRESPONDIENTE TROZO");
    System.out.println("-----------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca la posición inicial del trozo (la primera posición del número entero anterior es la número 0 y va de izquierda a derecha): ");
    System.out.print("> ");
    int posicionInicial = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca la posición final del trozo: ");
    System.out.print("> ");
    int posicionFinal = Integer.parseInt(s.nextLine());
    System.out.println(" ");
  
    System.out.print("El trozo del número introducido que va desde la posición " + posicionInicial + " a la posición " + posicionFinal + " es " + funciones.funcionesTema801.trozoDeNumero(numero, posicionInicial, posicionFinal));
  }
}