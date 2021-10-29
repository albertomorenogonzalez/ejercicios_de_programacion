/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio19AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE CUANTAS CIFRAS TIENE EL NÚMERO ENTERO QUE SE INTRODUZCA");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    if ((numero < 10) && (numero > -10)) {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if ((numero < 100) && (numero > -100)) {
          System.out.println("El número introducido tiene dos cifras.");
        } else if ((numero < 1000) && (numero > -1000)) {
            System.out.println("El número introducido tiene tres cifras.");
        } else if ((numero < 10000) && (numero > -10000)) {
            System.out.println("El número introducido tiene cuatro cifras.");
        } else if ((numero < 100000) && (numero > -100000)) {
            System.out.println("El número introducido tiene cinco cifras.");
        } else {
            if ((numero >= 100000) || (numero <= 100000)) {
            System.out.println("El número introducido es demasiado grande.");
            }
        }
    }
  }
}
