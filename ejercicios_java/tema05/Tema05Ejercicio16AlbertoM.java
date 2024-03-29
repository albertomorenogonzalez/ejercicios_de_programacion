/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio16AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO INTRODUCIDO ES PRIMO");
    System.out.println("----------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int entreNumero= 0;
    
    if ((numero == 1) || (numero == 2)) {
      System.out.println("El número es primo.");
    } else {
      for (entreNumero = 2; ((entreNumero < numero) && ((numero % entreNumero) != 0)); entreNumero++) { }
     
      if (entreNumero == numero) {
        System.out.println("El número es primo.");
      } else {
        System.out.println("El número no es primo.");
      }
    }
  }
}
