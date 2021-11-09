/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio13AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE 10 NÚMEROS Y DICE CUANTOS SON POSITVOS Y CUANTOS NEGATIVOS");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca los números: ");
  
    int numNumerosPos = 0;
    
    int numNumerosNeg = 0;
    
    for (int contador = 1; contador <= 10; contador++) {
      System.out.print("> ");
      double numero = Double.parseDouble(System.console().readLine());
      System.out.println(" ");
      
      if (numero > 0) {
        numNumerosPos++;
      } else if (numero < 0) {
        numNumerosNeg++;
      }
    }
    
    System.out.println("Introdujo " + numNumerosPos + " números positivos y "+ numNumerosNeg + " números negativos.");
  }
}
