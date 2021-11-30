/**
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio23AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA DE FORMA ALEATORIA LA TIRADA DE 5 DADOS DE PÓKER");
    System.out.println("---------------------------------------------------------------------");
    System.out.println(" ");

    for (int contadorTiradas = 0; contadorTiradas < 5; contadorTiradas++) {
      int numCara = ((int)(Math.random() * 6));
      String cara = " ";
      switch (numCara) {
        case 0:
          cara = "As";
          break;
        case 1:
          cara = "K";
          break;
        case 2:
          cara = "Q";
          break;
        case 3:
          cara = "J";
          break;
        case 4:
          cara = "7";
          break;
        case 5:
          cara = "8";
          break;
        default:

      }

      System.out.print(cara + " ");
    }
  }
} 