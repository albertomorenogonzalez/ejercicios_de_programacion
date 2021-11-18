/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio33AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA Us");
    System.out.println("----------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura de la U, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    System.out.println(" ");
    
    for (int linea = 1; linea <= altura; linea++) {
      if (linea < altura) {
        for (int longLinea = 1; longLinea <= (altura + (altura - 3)); longLinea++) {
          if ((longLinea == 1)  || (longLinea == (altura + (altura - 3)))){
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println(" ");
      } else if (linea == altura) {
          for (int longLinea = 1; longLinea <= (altura + (altura - 3)); longLinea++) {
            if (((longLinea % 2) != 0) || (longLinea == altura + (altura - 3))) {
              System.out.print(" ");
            } else {
              System.out.print("*");
            } 
          }
      }
    }
  }
}
