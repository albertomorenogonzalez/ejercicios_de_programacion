/**
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio48AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE LOS DÍGITOS QUE APARECEN Y QUE NO EN UN NÚMERO INTRODUCIDO");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    long numeroRestaurado = 0;

    for (int digitosQueAparecen = 0; digitosQueAparecen < 10; digitosQueAparecen++) {
      numeroRestaurado = numero;

      while (numeroRestaurado > 0) {
        if ((numeroRestaurado % 10) == digitosQueAparecen) {
          System.out.print(digitosQueAparecen + " ");
        }

        numeroRestaurado /= 10;
      }
      
      
    }
  }
} 