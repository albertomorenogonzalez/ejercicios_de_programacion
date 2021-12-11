/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio14AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE 8 PALABRAS Y LA ALMACENA EN UN ARRAY. LUEGO MOSTRARÁ PRIMERO LAS QUE SEA COLORES Y DESPUÉS EL RESTO");
    System.out.println("----------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    String[] palabra = new String [8];

    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    int comprobadorColores = 0;
    String[] coloresResultado = new String [8];
    String[] restoResultado = new String [8];

    int indice;
    int indice2 = 0;
    int indice3 = 0;
    int contadorColores = 0;
    int contadorResto = 0;

    System.out.println("Introduzca 8 palabras:");

    for (indice = 0; indice < 8; indice++) {
      System.out.print("> ");
      palabra[indice] = (System.console().readLine().toLowerCase());

      boolean palabraEsColor = false;

      for (comprobadorColores = 0; ((comprobadorColores < 9) && (!palabraEsColor)); comprobadorColores++) { 
        if (palabra[indice].equals(colores[comprobadorColores])) {
          palabraEsColor = true;
          coloresResultado[indice2] = palabra[indice];
          indice2++;
          contadorColores++;
        } 
      }

      if (!palabraEsColor) {
        restoResultado[indice3] = palabra[indice];
        indice3++;
        contadorResto++;
      } 
    }

    System.out.println(" ");

    System.out.println("Array original:");

    System.out.println("┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐");
    System.out.print("|Índice |");

    for (indice = 0; indice < 8; indice++) {
      System.out.printf("   %d   %-1s" ,(indice) ,"|");
    }

    System.out.println(" ");

    System.out.println("├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
    System.out.print("|Palabra|");

    for (indice = 0; indice < 8; indice++) {
      System.out.printf("%-7s%-1s" ,palabra[indice] ,"|");
    }

    System.out.println(" ");

    System.out.println("└───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");

    System.out.println(" ");

    System.out.println("Resultado:");

    System.out.println("┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐");
    System.out.print("|Índice |");

    for (indice = 0; indice < 8; indice++) {
      System.out.printf("   %d   %-1s" ,(indice) ,"|");
    }

    System.out.println(" ");

    System.out.println("├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
    System.out.print("|Palabra|");

    for (indice = 0; indice < contadorColores; indice++) {
      System.out.printf("%-7s%-1s" ,coloresResultado[indice] ,"|");
    }

    for (indice = 0; indice < contadorResto; indice++) {
      System.out.printf("%-7s%-1s" ,restoResultado[indice] ,"|");
    }

    System.out.println(" ");

    System.out.println("└───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘");
  }
}