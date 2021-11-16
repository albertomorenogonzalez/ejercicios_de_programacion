/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio31AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA Ls");
    System.out.println("----------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura de la l, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    for (int caracteres = 1; caracteres <= altura; caracteres++) {
      if (caracteres < altura) {
        System.out.println("*");
      } else if (caracteres == altura) {
        System.out.print("* ");
      }
    }
    
    for (int carHorizontal = 0; carHorizontal < (altura / 2); carHorizontal++) {
      System.out.print("* ");
    }
  }
}
