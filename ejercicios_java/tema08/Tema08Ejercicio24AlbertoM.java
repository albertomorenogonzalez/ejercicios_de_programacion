import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802
import java.util.Scanner; //importamos la clase Scanner

/**
 * Programa que dice si un número está o no dentro de un array.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio24AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO ESTÁ O NO DENTRO DE UN ARRAY");
    System.out.println("------------------------------------------------------------");
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

    //se pide un número para buscarlo en el array
    System.out.println("Introduzca un número para buscarlo en el array: ");
    System.out.print("> ");
    long numeroAEncontrar = Long.parseLong(s.nextLine());
    System.out.println(" ");

    funciones.funcionesTema802.estaEnArrayInt(array, numeroAEncontrar);
  }
}