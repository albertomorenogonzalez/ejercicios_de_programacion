import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema10Ejercicio02AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE INTRODUCE VALORES ALEATORIOS EN UN ARRAY Y EN UN ARRAY LIST Y QUE LUEGO CALCULE LA SUMA, LA MEDIA, EL MÁXIMO Y EL MÍNIMO");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int i;

    System.out.println("Array:\n");

    int[] array = generaArrayInt(((int)(Math.random() * 10) + 10), 101, 0);

    muestraArrayEnTabla(array, array.length);

    System.out.print("\n\nSuma: ");

    int sumatorio = 0;

    for (i = 0; i < array.length; i++) {
      sumatorio = array[i] + sumatorio;
    }

    System.out.println(sumatorio);

    System.out.println("Media: " + mediaArrayInt(array));
    System.out.println("Máximo: " + maximoArrayInt(array));
    System.out.println("Mínimo: " + minimoArrayInt(array));

    System.out.println("\n\n\nArray List:\n");

    int sumatorioAL = 0;
    int arrayListLength = ((int)(Math.random() * 10) + 10);
    int numMayor = 0; 
    int numMenor = 0;

    ArrayList<Integer> numero = new ArrayList<Integer>();
    for (i = 0; i < arrayListLength; i++) {
      numero.add(((int)(Math.random() * 101)));

      sumatorioAL = numero.get(i) + sumatorioAL;
      
      if (i == 0) {
        numMayor = numero.get(i);
        numMenor = numero.get(i);
      } else if (numero.get(i) > numMayor) {
        numMayor = numero.get(i); 
      } else if (numero.get(i) < numMenor) {
        numMenor = numero.get(i); 
      }
    }

    System.out.println(numero);

    System.out.println("\nSuma: " + sumatorioAL);
    System.out.println("Media: " + (sumatorioAL / arrayListLength));
    System.out.println("Máximo: " + numMayor);
    System.out.println("Mínimo: " + numMenor);
  }


  /** FUNCIONES **/


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


  /**
   * La función devuelve el mínimo del array que se pasa como parámetro.
   *
   * @param array array del que se quiere ver cual es el número mínimo
   * @return número mínimo
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long minimoArrayInt(int[] array) {
    long numMenor = 0; //se define la variable numMenor para guardar ahí el número menor

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        numMenor = array[i]; //el primer número será siempre tomado en cuenta como el menor de primera hora
      } else if (array[i] < numMenor) {
        numMenor = array[i]; //si el siguiente número generado es menor que el que hasta ahora el mínimo el nuevo nuevo pasará a ser el mínimo
      } //if (i == 0)
    } //for (int i = 0; i < array.length; i++)

    //¿por qué calculo así el menor? según se vayan introduciendo números el mínimo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer mínimo,
    //por eso lo declaro como tal cuando el contador (i) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al último número

    return numMenor;
  } //public static long minimoArrayInt(int[] array)


  /**
   * La función devuelve el máximo del array que se pasa como parámetro.
   *
   * @param array array del que se quiere ver cual es el número máximo
   * @return número máximo
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long maximoArrayInt(int[] array) {
    long numMayor = 0; //se define la variable numMayor para guardar ahí el número mayor

    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        numMayor = array[i]; //el primer número será siempre tomado en cuenta como el mayor de primera hora
      } else if (array[i] > numMayor) {
        numMayor = array[i]; //si el siguiente número generado es mayor que el que hasta ahora el máximo el nuevo nuevo pasará a ser el máximo
      } //if (i == 0)
    } //for (int i = 0; i < array.length; i++)

    //¿por qué calculo así el mayor? según se vayan introduciendo números el máximo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer máximo,
    //por eso lo declaro como tal cuando el contador (i) está a 0. Si el siguiente número generado es mayor, el número máximo cambiará, así hasta llegar al último número.

    return numMayor;
  } //public static long maximoArrayInt(int[] array)


  /**
   * La función devuelve la media del arrayque se pasa como parámetro
   *
   * @param array array del que se quiere comprobar la media
   * @return media
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static double mediaArrayInt(int[] array) {
    long sumatorio = 0; //definimos e inicializamos la variable sumatorio donde iremos sumando cada valor del array

    //en cada iteración se sumará el valor del array coorespondiente
    for (int i = 0; i < array.length; i++) {
      sumatorio = sumatorio + array[i];
    }

    return ((double)sumatorio / array.length); //la función devolverá el sumatorio partido la longitud del array, es decir, la media
  } //public static long mediaArrayInt(int[] array)
}