/**
 * Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
 * por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así, 
 * por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
 * aparecer como Felipe 1º y el segundo como Felipe 2º.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio20AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA LA DENOMINACIÓN ORDINAL DE LOS REYES DE UNA SECUENCIA HISTÓRICA INTRODUCIDA POR TECLADO");
    System.out.println("-------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    // establecemos la longitud del array
    System.out.println("Introduzca el número total de nombres de reyes:");
    System.out.print("> ");
    int numTotalArray = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    String[] rey = new String [numTotalArray];

    int indice;
    int comprobadorRepetido = 0;
    int numRey = 1;

    System.out.println("Introduzca los nombres de los reyes, por favor:");

    // introducción de valores en el array
    for (indice = 0; indice < numTotalArray; indice++) {
      System.out.print("> ");
      rey[indice] = (System.console().readLine());
    } // for

    System.out.println(" ");

    System.out.println("Los reyes introducidos son:");

    for (indice = 0; indice < numTotalArray; indice++) {
      // cada vez que el bucle vuelve a empezar, la denominación ordinal de cada rey empieza en uno
      numRey = 1;

      // con este bucle se comprueba el número de veces que aparece el rey en el array hasta el indice que lleve el bucle
      for (comprobadorRepetido = 0; (comprobadorRepetido < indice); comprobadorRepetido++) {
        if (rey[indice].equals(rey[comprobadorRepetido])) {
          numRey++;
        } 
      }

      // muestra el rey y su denominacion ordinal
      System.out.println(rey[indice] + " " + numRey + "º");
    } // for
  }
} 