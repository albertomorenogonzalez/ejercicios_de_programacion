import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801 para usar una de sus funciones
import funciones.funcionesTema802; //importamos la biblioteca de funciones funcionesTema802 para usar una de sus funciones
import java.util.Scanner; //importamos la clase Scanner

/**
 * Crea las funciones cuyas cabeceras se muestran a continuación, observa que
 * tienen el mismo nombre:
 * public static int ocurrencias(int digito, int n)
 * public static int ocurrencias(int digito, int[] a)
 * La función ocurrencias devuelve el número de veces que aparece un dígito
 * dentro de un número (primera función) o bien el número de veces que aparece
 * un dígito en una serie de números contenidos en un array (segunda función).
 * Utiliza estas funciones en un programa para comprobar que funcionan bien.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio54AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE DEVUELVE EL NÚMERO DE VECES QUE APARECE UN DÍGITO DENTRO DE UN NÚMERO O DE UN ARRAY");
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int numero = (int)(Math.random() * 10000001);

    System.out.println("Número : " + numero + "\n");

    System.out.println("Introduzca el dígito del que quiere ver el número de veces que aparece dentro del número:");
    System.out.print("> ");
    int digitoNum = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.print("El " + digitoNum + " aparece " + ocurrencias(digitoNum, numero));

    if (ocurrencias(digitoNum, numero) == 1) {
      System.out.println(" vez\n");
    } else {
      System.out.println(" veces\n");
    } //if (ocurrencias(digitoNum, numero) == 1)

    System.out.println("Array:\n");

    int[] array = funciones.funcionesTema802.generaArrayInt(((int)(Math.random() * 9) + 1),  999, 0);

    funciones.funcionesTema802.muestraArrayEnTabla(array, array.length);

    System.out.println(" \n");

    System.out.println("Introduzca el dígito del que quiere ver el número de veces que aparece dentro del array:");
    System.out.print("> ");
    int digitoArray = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.print("El " + digitoArray + " aparece " + ocurrencias(digitoArray, array));

    if (ocurrencias(digitoArray, array) == 1) {
      System.out.println(" vez\n");
    } else {
      System.out.println(" veces\n");
    } //if (ocurrencias(digitoArray, array) == 1)
  }


  /**
   * La función devuelve el número de veces que aparece un dígito
   * dentro de un número
   *
   * @param digito digito que se quiere comprobar
   * @param n número donde se va a comprobar
   * @return ocurrencias del dígito introducido en el número
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int ocurrencias(int digito, int n) {
    //la variable ocurrencias es un contador de las veces que aparece un dígito dentro de un número
    //tenemos un bucle for each que dará tantas iteraciones como dígitos tenga el número donde se quiere comprobar
    //en cada iteración se comprobará si un dígito es el número introducido. Si es así, ocurrencias sumará uno 
    int ocurrencias = 0; 

    for (int i = 0; i < funciones.funcionesTema801.digitos(n); i++) {
      if (funciones.funcionesTema801.digitoN(n, i) == digito) {
        ocurrencias++;
      } 
    } //for (int i = 0; i < funciones.funcionesTema801.digitos(n); i++)

    return ocurrencias;
  } //public static int ocurrencias(int digito, int n)


  /**
   * La función bien el número de veces que aparece
   * un dígito en una serie de números contenidos en un array
   *
   * @param digito digito que se quiere comprobar
   * @param a array donde se va a comprobar
   * @return ocurrencias del dígito introducido en el número
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int ocurrencias(int digito, int[] a) {
    int ocurrencias = 0;

    //se usará la función ocurrencias para calcular las ocurrencias cada valor del array
    //una vez encontrado el número, se sumará a la variable ocurrencias y se pasará
    //a comprobar als ocurrencias del siguiente valor, así hasta recorrer todo el array.
    for (int i = 0; i < a.length; i++) {
      ocurrencias = ocurrencias + ocurrencias(digito, a[i]);
    } 

    return ocurrencias;
  } //public static int ocurrencias(int digito, int[] a)
}