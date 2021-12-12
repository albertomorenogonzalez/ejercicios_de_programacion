/**
 * Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array “cincuerizado”, según el siguiente criterio: si el número que hay en una
 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
 * siguiente múltiplo de 5 que exista a partir de él.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio21AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE 'CINCUERIZA' UN ARRAY DE 15 ELEMENTOS ALEATORIOS ENTEROS ENTRE 0 Y 500");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [15];

    int indice;

    System.out.println("Array original:");

    for (indice = 0; indice < 15; indice++) {
      numero[indice] = ((int)(Math.random() * 501));

      System.out.print(numero[indice] + " ");
    } // for

    System.out.println(" ");

    System.out.println(" ");

    System.out.println("Array cincuerizado:");

    for (indice = 0; indice < 15; indice++) {
      if ((numero[indice] % 5) == 0) {
        System.out.print(numero[indice] + " ");
      } else {
        while ((numero[indice] % 5) != 0) {
          numero[indice] = (numero[indice] + 1);
        }

        System.out.print(numero[indice] + " ");
      }
    }
  }
} 