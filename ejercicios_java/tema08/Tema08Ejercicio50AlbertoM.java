import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones
import java.util.Scanner; //importamos la clase Scanner

/**
 * Define la función mezcla con la siguiente cabecera:
 * public static int[] mezcla(int[] a, int[] b)
 * Esta función toma dos arrays como parámetros y devuelve un array que es
 * el resultado de mezclar los números de ambos de forma alterna, se coge un
 * número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
 * longitudes diferentes; por tanto, si se terminan los números de un array se
 * terminan de coger todos los que quedan del otro.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio50AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE MEZCLA DOS ARRYAS DE FORMA ALTERNA");
    System.out.println("------------------------------------------------");
    System.out.println(" ");

    System.out.println("Array 1:\n");

    int[] array1 = funciones.funcionesTema802.generaArrayInt(((int)(Math.random() * 9) + 1), 10, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array1, array1.length);

    System.out.println("\n\nArray 2:\n");

    int[] array2 = funciones.funcionesTema802.generaArrayInt(((int)(Math.random() * 9) + 1), 10, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array2, array2.length);

    System.out.print("\n\nConcatenación de los dos arrays: \n");

    funciones.funcionesTema802.muestraArrayEnTabla(mezcla(array1, array2), mezcla(array1, array2).length);
  }


  /**
   * La función toma dos arrays como parámetros y devuelve un array que es
   * el resultado de mezclar los números de ambos de forma alterna, se coge un
   * número de a, luego de b, luego de a, etc.
   *
   * @param a primer array que se va a mezclar
   * @param b segundo array que se va a mezclar
   * @return a y b mezclados de forma alterna
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[] mezcla(int[] a, int[] b) {
    int[] arrayMez = new int [a.length + b.length]; //se declara el array donde se va a guardar la mezcla de ambos arrays parámetro
    int j = 0;
    int k = 0;

    for (int i = 0; i < arrayMez.length; i++) {
      if (((i % 2 == 0) && (i < a.length * 2)) || (i > b.length * 2)) {
        arrayMez[i] = a[j];
        j++;
      } else if ((i % 2 != 0) || (i >= a.length * 2)) {
        arrayMez[i] = b[k];
        k++;
      }
    } //for (int i = 0; i < arrayMez.length; i++)

    return arrayMez;
  } //public static int[] mezcla(int[] a, int[] b)
}