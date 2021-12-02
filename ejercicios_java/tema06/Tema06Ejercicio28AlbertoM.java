/**
 * Realiza una versión del programa “Hola mundo”. Se debe mostrar la palabra
 * HOLA (todo en mayúsculas) hecha con asteriscos. La altura de la palabra debe
 * ser un número impar generado al azar entre el 3 y el 13 ambos incluidos. Los
 * palos horizontales de la H y de la A están justo a la mitad de la altura. La anchura
 * de las letras siempre es la misma. Aunque, en este caso, sólo hay 6 posibles
 * HOLAs de distinta altura, el programa debe hacerse de tal forma que sea muy
 * fácil adaptarlo a otros rangos de altura, por ej. entre 7 y 33. Por tanto, no se da
 * por válido escribir 6 sentencias if, cada una pintando la correspondiente figura
 * completa.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio28AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LA PALABRA HOLA POR PANTALLA");
    System.out.println("--------------------------------------------------");
    System.out.println(" ");

    int altura = 0;

    while ((altura % 2) == 0) {
      altura = ((int)(Math.random() * 31) + 3);
    }

    int linea = 1;

    while (linea <= altura) {
      if (linea == 1) {
        System.out.println("*    *   ****   *        **** ");
      } else if (linea == ((altura / 2) + 1)) {
        System.out.println("******  *    *  *       ******");
      } else if (linea == altura) {
        System.out.println("*    *   ****   ******  *    *");
      } else {
        System.out.println("*    *  *    *  *       *    *");
      }

      linea++;
    }
  }
} 