/**
 * Realiza una función que tome como parámetro un array de cadenas de caracteres 
 * y que devuelva otro array con los mismos valores habiendo eliminado
 * las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto
 * “hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los 
 * valores {“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”, “sol”,
 * “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”, “coche”,
 * “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto el código
 * de la función como el código de prueba que la usa. La cabecera de la función
 * es la siguiente:
 * public static String[] sinRepetir(String[] s)
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio55AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DEVUELE UN ARRAY DE CADENAS DE CARACTERES SIN MOSTRAR LAS REPETICIONES");
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println(" ");

    int i;

    String[] array = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};

    System.out.println("Array original:\n");

    for (i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }

    System.out.println("\n\nArray sin repeticiones:\n");

    for (i = 0; i < sinRepetir(array).length; i++) {
      System.out.print(sinRepetir(array)[i] + ", ");
    }
  }


  /**
   * La función toma como parámetro un array de cadenas de caracteres 
   * y que devuelva otro array con los mismos valores habiendo eliminado
   * las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto
   * “hola” es distinto de “Hola”.
   *
   * @param s array de cadenas de carateres
   * @return array de cadenas de de caracteres sin cadenas repetidas
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String[] sinRepetir(String[] s) {
    String[] arraySinRepeticionesAux = new String [s.length]; //declaramos un array auxiliar de Strings donde guardaremos primeramente los valores sin las repeticiones
    int i; //declaramos el índice i para usarlo en más de un bucle
    int k = 0; //declaramaos el índice k, que aumentará cada vez que se guarde un número en arraySinRepeticionesAux

    //con el bucle de índice i iremos pasando de un valor del array parámetro a otro
    //por cada valor del array comprobaremos con el bucle de índice j si ese valor se encuentra ya en arraySinRepticionesAux
    //la variable booleana repetido se hará verdadera si el valor del array parámetro ya se ha añadido
    //si sigue repetido sigue siendo falsa después del bucle, significa que ese valor no se encuentra aún en el array y se añadirá
    //k sumará 1
    for (i = 0; i < s.length; i++) {
      boolean repetido = false;
      for (int j = 0; ((j < s.length) && (!repetido)); j++) {
        if (s[i].equals(arraySinRepeticionesAux[j])) {
          repetido = true;
        } 
      } //for (int j = 0; ((j < s.length) && (!repetido)); j++)

      if (!repetido) {
        arraySinRepeticionesAux[k] = s[i];
        k++;
      }
    } //for (i = 0; i < s.length; i++)

    String[] arraySinRepeticiones = new String [k]; //declaramos el array donde guardaremos el resultado final. Será de tamaño k, así no tendremos valores nulos

    //añadimos los valores de arraySinRepeticionesAux a arraySinRepeticiones gracias a este bucle
    for (i = 0; i < k; i++) {
      arraySinRepeticiones[i] = arraySinRepeticionesAux[i];
    }

    return arraySinRepeticiones;
  } //public static String[] sinRepetir(String[] s)
}