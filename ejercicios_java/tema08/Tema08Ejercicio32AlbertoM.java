import funciones.funcionesTema803; //importamos la biblioteca de funciones funcionesTema803
import java.util.Scanner; //importamos la clase Scanner

/**
 * Programa que devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio32AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DEVUELVE LA FILA Y LA COLUMA DE LA PRIMERA OCURRENCIA DE UN NÚMERO QUE SE PIDE POR PANTALLA EN UN ARRAY BIDIMENSIONAL");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
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

    //se pide el número del que se quieren ver las coordenadas
    System.out.println("Introduzca el número del que quiere ver las coordenadas: ");
    System.out.print("> ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.print("Las coordenadas del número " + numero + " son ");

    //se muestra la coordenada
    funciones.funcionesTema803.coordenadasEnArrayBiInt(array, numero);
  }
}