import funciones.funcionesTema803; //importamos la biblioteca de funciones funcionesTema803
import java.util.Scanner; //importamos la clase Scanner

/**
 * Programa que devuelve la columna j-ésima del array que se
 * pasa como parámetro.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio31AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DEVUELVE LA COLUMNA J-ÉSIMA DEL ARRAY QUE SE PASA COMO PARÁMETRO");
    System.out.println("------------------------------------------------------------------------------");
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

    //se pide la columna que se desea ver
    System.out.println("Introduzca el número de la columna que quiere mostrar: ");
    System.out.print("> ");
    int numFila = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    //se muestra la columna
    funciones.funcionesTema803.columnaDeArrayBiInt(array, numFila);
  }
}