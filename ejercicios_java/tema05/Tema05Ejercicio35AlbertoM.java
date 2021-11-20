/**
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio35AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA Xs");
    System.out.println("----------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura de la x, por favor (número impar): ");
    
    int altura = 0;
    
    while ((altura % 2) == 0) {
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      System.out.println(" ");
      
      if ((altura % 2) == 0) {
        System.out.println("Introduzca correctamente la altura de la x, por favor (número impar): ");
      }
    }
    
    int linea = (altura / 2);
    int numCaracteres = ((linea * 2) + 1);
    int espacios = 1;
    
    while (linea >= 1) {
      
      for (int numEspacios = espacios; numEspacios > 1; numEspacios--) {
        System.out.print(" "); 
      }
      
      for (int longLinea = numCaracteres; longLinea > 0; longLinea--) {
        if ((longLinea == 1) || (longLinea == numCaracteres)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      
      System.out.println(" ");
      
      linea--;
      numCaracteres -= 2;
      espacios++;
    }
    
    linea = (altura - (altura / 2));
    numCaracteres = 1;
    espacios = (altura / 2);
    
    while (linea <= altura) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if ((longLinea == 1) || (longLinea == numCaracteres)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      
      System.out.println(" ");
      
      linea++;
      numCaracteres += 2;
      espacios--;
    }
  }
}
