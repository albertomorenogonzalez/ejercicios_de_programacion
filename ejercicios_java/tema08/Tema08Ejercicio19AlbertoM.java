import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801
import java.util.Scanner; //importamos la clase Scanner

/**
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio19AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CALCULADORA DE PROGRAMADOR");
    System.out.println("---------------------------");
    System.out.println(" ");

    System.out.println("Elija la conversión que quiere realizar:");
    System.out.println("1 - Decimal a Binario");
    System.out.println("2 - Decimal a Octal");
    System.out.println("3 - Decimal a Hexadecimal");
    System.out.println("4 - Binario a Decimal");
    System.out.println("5 - Binario a Octal");
    System.out.println("6 - Binario a Hexadecimal");
    System.out.println("7 - Octal a Decimal");
    System.out.println("8 - Octal a Binario");
    System.out.println("9 - Octal a Hexadecimal");
    System.out.println("10 - Hexadecimal a Decimal");
    System.out.println("11 - Hexadecimal a Binario");
    System.out.println("12 - Hexadecimal a Octal");

    System.out.println(" ");

    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    long numero = Long.parseLong(s.nextLine());
    System.out.println(" ");

    
  }


  /**
   * La función pasa un número de binario a decimal
   *
   * @param numeroBi número binario 
   * @return número decimal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long binarioADecimal(long numeroBi) {
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
    } //for (int i = (funciones.funcionesTema801.digitos(numeroBi) - 1) ; i >= 0; i--)

    return numeroDe;
  } //public static long binarioADecimal(long numero)


  /**
   * La función pasa un número de decimal a binario
   *
   * @param numeroDe número decimal 
   * @return número binario
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long decimalABinario(long numeroDe) {
    String numeroBi = "";

    //en cada iteración del bucle numeroDe (el número decimal introducido), irá reduciendose a la mitad sucesivamente.
    //el bucle continuará hasta que numeroDe llegue a 0. El resto de la división de numeroDe entre 2 será el valor 
    //añadido a la variable numeroBi. Se le añade por delante ya que el primer dígito del número binario corresponde 
    //a la última división que se realice en el bucle, el segundo dígito con la penúltima división...
    while (numeroDe > 0) {
      String digito = String.valueOf(numeroDe % 2);

      numeroBi = digito + numeroBi;

      numeroDe /= 2;
    } //while (numeroDe > 0)

    return Long.valueOf(numeroBi);
  } //public static long decimalABinario(long numeroDe)


  /**
   * La función pasa un número de decimal a octal
   *
   * @param numeroDe número decimal 
   * @return número octal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long decimalAOctal(long numeroDe) {
    long numeroBi = decimalABinario(numeroDe);
    String numeroOc = "";

    for (int i = 0; i < funciones.funcionesTema801.digitos(numeroBi); i++) {
      for (int j = 0; j < 3; j++) {
        numeroOc = numeroOc + binarioADecimal(numeroBi);
      }
    }

    return ;
  } //public static long DecimalAOctal(long numeroDe)
}