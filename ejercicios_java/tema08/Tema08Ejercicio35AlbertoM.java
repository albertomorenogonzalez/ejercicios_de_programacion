import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801 para usar una de sus funciones
import java.util.Scanner; //importamos la clase Scanner

/**
 * Crea una función con la siguiente cabecera:
 * public static String convierteEnPalotes(int n)
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
 * | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
 * para comprobar que funciona bien. Desde la función no se debe mostrar nada
 * por pantalla, solo se debe usar print desde el programa principal.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio35AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR DECIMAL->PALOTES");
    System.out.println("---------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println(numero + "en el sistema de palotes es " + convierteEnPalotes(numero));
  }

  /**
   * La función pasa un número del sistema decimal
   * al sistema de palotes
   *
   * @param n numero decimal que se quiere convertir a palotes
   * @return número introducido en el sistema de palotes
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String convierteEnPalotes(int n) {
    String numeroPalotes = ""; //se declara la variable String numeroPalotes para guardar ahí la cadena de caracteres resultante
    int numeroVolteado = funciones.funcionesTema801.voltea(n); //se voltea el número introducido para empezar a operar sobre él desde la izquierda
    int digito = 0; //inicializamos la variable dígito

    //el número volteado se irá dividiendo entre 10 en cada iteración, hasta llegar a 0. El resto de cada división se guarda en la variable dígito.
    //un bucle anidado irá añadiendo palotes a numeroPalotes hasta que el índice i sea igual al valor de la variable dígito.
    //cuando todos los palotes correspondientes a un número se han añadido a numeroPalotes se le añade también hasta función un guión para 
    //separar los dígitos.
    while (numeroVolteado > 0) {
      digito = (numeroVolteado % 10);
      
      for (int i = 0; i < digito; i++) {
        numeroPalotes = numeroPalotes + "|";
      }
      
      if (numeroVolteado > 10) {
        numeroPalotes = numeroPalotes + "-";
      }
      
      numeroVolteado /= 10;
    } //while (numeroVolteado > 0)

    return numeroPalotes;
  } //public static String convierteEnPalotes(int n)
}