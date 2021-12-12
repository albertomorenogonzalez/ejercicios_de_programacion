/**
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio18AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA UN ARRAY DE 10 NÚMEROS ALEATORIOS ENTRE 0 Y 200 Y LUEGO MUESTRA UN ARRAY EN EL QUE ALTERNAMENTE MUESTRA UN NÚMERO MENOR O E IGUAL QUE 100 Y LUEGO OTRO MAYOR A 100");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [10];
    int[] resultadoMenoresQueCien = new int [10];
    int[] resultadoMayoresQueCien = new int [10];

    int indice;
    int indice2 = 0;
    int contadorNumerosMenIgCien = 0;
    int indice3 = 0;
    int contadorNumerosMayCien = 0;

    // mostramos el array original
    System.out.println("Array original:");

    System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
    System.out.print("|Índice|");

    for (indice = 0; indice < 10; indice++) {
      System.out.printf(" %d %-1s" ,indice ,"|");
    }

    System.out.println(" ");

    System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
    System.out.print("|Número|");

    for (indice = 0; indice < 10; indice++) {
      numero[indice] = ((int)(Math.random() * 201));

      if (numero[indice] <= 100) {
        resultadoMenoresQueCien[indice2] = numero[indice];
        indice2++;
        contadorNumerosMenIgCien++;
      } else {
        resultadoMayoresQueCien[indice3] = numero[indice];
        indice3++;
        contadorNumerosMayCien++;
      }

      System.out.printf("%3d%-1s" ,numero[indice] ,"|");
    } // for

    System.out.println(" ");

    System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");

    System.out.println(" ");



    // mostramos el array resultado
    System.out.println("Resultado:");

    System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
    System.out.print("|Índice|");

    for (indice = 0; indice < 10; indice++) {
      System.out.printf(" %d %-1s" ,indice ,"|");
    }

    System.out.println(" ");

    System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
    System.out.print("|Número|");

    // mientras queden números de los generados en cada array, el programa imprimirá primero el que sea menor o igual a 100, y luego el que sea mayor. Cuando uno de los dos se acabe,
    // completará el rresultado con los números del array del que todavía quedan.
    for (indice = 0; indice < 10; indice++) {
      if (contadorNumerosMenIgCien > 0)  {
        System.out.printf("%3d%-1s" ,resultadoMenoresQueCien[indice] ,"|");
        contadorNumerosMenIgCien--;
      }

      if (contadorNumerosMayCien > 0) {
        System.out.printf("%3d%-1s" ,resultadoMayoresQueCien[indice] ,"|");
        contadorNumerosMayCien--;
      }
    } // for

    System.out.println(" ");

    System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
  }
} 