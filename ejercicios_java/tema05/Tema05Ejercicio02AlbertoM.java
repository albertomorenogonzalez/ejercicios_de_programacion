/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio02AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS MÚLTIPLOS DE 5 DE 0 A 100");
    System.out.println("---------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Los múltiplos de 5 del 0 al 100 son:");
  
    int multiplo5 = 0;
    
    while (multiplo5 <= 100) {
      System.out.print(multiplo5);
      
      if (multiplo5 < 100) {
        System.out.print(", ");
      } 
      
      multiplo5 += 5;
    }
  }
}
