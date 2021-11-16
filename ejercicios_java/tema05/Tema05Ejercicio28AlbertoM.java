/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio28AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL FACTORIAL DE UN NÚMERO INTRODUCIDO");
    System.out.println("-----------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int resultado = 1;
    
    for (int contadorMultiplos = 1; contadorMultiplos <= numero; contadorMultiplos ++) { 
      resultado = (resultado * contadorMultiplos);
    }
    
    System.out.println("El factorial del número introducido es " + resultado);
  }
} 
