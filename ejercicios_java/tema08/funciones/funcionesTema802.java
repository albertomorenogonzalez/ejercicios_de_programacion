package funciones; //se define el paquete de funciones

/**
 * Funciones de los ejercicios del tema 8 (20-28)
 *
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 
 * @author Alberto Moreno Gonzalez
 */
public class funcionesTema802 { 

  /**
   * La función muestra un array
   *
   * @param array array que se quiere mostrar
   * @param tamaño tamaño del array
   * @return los valores de un array
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static void muestraArray(int[] array, int tamaño) {
    //la función mostrará en cada iteración la posición correspondiente a i (índice)
    for (int i = 0; i < tamaño; i++) {
      System.out.print(array[i] + " ");
    }
  } 


    /**
   * La función muestra un array dentro de una tabla
   * (Los números tendrán que ser como máximo de tres cifras)
   *
   * @param array array que se quiere mostrar
   * @param tamaño tamaño del array
   * @return los valores de un array
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static void muestraArrayEnTabla(int[] array, int tamaño) {
    //la función pinta el borde superior de la tabla
    for (int i = 0; i < tamaño; i++) {
      if (i == 0) {
        System.out.print("┌─────┬");
      } else if (i == tamaño - 1) {
        System.out.print("─────┐");
      } else {
        System.out.print("─────┬");
      } //if (i == 0)
    } //for (int i = 0; i < tamaño; i++)

    System.out.println(" ");

    //se muestra el índice que estará sobre el número de la posición del array correspondiente
    for (int j = 0; j < tamaño; j++) {
      System.out.printf("%-1s %2d  " ,"|" ,j);
    }

    System.out.print("|");

    System.out.println(" ");

    //se pinta el borde medio de la tabla
    for (int k = 0; k < tamaño; k++) {
      if (k == 0) {
        System.out.print("├─────┼");
      } else if (k == tamaño - 1) {
        System.out.print("─────┤");
      } else {
        System.out.print("─────┼");
      } //if (k == 0)
    } //for (int i = 0; i < tamaño; i++)

    System.out.println(" ");

    //s muestran los valores del array en cada posición
    for (int l = 0; l < tamaño; l++) {
      System.out.printf("%-1s %3d " ,"|" ,array[l]);
    }

    System.out.print("|");

    System.out.println(" ");

    //se pinta el borde inferior de la tabla
    for (int m = 0; m < tamaño; m++) {
      if (m == 0) {
        System.out.print("└─────┴");
      } else if (m == tamaño - 1) {
        System.out.print("─────┘");
      } else {
        System.out.print("─────┴");
      } //if (k == 0)
    } //for (int i = 0; i < tamaño; i++)
  } //public static void muestraArrayEnTabla(int[] array, int tamaño)


  /**
   * La función genera un array de tamaño n con números aleatorios
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   *
   * @param tamaño tamaño del array
   * @param maximo límite mayor del intervalo
   * @param minimo límite menor del intervalo
   * @return array de tamaño n de números aleatorios entre minimo y maximo
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[] generaArrayInt(int tamaño, int maximo, int minimo) {
    //se define el array que se va a generar
    int[] array = new int[tamaño];

    //en cada posición se asiga un valor aleatorio gracias al aumento en cada iteración de la variable i.
    //el intervalo de los valores aleatorios se definirá multiplicando la función Math.random() por
    //el mayor número del intervalo menos el mínimo, para que al sumarle el mínimo el valor máximo no cambie
    for (int i = 0; i < tamaño; i++) {
      array[i] = ((int)(Math.random() * (maximo - minimo)) + minimo);
    }

    return array;
  } //public static int[] generaArrayInt(int tamaño, int maximo, int minimo)
}