import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801 para usar una de sus funciones
import java.util.Scanner; //importamos la clase Scanner

/**
 * Crea una función con la siguiente cabecera:
 * public String convierteEnMorse(int n)
 * Esta función convierte el número n al sistema Morse y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
 * Morse. Utiliza esta función en un programa para comprobar que funciona bien.
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
 * desde el programa principal.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio37AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("COVERSOR DECIMAL->MORSE");
    System.out.println("------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println(numero + "en  morse es " + convierteEnMorse(numero));
  }

  /**
   * La función convierte el número n al sistema Morse y 
   * lo devuelve en una cadena de caracteres.
   *
   * @param n número que se quiere convertir a morse
   * @return número introducido en morse
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String convierteEnMorse(int n) {
    String numeroMorse = ""; //se declara la variable String numeroMorse para guardar ahí la cadena de caracteres resultante
    String digitoMorse = ""; //declaramos también la variable String digitoMorse para asignar a cada dígito su valor en morse, luego se une a numeroMorse
    int numeroVolteado = funciones.funcionesTema801.voltea(n); //se voltea el número introducido para empezar a operar sobre él desde la izquierda
    int digito = 0; //inicializamos la variable dígito

    //numeroVolteado se irá dividiendo entre diez en cada iteración hasta que llegue a cero. El resto de cada división corresponde a un dígito del número introducido.
    //cada dígito corresponde a un valor en morse que se guarda en digitoMorse para posteriormente añadirselo (por la derecha) a numeroMorse,
    //así hasta hacerlo con todos los dígitos del número.
    while (numeroVolteado > 0) {
      digito = numeroVolteado % 10;

      switch (digito) {
        case 0:
          digitoMorse = "-----";
          break;
        case 1:
          digitoMorse = "·----";
          break;
        case 2:
          digitoMorse = "··---";
          break;
        case 3:
          digitoMorse = "···--";
          break;
        case 4:
          digitoMorse = "····-";
          break;
        case 5:
          digitoMorse = "·····";
          break;
        case 6:
          digitoMorse = "-····";
          break;
        case 7:
          digitoMorse = "--···";
          break;
        case 8:
          digitoMorse = "-····";
          break;
        case 9:
          digitoMorse = "·····";
          break;
        default:

      } //switch (digito)

      numeroMorse = numeroMorse + digitoMorse;

      numeroVolteado /= 10;
    } //while (numeroVolteado > 0)
    
    return numeroMorse;
  } //public String convierteEnMorse(int n)
}