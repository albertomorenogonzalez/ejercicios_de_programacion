/**
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio19AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA UN ARRAY DE 12 NÚMEROS ALEATORIOS ENTRE 0 Y 200 Y EN EL QUE LUEGO PUEDES INTRODUCIR UN NÚMERO NUEVO, PERDIÉNDOSE EL ÚLTIMO");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [12];
    int[] aux = new int [12];

    int indice;

    // mostramos el array original
    System.out.println("Array original:");

    System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬────┬────┐");
    System.out.print("|Índice|");

    for (indice = 0; indice < 12; indice++) {
      System.out.printf(" %d %-1s" ,indice ,"|");
    }

    System.out.println(" ");

    System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼────┼────┤");
    System.out.print("|Número|");

    for (indice = 0; indice < 12; indice++) {
      numero[indice] = ((int)(Math.random() * 201));
      // guardamos en un array auxiliar el array original para usarlo como referencia en el resultado
      aux[indice] = numero[indice];

      if (indice > 9) {
        System.out.printf(" %3d%-1s" ,numero[indice] ,"|");
      } else {
        System.out.printf("%3d%-1s" ,numero[indice] ,"|");
      }
    } // for

    System.out.println(" ");

    System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴────┴────┘");

    System.out.println(" ");

    System.out.println("Introduzca el número que quiere introducir en el array:");
    System.out.print("> ");
    int nuevoNumero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Introduzca la posición donde quiere insertarlo:");
    System.out.print("> ");
    int posicion = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    // mostramos el array resultado
    System.out.println("Resultado:");

    System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬────┬────┐");
    System.out.print("|Índice|");

    for (indice = 0; indice < 12; indice++) {
      System.out.printf(" %d %-1s" ,indice ,"|");
    }

    System.out.println(" ");

    System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼────┼────┤");
    System.out.print("|Número|");

    // el número introducido se mostrará en la posiicón indicada 
    // Después de ese número los números se desplazarán una posición a la derecha en el array original teneindo como referencia el array auxiliar
    // El número de la posición 11 original desaparece
    for (indice = 0; indice < 12; indice++) {
      if (indice == posicion) {
        numero[indice] = nuevoNumero;
      } else if (indice > posicion) {
        numero[indice] = aux[(indice - 1)];
      }

      if (indice > 9) {
        System.out.printf(" %3d%-1s" ,numero[indice] ,"|");
      } else {
        System.out.printf("%3d%-1s" ,numero[indice] ,"|");
      }
    } // for

    System.out.println(" ");

    System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴────┴────┘");
  }
} 