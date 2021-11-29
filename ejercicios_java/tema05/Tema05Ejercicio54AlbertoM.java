/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio54AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UN TRIÁNGULO HUECO");
    System.out.println("--------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura del triángulo, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int linea = 1;
    int numCaracteres = altura;

    while (linea <= altura) {
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if ((linea == 1) || (linea == altura)) {
          System.out.print("*");
        } else {
            if ((longLinea == 1) || (longLinea == numCaracteres)) {
              System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
      }

      System.out.println(" ");
      linea++;
      numCaracteres--;
    }
  }
}