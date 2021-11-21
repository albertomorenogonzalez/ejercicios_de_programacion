/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo
 * o no.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio42AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO INTRODUCIDO Y LOS CINCO SIGUIENTES SON PRIMO");
    System.out.println("----------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int entreNumero= 0;
    
    for (int contador = 0; contador < 5; contador++) {
      if ((numero == 1) || (numero == 2)) {
        System.out.println("El número es primo.");
      } else {
        for (entreNumero = 2; ((entreNumero < numero) && ((numero % entreNumero) != 0)); entreNumero++) { }
    
        if (entreNumero == numero) {
        System.out.println(numero + " es primo.");
        } else {
          System.out.println(numero + " no es primo.");
        }
      }

    numero++;
    }
  }
}
