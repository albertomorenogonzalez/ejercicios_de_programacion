/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio18AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE OBTIENE LOS NUMEROS ENTEROS COMPRENDIDOS ENTRE DOS NUMEROS ENTEROS INTRODUCIDOS POR TECLADO");
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    int numero1 = 0;
    
    int numero2 = 0;
    
    System.out.println("Por favor, introduzca un número entero: ");
    
    while (numero1 == numero2) {
      if (numero1 != numero2) {
        System.out.println("Por favor, introduzca un número entero: ");
      } else {
          System.out.println("Por favor, introduzca otro número entero distinto: ");
      }
      System.out.print("> ");
      numero1 = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      
      System.out.println("Por favor, introduzca otro número entero distinto: ");
      System.out.print("> ");
      numero2 = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      
      if (numero1 > numero2) {
        while (numero2 < numero1) {
          System.out.print(numero2 + " ");
          
          numero2+=7;
        }
        
        System.out.print(numero1);
      } else if (numero2 > numero1) {
          while (numero1 < numero2) {
            System.out.print(numero1 + " ");
          
            numero1+=7;
          }
        
        System.out.print(numero2);
      }
    }
  }
}
