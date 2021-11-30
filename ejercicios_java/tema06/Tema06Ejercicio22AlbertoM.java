/**
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio22AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE POR PANTALLA UNA SERPIENTE DE SERPENTEO ALEATORIO");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza:");
    System.out.print("> ");
    int longitud = Integer.parseInt(System.console().readLine());
    System.out.println(" ");


    for (int numEspaciosCabeza = 1; numEspaciosCabeza <= 12; numEspaciosCabeza++) {
      System.out.print(" "); 
    }
    
    System.out.println("@");

    int linea = 1;

    while (linea < longitud) {
      int numEspacios = ((int)(Math.random() * 3) + 11);

      for (int espaciosCuerpo = 1; espaciosCuerpo <= numEspacios; espaciosCuerpo++) {
        System.out.print(" "); 
      }

      System.out.println("*");

      linea++;
    }
  }
}    