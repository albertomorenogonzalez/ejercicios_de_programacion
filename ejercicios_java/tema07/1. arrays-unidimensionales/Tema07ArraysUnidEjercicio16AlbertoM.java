/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
 * escribiendo los números que se quieren resaltar entre corchetes.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio16AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE RESALTA LOS MÚLTIPLOS DE 5 O DE 7 DE UN ARRAY DE NÚMEROS ALEATORIOS");
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [20];

    int indice;

    for (indice = 0; indice < 20; indice++) {
      numero[indice] = ((int)(Math.random() * 401));

      System.out.print(numero[indice] + " ");
    }

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("¿Qué números quiere resaltar? Pulse: ");
    System.out.println("1 - Múltiplos de 5");
    System.out.println("2 - Múltiplos de 7");
    System.out.print("> ");
    int numResaltado = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    if ((numResaltado != 1) && (numResaltado != 2)) {
      System.out.println("Introduzca correctamente los múltiplos que quiere destacar. Reinicie el programa:");
    } else {
      for (indice = 0; indice < 20; indice++) {
        if ((numResaltado == 1) && ((numero[indice] % 5) == 0)) {
          System.out.print("[" + numero[indice] + "] ");
        } else if ((numResaltado == 2) && ((numero[indice] % 7) == 0)) {
          System.out.print("[" + numero[indice] + "] ");
        } else {
          System.out.print(numero[indice] + " ");
        } // if
      } // for
    }
  }
}