package funciones; //se define el paquete de funciones

/**
 * Funciones de los ejercicios del tema 8 (29-34)
 *
 * eca de funciones para arrays bidimensionales (de dos dimensiones) 
 * de números enteros que contenga las siguientes funciones:
 * 
 * @author Alberto Moreno Gonzalez
 */
public class funcionesTema803 { 

  /**
   * La función muestra un array bidimensional
   *
   * @param array array que se quiere mostrar
   * @param filas números de filas del array
   * @param columnas número de columnas del array
   * @return los valores de un array
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static void muestraArrayBi(int[][] array, int filas, int columnas) {
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print(array[i][j] + " ");
      }

      System.out.println(" ");
    } //for (int i = 0; i < filas; i++)
  } //public static void muestraArrayBi(int[][] array, int filas, int columnas)


  /**
   * La función muestra un array bidimensional dentro de una tabla
   * (Los números tendrán que ser como máximo de tres cifras)
   *
   * @param array array que se quiere mostrar
   * @param filas números de filas del array
   * @param columnas número de columnas del array
   * @return los valores de un array
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static void muestraArrayBiEnTabla(int[][] array, int filas, int columnas) {
    
    
  } //public static void muestraArrayBiEnTabla(int[] array, int tamaño)
}