import funciones.funcionesTema803; //importamos la biblioteca de funciones funcionesTema803 para usar una de sus funciones

/**
 * Se dice que una matriz (un array bidimensional) tiene el borde homogéneo cuando todos los dígitos
 * que se encuentran en el borde son iguales. Por ejemplo, la siguiente matriz tiene el borde homogéneo:
 * 2 2 2 2 2
 * 2 4 1 5 2
 * 2 0 9 8 2
 * 2 2 2 2 2
 * Realiza una función que diga si una matriz dada tiene o no el borde homogéneo y pruébala en un
 * programa. Los valores de los arrays de prueba deben estar asignados en el programa, no se piden por
 * teclado. La cabecera de la función es la siguiente:
 * public static boolean tieneBordeHomogeneo(int[ ][ ] a)
 *
 * @author Alberto Moreno Gonzalez
 */
public class EjercicioAmpliacion2 { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI UNA MATRIZ TIENE EL BORDE HOMOGÉNEO");
    System.out.println("---------------------------------------------------------");
    System.out.println(" ");

    int[][] array = funciones.funcionesTema803.generaArrayBiInt(((int)(Math.random() * 9) + 1), ((int)(Math.random() * 9) + 1), 10, 0);

    System.out.println("Array:\n");

    funciones.funcionesTema803.muestraArrayBiEnTabla(array, array.length, array[0].length);

    System.out.print("\n\nEl borde ");

    if (!tieneBordeHomogeneo(array)) {
      System.out.print("no ");
    }

    System.out.println("es homogéneo");
  }


  /**
   * La función extraer la capa exterior de un array bidimensional. 
   * Esta capa se extrae en forma de array de
   * una dimensión. La extracción de números comienza en la esquina superior
   * izquierda y continúa en el sentido de las agujas del reloj.
   *
   * @param n array bidimensional del que se va a sacar la corteza
   * @return "corteza del array"
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[] corteza(int[][] n) {
    //declaramos el array unidimensional donde iremos guardando todos los valores de la "corteza" del array mientras no sepamos su longitud
    int[] cortezaAux = new int [n.length * n[0].length]; 
    int i; //declaramos el índice i para usarlo en los bucles
    //declaramos el índice j y lo inicalizamos a cero. Este índice lo usaremos para ir guardando valores en cortezaAux y calcular la longitud del array resultado
    int j = 0; 

    //pongamos como ejemplo un array de 4x4, 4 filas y 4 columnas
    //en la corteza tenemos que guardar la fila 0, la columna 3, la fila 3 y la columna 0
    //para evitar poner los valores de las esquinas 2 veces, empezaremos a guardar la columna 3
    //desde la posición [1][3] hasta la [3][3] y la fila 3 desde la [3][2] a la [3][1]
    //en la columna 0 no guardamos la posición [0][0] de nuevo
    //el array se guarda en el sentido de las agujas del reloj 

    //guardamos en el array la fila 0
    for (i = 0; i < n[0].length; i++) {
      cortezaAux[j] = n[0][i];
      j++;
    }

    //guardamos en el array la columna exterior derecha (= n[0].length - 1)
    //desde el valor de la fila 1 hasta el valor de la fila n.length - 2
    for (i = 1; i < n.length - 1; i++) {
      cortezaAux[j] = n[i][n[0].length - 1];
      j++;
    }

    //guardamos en el array la fila exterior de abajo (= n.length - 1)
    //desde el valor de la columna n[0].length - 2 hasta el valor de la columna 1
    for (i = n[0].length - 1; i > 0; i--) {
      cortezaAux[j] = n[n.length - 1][i];
      j++;
    }

    //guardamos en el array la columna 0 (sin contar la posición [0][0])
    for (i = n.length - 1; i > 0; i--) {
      cortezaAux[j] = n[i][0];
      j++;
    }

    int[] corteza = new int [j]; //declaramos el array corteza que usaremos para guardar el resultado sin valores nulos. El array es de tamaño j

    //añadimos los valores de cortezaAux a corteza gracias a este bucle
    for (i = 0; i < j; i++) {
      corteza[i] = cortezaAux[i];
    }

    return corteza;
  } //public static int[] corteza(int[][] n)


  /**
   * La función dice si una matriz dada tiene o no el borde homogéneo
   *
   * @param a array bidimensional del que se va a comprobar si su borde es homgéneo
   * @return si es el borde es o no homogéneo
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static boolean tieneBordeHomogeneo(int[ ][ ] a) {
    int[] borde = corteza(a);
    boolean homogeneo = true;

    for (int i = 0; ((i < borde.length) && (homogeneo)); i++) {
      for (int j = 0; ((j < borde.length) && (homogeneo)); j++) {
        if (borde[j] != borde[i]) {
          homogeneo = false;
        } 
      }
    }

    if (!homogeneo) {
      return false;
    } else {
      return true;
    }

  } //public static boolean tieneBordeHomogeneo(int[ ][ ] a)
}