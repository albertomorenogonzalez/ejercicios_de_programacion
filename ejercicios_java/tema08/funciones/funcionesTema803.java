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
   * @param filas filas del array
   * @param columnas columnas del array
   * @return los valores de un array bidimensional en una tabla
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static void muestraArrayBiEnTabla(int[][] array, int filas, int columnas) {
    int i; //declaramos la variable que utilizaremos como índice principal

    //se muestra el número de columna
    for (i = 0; i < columnas; i++) {
      System.out.print("     " + i);
    }

    System.out.println(" "); //salto de línea

    //se muestra el borde superior de la tabla
    for (i = 0; i < columnas; i++) {
      if (i == 0) {
        System.out.print("  ┌─────┬");
      } else if (i == columnas - 1) {
        System.out.print("─────┐");
      } else {
        System.out.print("─────┬");
      } //if (i == 0)
    } //for (int i = 0; i < tamaño; i++)

    System.out.println(" ");

    //se muestra el resto de la tabla
    for (i = 0; i < filas; i++) {
      System.out.print(i + " "); //se muestra el número de fila

      //se muestra el borde izquierdo y el valor de cada celda
      for (int j = 0; j < columnas; j++) {
        System.out.printf("%-1s %3d " ,"|" ,array[i][j]);
      }

      System.out.print("|"); //se meustra el borde derecho de cada celda

      System.out.println(" ");

      int k; //declaramos la variable k para usarla de índice al mostrar cada borde inferior

      //si i es igual filas - 1 se mostrará el borde inferior de la tabla
      //en el resto de caso se mostrará el borde inferior de la fila y un salto de línea
      if (i == filas- 1) {
        for (k = 0; k < columnas; k++) {
          if (k == 0) {
            System.out.print("  └─────┴");
          } else if (k == columnas - 1) {
            System.out.print("─────┘");
          } else {
            System.out.print("─────┴");
          } //if (k == 0)
        } //for (k = 0; k < columnas; k++)
      } else {
        for (k = 0; k < columnas; k++) {
          if (k == 0) {
            System.out.print("  ├─────┼");
          } else if (k == columnas - 1) {
            System.out.print("─────┤");
          } else {
            System.out.print("─────┼");
          } //if (k == 0)
        } //for (k = 0; k < columnas; k++)

        System.out.println(" ");
      } //if (filas == columnas - 1)
    } //for (i = 0; i < filas; i++)
  } //public static void muestraArrayEnTabla(int[][] array, int filas, int columnas)


  /**
   * La función genera un array de tamaño n x m con números
   * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
   *
   * @param array array que se quiere mostrar
   * @param maximo límite mayor del intervalo
   * @param minimo límite menor del intervalo
   * @return array de tamaño n x m de números aleatorios entre minimo y maximo
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[][] generaArrayBiInt(int filas, int columnas, int maximo, int minimo) {
    //se define el array que se va a generar
    int[][] array = new int[filas][columnas];

    //con el bucle se asigna un valor en cada posción del array bidimensional.
    //Se van asignando por filas gracias a la variable i y dentro de cada fila se asiga por columna
    //gracias a la variable j. El intervalo de los valores aleatorios se definirá
    //multiplicando la función Math.random() por el mayor número del intervalo menos el mínimo,
    //para que al sumarle el mínimo el valor máximo no cambie.
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        array[i][j] = ((int)(Math.random() * (maximo - minimo)) + minimo);
      }

    } //for (int i = 0; i < filas; i++)

    return array;
  } //public static void generaArrayBiInt(int[][] array, int filas, int columnas)


  /**
   * La función devuelve la fila i-ésima del array que se pasa como
   * parámetro.
   *
   * @param array array del que se a sacar la fila
   * @param numFila número de la fila que se quiere ver
   * @return fila que se quiere ver
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static void filaDeArrayBiInt(int[][] array, int numFila) {
    //se define el array donde se va a guardar la fila
    int[] fila = new int [array[0].length];

    //se asigna cada valor de la fila al array y se muestra seguidamente
    for (int i = 0; i < array[0].length; i++) {
      fila[i] = array[numFila][i];
      System.out.print(fila[i] + " ");
    }
  } //public static void filaDeArrayBiInt(int[][] array, int numFila)


  /**
   * La función devuelve la columna j-ésima del array que se pasa como
   * parámetro.
   *
   * @param array array del que se a sacar la fila
   * @param numFila número de la columna que se quiere ver
   * @return columna que se quiere ver
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static void columnaDeArrayBiInt(int[][] array, int numColumna) {
    //se define el array donde se va a guardar la columna
    int[] columna = new int [array.length];

    //se asigna cada valor de la columna al array y se muestra seguidamente
    for (int i = 0; i < array.length; i++) {
      columna[i] = array[i][numColumna];
      System.out.print(columna[i] + " ");
    }
  } //public static void columnaDeArrayBiInt(int[][] array, int numFila)
}