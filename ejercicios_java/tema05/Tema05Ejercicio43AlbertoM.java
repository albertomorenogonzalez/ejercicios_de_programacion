/**
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio43AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DIVIDE UN NÚMERO EN DOS PARTES");
    System.out.println("--------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca la posición a partir de la cual quiere partir el número: ");
    System.out.print("> ");
    long longitud = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    long darLaVuelta = 0;
    
    numero = ((numero * 10) + 1);
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + (numero % 10));
      
      numero /= 10;
    }
    
    long numero1 = 0;
    long numero2 = 0;

    while (darLaVuelta > 0) {
      while (longitud > 0) {
        numero1 = (numero1 + (darLaVuelta % 10) * 10);
        System.out.println(numero1);
        longitud--;
      }

      if (longitud == 0) {
        numero2 = (numero2 + (darLaVuelta % 10) * 10);
        System.out.println(numero2);
      }

      darLaVuelta /= 10;
    }

    System.out.println(numero1);
    System.out.println(numero2);
  }
} 
