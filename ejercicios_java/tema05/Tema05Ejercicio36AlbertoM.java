/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio36AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO ES O NO CAPICÚA");
    System.out.println("-----------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    long numeroInicial = numero;
    
    int darLaVuelta = 0;
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + ((int)numero % 10));
      
      numero /= 10;
    }
    
    if (numeroInicial == darLaVuelta) {
      System.out.print("El número introducido es capicúa.");
    } else {
      System.out.print("El número introducido no es capicúa.");
    }
  }
}
