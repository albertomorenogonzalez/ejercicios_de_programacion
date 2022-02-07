import funciones.funcionesTema803; //importamos la biblioteca de funciones funcionesTema803 para usar una de sus funciones
import java.util.Scanner; //importamos la clase Scanner

/**
 * Implementa una función con nombre nEsimo que busque el número que hay
 * dentro de un array bidimensional en la posición n-ésima contando de izquierda
 * a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
 * es el 0. Si la posición donde se busca no existe en el array, la función debe
 * devolver -1. Se debe entregar tanto el código de la función como el código de
 * prueba que la usa. La cabecera de la función es la siguiente:
 * public static int nEsimo(int[][] n, int posicion)
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio53AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DEVUELVE UN NÚMERO DE UNA POSICIÓN PEDIDA POR PANTALLA EN UN ARRAY BIDIMENSIONAL");
    System.out.println("----------------------------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Array:\n");

    int[][] array = funciones.funcionesTema803.generaArrayBiInt(((int)(Math.random() * 9) + 1), ((int)(Math.random() * 9) + 1), 999, 0);

    funciones.funcionesTema803.muestraArrayBiEnTabla(array, array.length, array[0].length);

    System.out.println(" \n");

    System.out.println("Introduzca la posición de la que quiere ver el número (de la 0 a la " + (array.length * array[0].length - 1) +"): ");
    System.out.print("> ");
    int posicion = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("El número de la posición " + posicion + " es el " + nEsimo(array, posicion));
  }


  /**
   * La función busca el número que hay dentro de un array bidimensional
   * en la posición n-ésima contando de izquierda a derecha
   * y de arriba abajo, como si se estuviera leyendo.
   *
   * @param a array bidimensional donde se va a buscar el número de la posición introducida
   * @param posicion posición del número que se quiere ver
   * @return número de la posición introducida por pantalla
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int nEsimo(int[][] a, int posicion) {
    //se declara el array unidimensional donde se va a guardar todo el array bidimensional
    //ese array es de longitud columnas x filas del array bidimensional
    int[] posiciones = new int [a[0].length * a.length]; 
    int k = 0; //usaremos este índice k para guardar los valores del bidimensional en el unidimensional

    //en cada iteración del bucle anidadao se irá guardando cada posición primero por fila y luego dentro de la fila por columnas
    //cuando se guarden todos los valores de una fila se pasará a la siguiente
    //cada vez que se guarde un valor en posiciones k aumentará en uno
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        posiciones[k] = a[i][j];
        k++;
      }
    } //for (int i = 0; i < a.length; i++)

    //si la posición introducida no existe en el array posiciones la función devolverá -1
    //en cualquier otro caso el array devolverá la posición del array que se pidió por pantalla
    if (posicion > (a[0].length * a.length - 1)) {
      return -1;
    } else {
      return posiciones[posicion];
    } //if (posicion > (a[0].length * a.length - 1))
  } //public static int nEsimo(int[][] a, int posicion)
}