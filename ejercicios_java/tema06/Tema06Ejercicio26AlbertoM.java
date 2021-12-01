/**
 * Realiza un programa que pinte una tableta de turrón con un bocado realizado de
 * forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
 * da alrededor del turrón, obviamente no se puede dar un bocado por en medio
 * de la tableta.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio26AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA UNA TABLETA DE TURRÓN MORDIDA POR PANTALLA");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    int anchura = 0;
    int altura = 0;

    System.out.println("Introduzca la anchura de la tableta, por favor: ");
    System.out.print("> ");
    anchura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Introduzca ahora la altura de la tableta, por favor:");
    System.out.print("> ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int linea = 1;
    int bocado = 0;
    
    int numBocado = ((int)(Math.random() * ((anchura * 2) + (altura - 2) * 2)));
    
    while (linea <= altura) {
      
      for (int longLinea = 1; longLinea <= anchura; longLinea++) {
        if ((linea == 1) || (linea == altura) || (longLinea == 1) || (longLinea == anchura)){
          if (bocado == numBocado) {
            System.out.print(" ");
          } else {
            System.out.print("*");
          }

          bocado++;
        } else {
          System.out.print("*");
        }
      }
      
      System.out.println(" ");
      
      linea++;
    }
  }
} 