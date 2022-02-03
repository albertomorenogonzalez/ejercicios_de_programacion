import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801 para usar una de sus funciones
import java.util.Scanner; //importamos la clase Scanner

/**
 * Crea una función con la siguiente cabecera:
 * public String convierteEnPalabras(int n)
 * Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213
 * convertido a palabras sería:
 * cuatro, siete, cero, dos, uno, tres
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde
 * la función no se debe mostrar nada por pantalla, solo se debe usar print desde
 * el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
 * final.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio39AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE CONVIERTE LOS DÍGITOS DE UN NÚMERO EN PALABRAS");
    System.out.println("------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.println(convierteEnPalabras(numero));
  }

  /**
   * La función convierte los dígitos del número n en las correspondientes palabras 
   * y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213
   * convertido a palabras sería:
   * cuatro, siete, cero, dos, uno, tres
   *
   * @param n número cuyos dígitos se van a pasar a palabras
   * @return el número con cada uno de los dígitos como su correspondiente número
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String convierteEnPalabras(int n) {
    String numero = ""; //se declara la variable String numero para ir guardando ahí todos los dígitos
    int numeroVolteado = funciones.funcionesTema801.voltea(n); //se voltea el número introducido para empezar a operar sobre él desde la izquierda
    String digitoAPalabras = ""; //se declara la variable String digitoAPalabras donde asignaremos cada nombre de cada dígito
    int digito = 0; //inicializamos la variable dígito
    int numDigitos = 0; //inicializamos la variable numDígito para usarla para poner las comas entre palabras

    //en cada iteración numeroVolteado se dividirá entre 10, hasta llegar a 0. El resto de cada división corresponde a un dígito.
    //según el dígito que sea digitoAPalabras obtendrá el valor de su nombre en letras. Seguidamente se asignará a numero por la derecha.
    while (numeroVolteado > 0) {
      digito = numeroVolteado % 10;

      switch (digito) {
        case 0:
          digitoAPalabras = "cero";
          break;
        case 1:
          digitoAPalabras = "uno";
          break;
        case 2:
          digitoAPalabras = "dos";
          break;
        case 3:
          digitoAPalabras = "tres";
          break;
        case 4:
          digitoAPalabras = "cuatro";
          break;
        case 5:
          digitoAPalabras = "cinco";
          break;
        case 6:
          digitoAPalabras = "seis";
          break;
        case 7:
          digitoAPalabras = "siete";
          break;
        case 8:
          digitoAPalabras = "ocho";
          break;
        case 9:
          digitoAPalabras = "nueve";
          break;
        default:

      } //switch (digito)

      numero = numero + digitoAPalabras;

      //después de que digitoAPalabras se añada a numero, si numDigitos (que aumenta en cada iteración) es menor que el número de dígitos
      //del número introducido se añadirá una coma después de digitoAPalabras. Debido a esta codicón, depués del último dígito no irá una coma
      if (numDigitos < funciones.funcionesTema801.digitos(n) - 1) {
        numero = numero + ", ";
      }

      numeroVolteado /= 10;
      numDigitos++;
    } //while (numeroVolteado > 0)

    return numero;
  } //public String convierteEnPalabras(int n)
}