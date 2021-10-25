/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio14AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE SI UN NÚMERO INTRODUCIDO ES PAR Y/O DIVISIBLE ENTRE 5");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int par = (numero / 2);
    
    int entreCinco = (numero / 5);
    
    if ((numero % 2) == 0) {
      if ((numero % 5) == 0) {
        System.out.println("El número es par y divisible entre 5.");
      } else if ((numero % 5 != 0)) {
          System.out.println("El número es par.");
      }
    } else if ((numero % 5) == 0) {
          System.out.println("El número es divisible entre 5.");
    } else {
        System.out.println("El número ni es par ni es divisible entre 5.");
    }
  }
}
