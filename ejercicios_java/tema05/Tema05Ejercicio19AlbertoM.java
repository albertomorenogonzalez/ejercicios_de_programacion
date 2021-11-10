/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio19AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA PIRÁMIDE POR PANTALLA");
    System.out.println("---------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura de la pirámide, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca el carácter del que quiere hacer la pirámide, por favor:");
    System.out.print("> ");
    String caracter = System.console().readLine();
    System.out.println(" ");
    
    String espacio = " ";
    
    int numEspacio = 0;
    
    for (int numCaracter = 1; numCaracter < altura; numCaracter++) {
      System.out.print(espacio);
      System.out.println(caracter);
    }
  }
}
