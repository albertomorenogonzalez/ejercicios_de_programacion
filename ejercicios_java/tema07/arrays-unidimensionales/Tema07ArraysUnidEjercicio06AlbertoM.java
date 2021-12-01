/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio06AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE LEE UN ARRAY DE 15 NÚMEROS POR TECLADO Y LOS MUEVE TODOS UNA POSICIÓN");
    System.out.println("-----------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [15];

    int indice;

    for (indice = 0; indice < 15; indice++) {
      System.out.print("> ");
      numero[indice] = Integer.parseInt(System.console().readLine());
    }

    System.out.println(" ");

    for (indice = 0; indice < 15; indice++) {
      if (indice == 0) {
        System.out.print(numero[14] + " ");
      } else {
        System.out.print(numero[(indice - 1)] + " ");
      }
    }
  }
}