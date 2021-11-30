/**
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio24AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE AL AZAR UN DÍGITO DE UN NÚMERO INTRODUCIDO");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");

    int contadorCifras = 0;
    long calculoCifras = numero;

    while (calculoCifras > 0) {
      calculoCifras /= 10;
      contadorCifras++;
    }

    int posicionDigito = ((int)(Math.random() * contadorCifras) + 1);

    System.out.println(numero / (long)(Math.pow(10, (contadorCifras - posicionDigito))) % 10);
  }
} 