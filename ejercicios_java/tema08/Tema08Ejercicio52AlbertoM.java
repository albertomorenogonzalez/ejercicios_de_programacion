
import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones

/**
 * Implementa la función aleatorioDeArray con la cabecera que se muestra a
 * continuación:
 * public static int aleatorioDeArray(int[] a)
 * Esta función debe devolver un número del array escogido al azar entre todos
 * los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
 * podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) 
 * podría devolver el 52 o el 37. Utiliza la función en un programa de
 * prueba.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio52AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DEVUELVE UN NÚMERO AL AZAR DE UN ARRAY");
    System.out.println("----------------------------------------------------");
    System.out.println(" ");

    System.out.println("Array:\n");

    int[] array = funciones.funcionesTema802.generaArrayInt(((int)(Math.random() * 9) + 1), 999, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array, array.length);

    System.out.println(" \n");

    System.out.println("El número aleatorio que ha salido es el " + aleatorioDeArray(array));
  }


  /**
   * La función debe devolver un número del array escogido al azar entre todos
   * los disponibles dentro del array.
   *
   * @param a array donde se va a buscar un número aleatorio
   * @return númeo aleatorio de dentro del array
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int aleatorioDeArray(int[] a) {
    //se generará un número aleatorio correspondiente a una posición del array
    //la función devolverá el valor correspondiente a ese número generado
    int i = (int)(Math.random() * a.length); 

    return a[i];
  } //public static int aleatorioDeArray(int[] a)
}