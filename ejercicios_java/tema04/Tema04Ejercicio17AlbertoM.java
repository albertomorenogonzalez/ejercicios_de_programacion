/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio17AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE CUAL ES LA ULTIMA CIFRA DEL NÚMERO ENTERO QUE SE INTRODUZCA");
    System.out.println("------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int ultimaCifra = (numero % 10);
    
    if ((numero < 10) && (numero > -10)) {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        System.out.printf("La última cifra del número introducido es %d." ,Math.abs(ultimaCifra));
    }
  }
}
