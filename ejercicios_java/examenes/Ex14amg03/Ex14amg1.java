import java.util.Scanner;

/**
 * Realiza un programa que genere un array cuadrado con números aleatorios entre el 1 y el 99, ambos
 * incluidos. La longitud del lado del array (un entero mayor o igual a 1) se debe pedir al usuario. A
 * continuación, el usuario podrá extraer un trozo de ese array indicando la fila y la columna donde se
 * empieza a extraer y la longitud del lado del trozo.
 * Tanto el array original como el trozo se deben mostrar con los números perfectamente alineados,
 * como se muestra en los ejemplos.
 * Las filas y las columnas se numeran empezando a contar en la 0.
 *
 * @author Alberto Moreno Gonzalez
 * 
 * Fecha: 15 - 2 - 2022
 */
public class Ex14amg1 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE PUEDE EXTRAER UN TROZO DE UN ARRAY CUADRADO");
    System.out.println("---------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la longitud del lado del array, por favor: ");
    System.out.print("> ");
    int lado = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    int[][] array = generaArrayBiInt(lado, lado, 100, 1);

    System.out.println("Array:\n");

    muestraArrayBiEnTabla(array, lado, lado);

    System.out.println("\n\nVamos a extraer un trozo de ese array. ");
    System.out.println("Introduzca la fila para empezar a extraer: ");
    System.out.print("> ");
    int fila = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca la columna para empezar a extraer: ");
    System.out.print("> ");
    int columna = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Introduzca la longitud del lado que se va a extraer:");
    System.out.print("> ");
    int ladoTrozo = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println("Trozo del Array:\n");

    int[][] trozo = new int[ladoTrozo][ladoTrozo];
    int filaTrozo = fila;
    int columnaTrozo;

    for (int i = 0; i < ladoTrozo; i++) {
      columnaTrozo = columna;

      for (int j = 0; j < ladoTrozo; j++) {
        trozo[i][j] = array[filaTrozo][columnaTrozo];
        columnaTrozo++;
      }

      filaTrozo++;
    }

    muestraArrayBiEnTabla(trozo, ladoTrozo, ladoTrozo);
  }


  /*** FUNCIONES ***/


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
}