/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio09AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA NÚMEROS DEL 0 AL 100 HASTA QUE SALGA EL 24");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    
    int numero = 0;
    int contador = 0;

    while (numero != 24) {
      numero = ((int)(Math.random() * 101));
      
      System.out.print(numero + " ");

      contador++;
    }

    System.out.println(" ");
    System.out.println(" ");
    
    System.out.println("Se han generado " + contador +  " números.");
  }
}


