/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio27AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE MUESTRA LOS MÚLTIPLOS DE 3 ENTRE 1 Y UN NÚMERO INTRODUCIDO");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int entreNumero = 0;
    
    System.out.print("1 ");
      
    for (entreNumero = 2; ((entreNumero < numero) && ((entreNumero % 3) == 0)); entreNumero++) { 
      System.out.print(entreNumero + " ");
    }
    
    System.out.print(numero + " ");
  }
} 
