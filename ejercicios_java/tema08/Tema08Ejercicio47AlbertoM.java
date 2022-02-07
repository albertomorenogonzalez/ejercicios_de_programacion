import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones

/**
 * Define la función convierteArrayEnString con la siguiente cabecera:
 * public static String convierteArrayEnString(int[] a)
 * Esta función toma como parámetro un array que contiene números y devuelve
 * una cadena de caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) 
 * devuelve “”; si a = { 8 }, convierteArrayEnString(a) devuelve
 * “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve “62501”.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio47AlbertoM { 
  public static void main(String[] args) {System.out.println("PROGRAMA QUE CONVIERTE UN ARRAY EN UN STRING");
    System.out.println("---------------------------------------------");
    System.out.println(" ");

    System.out.println("Array:\n");

    int[] array = funciones.funcionesTema802.generaArrayInt(10, 10, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array, array.length);

    System.out.print("\n\nArray hecho cadena de caracteres: ");

    System.out.print(convierteArrayEnString(array));
  }


  /**
   * La función toma como parámetro un array que contiene números y devuelve
   * una cadena de caracteres con esos números.
   *
   * @param a array parámetro que se va a convertir en String
   * @return un array hecho String
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String convierteArrayEnString(int[] a) {
    String numero = ""; //definimos la variable String donde vamos a guardar el array

    //asignamos con un bucle for each cada número del array a numero
    for (int i = 0; i < a.length; i++) {
      numero = numero + String.valueOf(a[i]);
    }

    return numero;
  } //public static String linea (char caracter, int repeticiones) 
}