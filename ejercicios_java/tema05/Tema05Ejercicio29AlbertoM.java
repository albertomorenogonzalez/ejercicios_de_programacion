/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio29AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA POR PANTALLA TODOS LOS NÚMEROS ENTEROS POSITIVOS MENORES A UN NÚMERO INTRODUCIDO POR TECLADO QUE NO SEAN DIVISIBLES ENTRE OTRO INTRODUCIDO POR TECLADO");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca otro número entero positivo, por favor: ");
    System.out.print("> ");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    numero1 = (numero1 - 1);
    
    while (numero1 > 0) {
      int divisible = (numero1 % numero2);
      
      if (divisible != 0) {
        System.out.print(numero1 + " ");
      }
      
      numero1--;
    }
  }
} 
