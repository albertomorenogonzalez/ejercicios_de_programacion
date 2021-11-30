/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio56AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UN TRIÁNGULO RELLENO");
    System.out.println("----------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la altura del triángulo, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int linea = 1;
    int numCaracteres = altura;

    while (linea <= altura) {
      for (int numEspacios = 1; numEspacios < linea; numEspacios++) {
        System.out.print(" "); 
      }
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        System.out.print("*");
      }

      System.out.println(" ");
      linea++;
      numCaracteres--;
    }
  }
}