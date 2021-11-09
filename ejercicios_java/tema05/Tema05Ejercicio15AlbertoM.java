/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. 
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio15AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE UNA BASE Y UN EXPONENTE Y QUE CALCULE LA POTENCIA");
    System.out.println("--------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la base: ");
    System.out.print("> ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca el exponente (entero positivo): ");
    System.out.print("> ");
    int exponente = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    double resultado = 1;
    
    for (int multiplos = 1; multiplos <= exponente; multiplos++) {
      resultado = (base * resultado);
      
      System.out.print(base + " elevado a " + multiplos + " es igual a ");
      System.out.printf("%.0f\n" ,resultado);
    }
  }
}
