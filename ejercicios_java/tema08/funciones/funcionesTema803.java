package funciones; //se define el paquete de funciones
import funciones.funcionesTema802; //importamos el paquete de funciones de arrays funcionesTema802

/**
 * Funciones de los ejercicios del tema 8 (29-34)
 *
 * Crea un biblioteca de funciones para arrays bidimensionales (de dos dimensiones) 
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

      System.out.print("|"); //se muestra el borde derecho de cada celda

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
  public static int[] filaDeArrayBiInt(int[][] array, int numFila) {
    //se define el array donde se va a guardar la fila
    int[] fila = new int [array[0].length];

    //se asigna cada valor de la fila al array
    //con array[0].length calculamos el número de filas del array
    for (int i = 0; i < array[0].length; i++) {
      fila[i] = array[numFila][i];
    }

    return fila;
  } //public static int[] filaDeArrayBiInt(int[][] array, int numFila)


  /**
   * La función devuelve la columna j-ésima del array que se pasa como
   * parámetro.
   *
   * @param array array del que se a sacar la columna
   * @param numFila número de la columna que se quiere ver
   * @return columna que se quiere ver
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[] columnaDeArrayBiInt(int[][] array, int numColumna) {
    //se define el array donde se va a guardar la columna
    int[] columna = new int [array.length];

    //se asigna cada valor de la columna al array
    //con array.length calculamos el número de columnas del array
    for (int i = 0; i < array.length; i++) {
      columna[i] = array[i][numColumna];
    }

    return columna;
  } //public static int[] columnaDeArrayBiInt(int[][] array, int numFila)


  /**
   * La función devuelve la fila y la columna (en un array
   * con dos elementos) de la primera ocurrencia de un número dentro de un
   * array bidimensional. Si el número no se encuentra en el array, la función
   * devuelve el array {-1, -1}.
   *
   * @param array array donde se va a comprobar el número
   * @param numero número que se quiere comprobar si está en el array
   * @return fila y columna del número consultado
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String coordenadasEnArrayBiInt(int[][] array, int numero) {
    int i = 0; //se define e inicializa la variable i usada como indice para las filas
    int j = 0; //se define e inicializa la variable i usada como indice para las filas
    int fila = -1; //se define la variable fila para guardar ahí la coordenada de la fila. La inicialiamos en -1 ya que ese es la coordenada que tiene que mostrar si no se ha encontrado el número 
    int columna = -1; //se define la variable columna para guardar ahí la coordenada de la columna. La inicialiamos en -1 ya que ese es la coordenada que tiene que mostrar si no se ha encontrado el número
    boolean encontrado = false; //variable booleana que utilizaremos para romper el bucle de la fila

    //con el bucle de índice i vamos cambiando de fila comprobando si el número introducido se encuentra en cada fila
    for (i = 0; (i < array.length) && (!encontrado); i++) {
      //dentro de cada fila comprobaremos por columna (variable índice j) cada número
      for (j = 0; ((j < array[0].length) && (numero != array[i][j])); j++) { }

      //si el número se ha encontrado significa que j es menor que el número de columnas del array (array[0].length)
      //si es asi la variable encontrado será verdadera, por lo que finalizaremos con el bucle de las filas
      //en tal caso la variable fila cogerá el valor de i e columna el de j
      if (j < array[0].length) {
        encontrado = true;

        fila = i;
        columna = j;
      } //if (j < array[0].length)
    } //for (i = 0; (i < array.length) && (!encontrado); i++)

    //se guardarán las coordenadas del número en un String. Si no sea ha encontrado el número las coordenadas serán [-1,-1]
    String coordenadas = ("[" + fila + "," + columna + "]");

    return coordenadas;
  } //public static String coordenadasEnArrayBiInt(int[][] array, int numero)


  /**
   * La función dice si un número es o no punto de silla, es decir,
   * mínimo en su fila y máximo en su columna.
   *
   * @param array array donde se va a comprobar el número
   * @param numero número que se quiere comprobar si es punto de silla
   * @return texto diciendo si el número es o no punto de silla
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String esPuntoDeSilla(int[][] array, int numero) {
    String coordenadasNumero = funciones.funcionesTema803.coordenadasEnArrayBiInt(array, numero); //en este String guardaremos las coordenadas del número
    int numFila = 0; //inicializamos la variable donde guardaremos el número de la fila del número introducido
    int numColumna = 0; //inicializamos la variable donde guardaremos el número de la columna del número introducido

    //si las coordenadas del número son las [-1,-1] significa que el número no se encuentra en el array, por lo que la función lo dirá
    switch (coordenadasNumero) {
      case "[-1,-1]":
        System.out.println("El número no se encuentra en el array");
        break;
      //si el número se encuentra en el array, el valor de la fila se guardará en numFila y el de la columna en numColumna. El valor de la fila es el segundo 
      //caracter del coordenadas número (.charAt(1)) y el cuarto caracter es el valor de la columna (.charAt(3)) primero se asa a String para que la función
      //no coja el valor en ASCII y luego se pasa a int para guardarlo correctamente en numFila y numColumna. La fila y la columna se guardan cada una 
      //en un array unidimensional gracias a fila/columnaDeArrayBiInt. Gracias a las funciones de funcionesTema802 minimoArayInt y maximoArrayInt comporbaremos
      //si el número consultado es el mínimo de su fila y el máximo de su columna. Seguidamente la función mostrará el texto correspondiente. 
      default: 
        for (int i = 0; i < coordenadasNumero.length(); i++) {
          numFila = Integer.valueOf(String.valueOf(coordenadasNumero.charAt(1)));
          numColumna = Integer.valueOf(String.valueOf(coordenadasNumero.charAt(3)));
        }
  
        int[] fila = funciones.funcionesTema803.filaDeArrayBiInt(array, numFila);
        int[] columna = funciones.funcionesTema803.columnaDeArrayBiInt(array, numColumna);
    
        if ((numero == funciones.funcionesTema802.minimoArrayInt(fila)) && (numero == funciones.funcionesTema802.maximoArrayInt(columna))) {
          System.out.println("El número es punto de silla");
        } else {
          System.out.println("El número no es punto de silla");
        } //if ((numero == funciones.funcionesTema802.minimoArrayInt(fila)) && (numero == funciones.funcionesTema802.maximoArrayInt(columna)))
    } //switch (coordenadasNumero)

    return "";
  } //public static String coordenadasEnArrayBiInt(int[][] array, int numero)


  /**
   * La función devuelve un array que contiene una de las diagonales del array
   * bidimensional que se pasa como parámetro. Se pasan como parámetros
   * fila, columna y dirección. La fila y la columna determinan el número que
   * marcará las dos posibles diagonales dentro del array. La dirección es
   * una cadena de caracteres que puede ser “nose” o “neso”. La cadena
   * “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
   * mientras que la cadena “neso” indica que se elige la diagonal que va del
   * noreste hacia el suroeste.
   *
   * @param array array bidimensional de donde se va a sacar la diagonal
   * @param fila fila de un número presente en alguna de las diagonales
   * @param columna columna del mismo número presente en alguna de la diagonales
   * @param direccion "nose" o "neso", nombra las dos diagonales para mostrarla 
   * @return una diagonal del array
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[] diagonal(int[][] array, int fila, int columna, String direccion) {
    //declaramos un array auxiliar de tamaño número de columnas del array para guardar ahí los números de la diagonal mientras no sepamos su longitud
    int[] diagonalAux = new int [array.length]; 
    int i; //definimos el índice i para usarlo en los bucles de la función que recorren filas
    int j; //definimos el índice j para usarlo en los bucles de la función que recorren columnas
    int k = 0; //declaramos e inicializamos un índice k que va ir aumentando cada vez que un número sea guardado en el array

    //según la dirección indicada, la fórmula para encontrar los números de la diagonal con el número de fila y columna indicados
    //cambia. En el caso de "nose", se guardarán en diagonalAux los números en los que el índice i menos la fila indicada sea igual al 
    //índice j menos la columna indicada. En el caso de "neso", se guardarán en el array los números en los que el índice i más el 
    //índice j sea igual a la suma de la fila y la columna indicadas. El bucle con el índice i se encarga de ir comprobando las filas y dentro de
    //ese bucle otro que usa el índice j para comprobar las columnas.
    switch (direccion) {
      case "nose":
        for (i = 0; i < array[0].length; i++) {
          for (j = 0; j < array.length; j++) {
            if (i - fila == j - columna) {
              diagonalAux[k] = array[i][j];
              k++;
            }
          } //for (int j = 0; j < array.length; j++)
        } //for (int i = 0; i < array[0].length; i++)
        break;
      case "neso":
        for (i = 0; i < array[0].length; i++) {
          for (j = 0; j < array.length ; j++) {
            if (i + j == fila + columna) {
              diagonalAux[k] = array[i][j];
              k++;
            }
          } //for (int j = 0; j < array.length; j++)
        } //for (int i = 0; i < array[0].length; i++)
        break;
      default:

    } //switch (direccion)

    int[] diagonal = new int [k]; //se declara el array unidimensional para guadar la diagonal completa con su tamaño real (k)

    //hasta llegar a k, se guardará en el array cada posición de diagonalAux correspondiente
    for (i = 0; i < k; i++) {
      diagonal[i] = diagonalAux[i];
    }

    return diagonal;
  } //public static int[] diagonal(int[][] array, int fila, int columna, String direccion)
}