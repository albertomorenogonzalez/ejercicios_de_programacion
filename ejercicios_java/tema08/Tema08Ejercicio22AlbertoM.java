import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema801
import java.util.Scanner; //importamos la clase Scanner

/**
 * Programa que devuelve el máximo del array que se pasa como parámetro.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio22AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DEVUELVE EL MÁXIMO DEL ARRAY QUE SE PASA CÓMO PARÁMETRO");
    System.out.println("----------------------------------------------------------------------");
    System.out.println(" ");

    //se piden el tamaño del array, el valor máximo y el valor mínimo del intervalo
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

    //se define el array
    int[] array = funciones.funcionesTema802.generaArrayInt(tamañoArray, maximo, minimo); 

    //se muestra el array
    System.out.println("Array generado - Array de " + tamañoArray + " números cuyo menor número posible puede ser el " + minimo + " y el máximo el " + maximo + ":\n");

    funciones.funcionesTema802.muestraArray(array, tamañoArray); 

    System.out.println("\n ");

    //se calcula y se muestra el valor máximo del array
    System.out.println("El número menor es " + funciones.funcionesTema802.maximoArrayInt(array));
  }
}