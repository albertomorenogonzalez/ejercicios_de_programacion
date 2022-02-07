import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801 para usar una de sus funciones
import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones

/**
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
 * lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
 * de rutinas):
 * public int[] filtraCapicuas(int x[])
 *     Devuelve un array con todos los números
 *     capicúa que se encuentren en otro array
 *     que se pasa como parámetro.
 *     Obviamente el tamaño del array que se
 *     devuelve será menor o igual al que se
 *     pasa como parámetro.
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para
 * que el ejercicio resulte más fácil, las repeticiones de números capicúa se
 * conservan; es decir, si en el array x el número 505 se repite 3 veces, en el
 * array devuelto también estará repetido 3 veces. Si no existe ningún número
 * capicúa en x, se devuelve un array con el número -1 como único elemento.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio38AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DEVUELVE UN ARRAY CON TODOS LOS NÚMEROS CAPICÚAS DE OTRO ARRAY");
    System.out.println("----------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Array:\n");

    int[] array = funciones.funcionesTema802.generaArrayInt(10, 999, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array, array.length);

    System.out.println("\n ");

    System.out.println("Números capicúas del array del array:\n");

    funciones.funcionesTema802.muestraArrayEnTabla(filtraCapicuas(array), filtraCapicuas(array).length);
  }

  /**
   * La función devuelve un array con todos los números
   * capicúa que se encuentren en otro array
   * que se pasa como parámetro.
   * Obviamente el tamaño del array que se
   * devuelve será menor o igual al que se
   * pasa como parámetro.
   *
   * @param x array unidimensional donde se va a mirar si hay números capicúa
   * @return array de los números capicúa del array introducido como parámetro
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int[] filtraCapicuas(int x[]) {
    int[] arrayCapicuaAux = new int [x.length]; //definimos un array de longitud array parámetro donde guardaremos todos los números capicúa del array
    int i; //definimos el índice i para usarlo en los bucles for
    int j = 0; //definimos e inicializamos a 0 la variable j, que aumentará cada vez que e guarde un número capicúa en el array

    //este bucle irá recorriendo cada valor del array. Si uno de esos valores es capicúa, se guadará en el array y j aumentará en 1
    for (i = 0; i < x.length; i++) {
      if (funciones.funcionesTema801.esCapicua(x[i])) {
        arrayCapicuaAux[j] = x[i];
        j++;
      }
    } //for (int i = 0; i < x.length; i++)

    int[] arrayCapicua = new int [j]; //definimos el array final donde guardaremos los capicúa de tamaño j
    int[] arraySiNoHayCapicua = {-1}; //definos el array arraySiNoHayCapicua, que usaremos si no se ha encontrado ningún número capicúa en el array parámetro

    //con este bucle iremos pasando los valores respectivos de arrayCapicuaAux a arrayCapicua
    for (i = 0; i < j; i++) {
      arrayCapicua[i] = arrayCapicuaAux[i];
    }

    //si j acabó el bucle con valor 0, la función devolverá arraySiNoHayCapicua. En cualquier otro caso devolverá arrayCapicua
    if (j > 0) {
      return arrayCapicua;
    } else {
      return arraySiNoHayCapicua;
    } //if (j > 0)
  } //public static int[] filtraCapicua(int x[])
}