import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801 para usar una de sus funciones
import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones

/**
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
 * lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
 * de rutinas):
 * public int[] filtraCon7(int x[]) 
 *    Devuelve un array con todos los números
 *    que contienen el 7 (por ej. 7, 27, 782)
 *    que se encuentren en otro array que se
 *    pasa como parámetro. El tamaño del array
 *    que se devuelve será menor o igual al
 *    que se pasa como parámetro.
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para
 * que el ejercicio resulte más fácil, las repeticiones de números que contienen
 * 7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
 * el array devuelto también estará repetido 3 veces. Si no existe ningún número
 * que contiene 7 en el array x, se devuelve un array con el número -1 como único
 * elemento.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio40AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DEVUELVE UN ARRAY CON TODOS LOS NÚMEROS QUE CONTIENEN EL 7 DE OTRO ARRAY");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Array:\n");

    int[] array = funciones.funcionesTema802.generaArrayInt(10, 999, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array, array.length);

    System.out.println("\n ");

    System.out.println("Números que contienen el dígito 7 del array:\n");

    funciones.funcionesTema802.muestraArrayEnTabla(filtraCon7(array), filtraCon7(array).length);
  }

  /**
   * Devuelve un array con todos los números
   * que contienen el 7 (por ej. 7, 27, 782)
   * que se encuentren en otro array que se
   * pasa como parámetro. El tamaño del array
   * que se devuelve será menor o igual al
   * que se pasa como parámetro.
   *
   * @param x array unidimensional donde se va a mirar si hay números que incluyen un 7 como dígito
   * @return array de los números que contienen un 7 del array introducido como parámetro
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static  int[] filtraCon7(int x[]) {
    int[] arrayCon7Aux = new int [x.length]; //definimos un array de longitud array parámetro donde guardaremos todos los números con 7 del array
    int i; //definimos el índice i para usarlo en los bucles for
    int k = 0; //definimos e inicializamos a 0 la variable k, que aumentará cada vez que e guarde un número capicúa en el array

    //se irá comprobando cada valor del array gracias al bucle for. Dentro de este bucle, para cada valor del array declaramos
    //una variable booleana denominada encontrada y declarada como falsa. Seguidamente tendremos un bucle anidado de indice j
    //donde recorreremos cada dígito del valor. Si se encuentra un siete el número se guardará en arrayCon7Aux,
    //k aumentará y encontrado se volverá veradero y el bucle de índice j parará, y se pasará al siguiente valor del array.
    //Si no se encuentra un 7 simplemente se pasará al siguiente valor del array, sin aumentar k ni guadarse el valor en el array arrayCon7Aux
    for (i = 0; i < x.length; i++) {
      boolean encontrado = false;
      for (int j = 0; (j < funciones.funcionesTema801.digitos(x[i]) && (!encontrado)); j++) {
        if (funciones.funcionesTema801.digitoN(x[i], j) == 7) {
          arrayCon7Aux[k] = x[i];
          k++;
          encontrado = true;
        } //if (funciones.funcionesTema801.digitoN(x[i], j) == 7)
      } //for (int j = 0; (j < funciones.funcionesTema801.digitos(x[i]) && (!encontrado)); j++)
    } //for (i = 0; i < x.length; i++)

    int[] arrayCon7 = new int [k]; //definimos el array final donde guardaremos los números con 7 de tamaño k
    int[] arraySiNoHayNumCon7 = {-1}; //definos el array arraySiNoHayNumCon7, que usaremos si no se ha encontrado ningún número con 7 en el array parámetro

    //con este bucle iremos pasando los valores respectivos de arrayCon7Aux a arrayCon7
    for (i = 0; i < k; i++) {
      arrayCon7[i] = arrayCon7Aux[i];
    }

    //si k acabó el bucle con valor 0, la función devolverá arraySiNoHayNumCon7. En cualquier otro caso devolverá arrayCon7
    if (k > 0) {
      return arrayCon7;
    } else {
      return arraySiNoHayNumCon7;
    } //if (k > 0)
  } //public static  int[] filtraCon7(int x[])
}