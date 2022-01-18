import funciones.funcionesTema801;
import java.util.Scanner;

/**
 * Programa que da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio08AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE TE DICE LA POSICIÓN QUE OCUPA UN DÍGITO DENTRO DE UN NÚMERO");
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Nota: Si no lo encuentra devuelve un -1.\n");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el dígito del que quiere ver la primera posición (la primera posición es la número 0 y va de izquierda a derecha): ");
    System.out.print("> ");
    int digito = Integer.parseInt(s.nextLine());
    System.out.println(" ");
    
    System.out.print("La primera posición en el número que ocupa el dígito " + digito + " es la " + funciones.funcionesTema801.posicionDeDigito(numero, digito));
  }
}