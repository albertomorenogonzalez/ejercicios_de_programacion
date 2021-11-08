/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle for.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio04AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS NUMEROS DEL 320 AL 160 DE 20 EN 20");
    System.out.println("------------------------------------------------------------");
    System.out.println(" ");
  
    for (int numero = 320; numero >= 160; numero -= 20) {
      System.out.print(numero);
      
      if (numero > 160) {
        System.out.print(", ");
      } 
    }
  }
}
