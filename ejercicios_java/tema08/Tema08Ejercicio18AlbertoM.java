import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801
import java.util.Scanner; //importamos la clase Scanner

/**
 * Escribe un programa que pase de decimal a binario.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio18AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR DECIMAL->BINARIO");
    System.out.println("---------------------------");
    System.out.println(" ");

    //pedimos el número decimal por pantalla
    System.out.println("Introduzca un número decimal: ");
    System.out.print("> ");
    long numeroDe = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroDe + " en decimal es igual a ");

    //definimos primero al número binario como String para añadir al mismo cero y unos sin inconvenientes
    String numeroBi = "";

    //en cada iteración del bucle numeroDe (el número decimal introducido), irá reduciendose a la mitad sucesivamente.
    //el bucle continuará hasta que numeroDe llegue a 0. El resto de la división de numeroDe entre 2 será el valor 
    //añadido a la variable numeroBi. Se le añade por delante ya que el primer dígito del número binario corresponde 
    //a la última división que se realice en el bucle, el segundo dígito con la penúltima división...
    while (numeroDe > 0) {
      String digito = String.valueOf(numeroDe % 2);

      numeroBi = digito + numeroBi;

      numeroDe /= 2;
    }

    //mostramos los resultados
    System.out.println(Long.valueOf(numeroBi));
  }
}