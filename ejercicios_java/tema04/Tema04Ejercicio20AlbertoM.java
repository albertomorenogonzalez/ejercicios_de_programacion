/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio20AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI EL NUMERO ENTERO POSTIVO INTRODUCIDO ES CAPICUA");
    System.out.println("---------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int restoParCifras = (numero % 11);
    
    if ((numero >= 0) && (numero < 10))  {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if ((numero < 100) || (numero < 10000)) {
          if (restoParCifras == 0) {
            System.out.print("El número introducido es capicúa.");
          } else {
              System.out.print("El número introducido no es capicúa.");
          }
        }
    }
  }
}
