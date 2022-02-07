
import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801 para usar una de sus funciones
import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones

/**
 * Realiza un programa que rellene un array con 10 números aleatorios 
 * comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
 * continuación, el programa indicará para cada uno de ellos si es un número
 * primo y/o un capicúa de la forma que muestra el ejemplo.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio51AlbertoM { 
  public static void main(String[] args) {System.out.println("PROGRAMA QUE INDICA SI LOS DIEZ NÚEROS DE UN ARRAY GENERADO SON PRIMOS O CAPICÚAS");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Array:\n");

    int[] array = funciones.funcionesTema802.generaArrayInt(10, 101, 2);

    funciones.funcionesTema802.muestraArrayEnTabla(array, array.length);

    System.out.println(" \n");

    for (int i = 0; i < 10; i++) {
      System.out.print("El " + array[i]);

      if (!funciones.funcionesTema801.esPrimo(array[i])) {
        System.out.print(" no");
      }

      System.out.print(" es primo y");

      if (!funciones.funcionesTema801.esCapicua(array[i])) {
        System.out.print(" no");
      }

      System.out.println(" es capicúa.");
    }
  }
}