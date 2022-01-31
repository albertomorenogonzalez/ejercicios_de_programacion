import funciones.funcionesTema803; //importamos la biblioteca de funciones funcionesTema803
import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802
import java.util.Scanner; //importamos la clase Scanner

/**
 * Programa que devuelve un array que contiene una de las diagonales del array
 * bidimensional que se pasa como parámetro. Se pasan como parámetros
 * fila, columna y dirección. La fila y la columna determinan el número que
 * marcará las dos posibles diagonales dentro del array. La dirección es
 * una cadena de caracteres que puede ser “nose” o “neso”. La cadena
 * “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
 * mientras que la cadena “neso” indica que se elige la diagonal que va del
 * noreste hacia el suroeste.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio34AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DEVUELVE UNA DIAGONAL DE UN ARRAY BIDIMENSIONAL");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" ");

    //se piden las filas y las columnas del array, el valor máximo y el valor mínimo del intervalo
    System.out.println("Introduzca las filas del array: ");
    System.out.print("> ");
    int filasArray = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca las columnas del array: ");
    System.out.print("> ");
    int columnasArray = Integer.parseInt(s.nextLine());
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
    int[][] array = funciones.funcionesTema803.generaArrayBiInt(filasArray, columnasArray, maximo, minimo);

    //se muestra el array
    System.out.println("Array generado - Array de " + filasArray + " filas  y " + columnasArray + " columnas cuyo menor número posible puede ser el " + minimo + " y el máximo el " + maximo + ":\n");

    funciones.funcionesTema803.muestraArrayBiEnTabla(array, filasArray, columnasArray);
    
    System.out.println("\n ");

    System.out.println("Mostrar una diagonal:\n");

    //se pide el número de la fila de un número del array dentro de la diagonal que queremos mostrar
    System.out.println("Introduzca el número de fila de un número dentro de la diagonal que quiere mostrar: ");
    System.out.print("> ");
    int fila = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    //se pide el número de la columna de un número del array dentro de la diagonal que queremos mostrar
    System.out.println("Introduzca el número de columna de un número dentro de la diagonal que quiere mostrar: ");
    System.out.print("> ");
    int columna = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    //se pide la dirección de la diagonal
    System.out.println("Cuál es la dirección de la diagonal que quiere mostrar:");
    System.out.println("nose - noroeste -> sureste - de arriba izquierda a abajo derecha");
    System.out.println("neso - noreste -> suroeste - de arriba derecha a abajo izquierda");
    System.out.print("> ");
    String direccion = s.nextLine().toLowerCase();
    System.out.println(" ");

    //se muestra la diagonal
    funciones.funcionesTema802.muestraArray(funciones.funcionesTema803.diagonal(array, fila, columna, direccion), funciones.funcionesTema803.diagonal(array, fila, columna, direccion).length);
  }
}