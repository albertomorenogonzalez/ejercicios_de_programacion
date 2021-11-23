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
    
    int altura = 0;

    while (altura <= 0) {
      System.out.println("Introduzca la altura de la pirámide, por favor (número mayor que 0): ");
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    }
    
    System.out.println("Introduzca el carácter del que quiere hacer la pirámide, por favor:");
    System.out.print("> ");
    String caracter = System.console().readLine();
    System.out.println(" ");
    
    int linea = 1;
    int numCaracteres = 1;
    int espacios = altura - 1;

    while (linea <= altura) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        System.out.print(caracter);
      }
      
      System.out.println(" ");
      
      linea++;
      numCaracteres += 2;
      espacios--;
    }
  }
}
