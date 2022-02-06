import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones
import java.util.Scanner; //importamos la clase Scanner

/**
 * Define la función concatena con la siguiente cabecera:
 * public static int[] concatena(int[] a, int[] b)
 * Esta función toma dos arrays como parámetros y devuelve un array que es el
 * resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
 * concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio48AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE CONCATENA DOS ARRAYS");
    System.out.println("----------------------------------");
    System.out.println(" ");

    System.out.println("Array 1:\n");

    int[] array1 = funciones.funcionesTema802.generaArrayInt(10, 10, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array1, array1.length);

    System.out.println("\nArray 2:\n");

    int[] array2 = funciones.funcionesTema802.generaArrayInt(10, 10, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array2, array2.length);

    System.out.print("\n\nConcatenación de los dos arrays: \n");

    funciones.funcionesTema802.muestraArrayEnTabla(concatena(array1, array2), concatena(array1, array2).length);
  }


  /**
   * La función toma dos arrays como parámetros y devuelve un array que es el
   * resultado de concatenar ambos.
   *
   * @param a primer array concatenado
   * @param b segundo array concatenado
   * @return a y b concatenados, en ese orden
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[] concatena(int[] a, int[] b) {
    int[] arrayConc = new int [a.length + b.length]; //se declara el array donde se van a juntar ambos arrays parámetro

    //se añade a arrayConc el array a 
    for (int i = 0; i < a.length; i++) {
      arrayConc[i] = a[i];
    }

    //se añade a arrayConc el array b (empezando desde el valor siguiente al último añadido anteriormente)
    for (int j = a.length; j < a.length + b.length; j++) {
      arrayConc[j] = b[j - b.length];
    }

    return arrayConc;
  } //public static int[] concatena(int[] a, int[] b)
}