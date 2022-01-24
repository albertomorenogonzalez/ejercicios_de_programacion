import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema801
import java.util.Scanner; //importamos la clase Scanner

/**
 * Programa que genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio20AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE GENERA UN ARRAY DE TAMAÑO N CON NÚMEROS ALEATORIOS CUYO INTERVALO SE PIDE POR PANTALLA");
    System.out.println("----------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca el tamaño del array: ");
    System.out.print("> ");
    int tamañoArray = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el menor número del intervalo de números que quiere: ");
    System.out.print("> ");
    int minimo = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca el mayor número del intervalo de números que quiere: ");
    System.out.print("> ");
    int maximo = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    int[] array = funciones.funcionesTema802.generaArrayInt(tamañoArray, maximo, minimo);

    funciones.funcionesTema802.muestraArray(array, tamañoArray);
  }
}