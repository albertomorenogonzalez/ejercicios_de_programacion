import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801
import java.util.Scanner; //importamos la clase Scanner

/**
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio17AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR BINARIO->DECIMAL");
    System.out.println("---------------------------");
    System.out.println(" ");

    //pedimos el número binario por pantalla
    System.out.println("Introduzca un número binario: ");
    System.out.print("> ");
    long numeroBi = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroBi + " en binario es igual a ");

    int numeroDe = 0; //inicializamos la variable numeroDe donde guardaremos el resultado
    int posicion = 0; //declaramos la variable posicion para usar con la función digitoN

    //creamos un bucle for que no termina hasta que la variable i (que inicializamos en un número menor al número de dígitos del número binario),
    //llegue a 0. Esta variable i la hemos declarado así ya que la usaremos para sumar a numeroDe 2 elevado a i cuando un dígito sea igual a 1.
    //que el dígito sea igual a 1 lo iremos comprobando con la función digitoN. Cuando i es igual a digitos(numeroBi) - 1, la variable posicion 
    //es igual a 0. La variable posición aumenta en 1 en cada iteración. La función dígito N comprueba el dígito de una posición indica. Estas posiciones
    //se cuentan de izquierda a derecha empezando por la posición 0.
    for (int i = (funciones.funcionesTema801.digitos(numeroBi) - 1) ; i >= 0; i--) {
      if ((funciones.funcionesTema801.digitoN(numeroBi, posicion)) == 1) {
        numeroDe = numeroDe + funciones.funcionesTema801.potencia(2, i);
      }

      posicion++;
    }

    System.out.println(numeroDe); //mostramos los resultados
  }
}