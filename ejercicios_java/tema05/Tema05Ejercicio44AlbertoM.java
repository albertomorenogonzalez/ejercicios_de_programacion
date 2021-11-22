/**
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio44AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE INSERTA UN DÍGITO DENTRO DE UN NÚMERO");
    System.out.println("---------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca la posición donde quiere insertar el número: ");
    System.out.print("> ");
    long longitud = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca el dígito que quiere insertar: ");
    System.out.print("> ");
    long digito = Long.parseLong(System.console().readLine());
    System.out.println(" ");

    long darLaVuelta = 0;
    
    numero = ((numero * 10) + 1);

    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + (numero % 10));
      
      numero /= 10;
    }

    System.out.print("El número resultante es ");

    while (longitud > 1) {
      System.out.print(darLaVuelta % 10);

      darLaVuelta /= 10;
      longitud--;
    }

    System.out.print(digito);

    if (longitud == 1) {
      while (darLaVuelta > 1) {
        System.out.print(darLaVuelta % 10);
  
        darLaVuelta /= 10;
      }
    }
  }
} 
