import java.util.Scanner; //importamos la clase scanner

/**
 * Realiza un programa que rellene un array cuadrado con números consecutivos empezando
 * por el 1 siguiendo un camino en forma de espiral en el sentido de las agujas del reloj y
 * empezando en la esquina superior izquierda. La longitud del lado del array (un entero mayor o
 * igual a 1) se debe pedir al usuario. Los números se deben mostrar perfectamente alineados
 * en columnas teniendo en cuenta el tamaño del número más grande.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicioAmpliacion1AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la clase Scanner

    System.out.println("PROGRAMA QUE QUE RELLENA UN ARRAY CUADRADO DE NÚMEROS CONSECUTIVOS EN ESPIRAL EN EL SENTIDO DE LAS AGUJAS DEL RELOJ");
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    //pedimos la longitud del lado del array 
    System.out.println("Introduzca la longitud del lado del array: ");
    System.out.print("> ");
    int longitud = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    int [][] matriz = new int[longitud] [longitud]; //array bidimensional donde se guarda el resultado

    int i; //variable índice que usaremos en los bucles
    int valor = 1; //valor introducido en cada posición del array. Irá aumentando en 1 cada vez que se guarda un valor
    int capa = 1; //variable que indica la capa del array en la que nos encontramos, empieza desde la corteza hacia dentro
    int limite = 0; //variable que indica el número de la fila donde empieza cada capa (capa - 1)

    //un array tiene longitud / 2 capas si es par y longitud / 2 + 1 capas si es impar
    while ((capa <= longitud / 2 + 1) && (limite <= longitud / 2)) {
      //empezamos guardando la primera fila de la capa
      for (i = limite; i <= longitud - capa; i++) {
        matriz[limite][i] = valor;
        valor++;
      }

      //guardamos la columna externa derecha de la capa (empezando desde el segundo valor)
      for (i = capa; i <= longitud - capa; i++) {
        matriz[i][longitud - capa] = valor;
        valor++;
      }

      //guardamos la última fila de la capa (empezando desde el penúltimo valor)
      for (i = longitud - capa - 1; i > limite; i--) {
        matriz[longitud - capa][i] = valor;
        valor++;
      }

      //guardamos la primera columna (sin guardar el primer valor y terminando con la capa para pasar a la siguiente si hay)
      for (i = longitud - capa; i > limite; i--) {
        matriz[i][limite] = valor;
        valor++;
      }

      //capa y límite aumentan en cada iteración del bucle while
      capa++;
      limite++;
    }

    muestraArrayBiEnTabla(matriz, longitud, longitud); //mostramos el array resultado
  }


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