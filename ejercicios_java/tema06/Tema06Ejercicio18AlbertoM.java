/**
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 * sustituir el color blanco por colores más alegres. Realiza un programa que
 * genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 * cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
 * debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
 * naranja.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio18AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA UNA SECUENCIA DE TRES COLORES ALEATORIOS");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" ");

    int comprobadorColores1 = -1;
    int comprobadorColores2 = -1;
    int numColores = 0;

    for (int contadorColores = 0; contadorColores < 3; contadorColores++) {
      if (contadorColores == 0) {
        numColores = ((int)(Math.random() * 6));
        comprobadorColores1 = numColores;
      } else if (contadorColores == 1) {
        while (numColores == comprobadorColores1) {
          numColores = ((int)(Math.random() * 6));
        }
        comprobadorColores2 = numColores;
      } else {
        while ((numColores == comprobadorColores1) || (numColores == comprobadorColores2)) {
          numColores = ((int)(Math.random() * 6));
        }
      }
      String colores = " ";
      switch (numColores) {
        case 0:
          colores = "\033[31m■ ";
          break;
        case 1:
          colores = "\033[34m■ ";
          break;
        case 2:
          colores = "\033[32m■ ";
          break; 
        case 3:
          colores = "\033[93m■ ";
          break;
        case 4:
          colores = "\033[35m■ ";
          break;
        case 5:
          colores = "\033[91m■ ";
          break; 
        default:

      }

      System.out.print(colores);
    }
  }    
}