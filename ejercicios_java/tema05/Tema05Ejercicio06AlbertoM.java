/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle do-while.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio06AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS NUMEROS DEL 320 AL 160 DE 20 EN 20");
    System.out.println("------------------------------------------------------------");
    System.out.println(" ");
    
    int numero = 320;
  
    do {
      System.out.print(numero);
      
      if (numero > 160) {
        System.out.print(", ");
      } 
      
      numero -= 20;
    } while (numero >= 160);
  }
}
