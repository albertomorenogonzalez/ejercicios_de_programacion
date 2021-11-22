/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio06AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIENSA EN UN NÚMERO Y TIENES QUE ADIVINARLO");
    System.out.println("---------------------------------------------------------");
    System.out.println(" ");
    
    int numeroMaquina = ((int)(Math.random() * 101));

    int intento = 0;
    
    while (intento < 5) {
      System.out.println("Introduzca un número (del 1 al 100): ");
      System.out.print("> ");
      int numeroUsuario = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      
      if (numeroUsuario == numeroMaquina) {
        System.out.println("Ha adivinado el número. ¡Enhorabuena!");
        break;
      } else {
          System.out.println("Fallaste.");
          intento++;
          
          if (intento != 5) {
            System.out.println("Te quedan " + (5 - intento) + " intentos.");
            
            if (numeroMaquina < numeroUsuario) {
              System.out.println("El número es menor.");
            } else if (numeroMaquina > numeroUsuario) {
              System.out.println("El número es mayor.");
            }
          }
          
          System.out.println(" ");
          System.out.println(" ");
      }
      
      if (intento == 5) {
        System.out.println("Te has quedado sin intentos.");
      }
    }
  }
}


