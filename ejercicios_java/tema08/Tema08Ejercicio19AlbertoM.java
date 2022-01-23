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
    System.out.print("> ");
    int tipoConversion = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    System.out.print("Introduzca un número");

    switch (tipoConversion) {
      case 1:
        System.out.println(" decimal:");
        System.out.print("> ");
        long numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número decimal " + numero + " es igual a " + decimalABinario(numero) + " en el sistema binario");
        break;
      case 2:
        System.out.println(" decimal:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número decimal " + numero + " es igual a " + decimalAOctal(numero) + " en el sistema octal");
        break; 
      case 3:
        System.out.println(" decimal:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número decimal " + numero + " es igual a " + decimalAHexadecimal(numero) + " en el sistema hexadecimal");
        break; 
      case 4:
        System.out.println(" binario:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número binario " + numero + " es igual a " + binarioADecimal(numero) + " en el sistema decimal");
        break; 
      case 5:
        System.out.println(" binario:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número binario " + numero + " es igual a " + binarioAOctal(numero) + " en el sistema octal");
        break; 
      case 6:
        System.out.println(" binario:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número binario " + numero + " es igual a " + binarioAHexadecimal(numero) + " en el sistema hexadecimal");
        break; 
      case 7:
        System.out.println(" octal:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número octal " + numero + " es igual a " + octalADecimal(numero) + " en el sistema decimal");
        break; 
      case 8:
        System.out.println(" octal:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número octal " + numero + " es igual a " + octalABinario(numero) + " en el sistema binario");
        break; 
      case 9:
        System.out.println(" octal:");
        System.out.print("> ");
        numero = Long.parseLong(s.nextLine());
        System.out.println(" ");

        System.out.println("El número octal " + numero + " es igual a " + octalAHexadecimal(numero) + " en el sistema hexadecimal");
        break;
      case 10:
        System.out.println(" hexadecimal:");
        System.out.print("> ");
        String numeroHex = s.nextLine();
        System.out.println(" ");

        System.out.println("El número hexadecimal " + numeroHex + " es igual a " + hexadecimalADecimal(numeroHex) + " en el sistema decimal");
        break;
      case 11:
        System.out.println(" hexadecimal:");
        System.out.print("> ");
        numeroHex = s.nextLine();
        System.out.println(" ");

        System.out.println("El número hexadecimal " + numeroHex + " es igual a " + hexadecimalABinario(numeroHex) + " en el sistema binario");
        break;
      case 12:
        System.out.println(" hexadecimal:");
        System.out.print("> ");
        numeroHex = s.nextLine();
        System.out.println(" ");

        System.out.println("El número hexadecimal " + numeroHex + " es igual a " + hexadecimalAOctal(numeroHex) + " en el sistema octal");
        break;
      default:
        System.out.println("Debió introducir el número de forma incorrecta. Por favor, reinicie el programa");
    }
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
   * La función pasa un número de binario a octal
   *
   * @param numeroBi número binario 
   * @return número octal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long binarioAOctal(long numeroBi) {
    String numeroOc = "";

    while (numeroBi > 0) {
      String digitoNumeroOc = String.valueOf(binarioADecimal(numeroBi % 1000));

      numeroOc = digitoNumeroOc + numeroOc;

      numeroBi /= 1000;
    } //while (numeroBi > 0)

    return Long.valueOf(numeroOc);
  } //public static long binarioAOctal(long numero)


  /**
   * La función pasa un número de binario a hexadecimal
   *
   * @param numeroBi número binario 
   * @return número octal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String binarioAHexadecimal(long numeroBi) {
    String numeroHex = "";

    while (numeroBi > 0) {
      String digitoNumeroHex = String.valueOf(binarioADecimal(numeroBi % 10000));

      switch (digitoNumeroHex) {
        case "10":
          digitoNumeroHex = "A";
          break;
        case "11":
          digitoNumeroHex = "B";
          break;
        case "12":
          digitoNumeroHex = "C";
          break;
        case "13":
          digitoNumeroHex = "D";
          break;
        case "14":
          digitoNumeroHex = "E";
          break;
        case "15":
          digitoNumeroHex = "F";
          break;
        default:

      } //switch (digitoNumeroHex)

      numeroHex = digitoNumeroHex + numeroHex;

      numeroBi /= 10000;
    } //while (numeroBi > 0)

    return numeroHex;
  } //public static String binarioAHexadecimal(long numeroBi)


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

    return binarioAOctal(numeroBi);
  } //public static long DecimalAOctal(long numeroDe)


  /**
   * La función pasa un número de decimal a hexadecimal
   *
   * @param numeroDe número decimal 
   * @return número hexadecimal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String decimalAHexadecimal(long numeroDe) {
    long numeroBi = decimalABinario(numeroDe);

    return binarioAHexadecimal(numeroBi);
  } //public static long DecimalAHexadecimal(long numeroDe)


  /**
   * La función pasa un número de octal a binario
   *
   * @param numeroOc número octal 
   * @return número binario
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long octalABinario(long numeroOc) {
    if (numeroOc == 0) {
      return 0;
    } else {
      String numeroBi = "";

      while (numeroOc > 0) {
        String digitoABi = String.valueOf(decimalABinario(numeroOc % 10));

        if (funciones.funcionesTema801.digitos(Long.valueOf(digitoABi)) == 1) {
          digitoABi = "00" + digitoABi;
        } else if (funciones.funcionesTema801.digitos(Long.valueOf(digitoABi)) == 2) {
          digitoABi = "0" + digitoABi;
        } //if (funciones.funcionesTema801.digitos(Long.valueOf(digitoABi)) == 1)

        numeroBi = numeroBi + digitoABi;

        numeroOc /= 10;
      } //while (numeroOc > 0)

      return Long.valueOf(numeroBi);
    } //if (numeroOc == 0)
  } //public static long octalABinario(long numeroOc)


  /**
   * La función pasa un número de octal a decimal
   *
   * @param numeroOc número octal 
   * @return número decimal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long octalADecimal(long numeroOc) {
    long numeroBi = octalABinario(numeroOc);

    return binarioADecimal(numeroBi);
  } //public static long octalADecimal(long numeroOc)


  /**
   * La función pasa un número de octal a hexadecimal
   *
   * @param numeroOc número octal 
   * @return número hexadecimal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String octalAHexadecimal(long numeroOc) {
    long numeroBi = octalABinario(numeroOc);

    return binarioAHexadecimal(numeroBi);
  } //public static String octalAHexadecimal(long numeroOc)


  /**
   * La función pasa un número de hexadecimal a binario
   *
   * @param numeroHex número hexadecimal 
   * @return número binario
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long hexadecimalABinario(String numeroHex) {
    if (numeroHex.equals("0")) {
      return 0;
    } else {
      String numeroBi = "";
      String digitoABi = "";

      for (int i = 0; i < numeroHex.length(); i++) {
        switch(numeroHex.charAt(i)) {
          case 'A':
            digitoABi = "10";
            break;
          case 'B':
            digitoABi = "11";
            break;
          case 'C':
            digitoABi = "12";
            break;
          case 'D':
            digitoABi = "13";
            break;
          case 'E':
            digitoABi = "14";
            break;
          case 'F':
            digitoABi = "15";
            break;
          default:
            digitoABi = String.valueOf(numeroHex.charAt(i)); 
        } //switch(numeroHex.charAt(i))

        String digitoBi = String.valueOf(decimalABinario(Long.valueOf(digitoABi)));

        if (funciones.funcionesTema801.digitos(Long.valueOf(digitoBi)) == 1) {
          digitoBi = "000" + digitoBi;
        } else if (funciones.funcionesTema801.digitos(Long.valueOf(digitoBi)) == 2) {
          digitoBi = "00" + digitoBi;
        } else if (funciones.funcionesTema801.digitos(Long.valueOf(digitoBi)) == 3) {
          digitoBi = "0" + digitoBi;
        } //if (funciones.funcionesTema801.digitos(Long.valueOf(digitoBi)) == 1)

        numeroBi = numeroBi + digitoBi;
      } //for (int i = 0; i < numeroHex.length(); i++)

      return Long.valueOf(numeroBi);
    } //if (numeroHex.equals("0"))
  } //public static long hexadecimalABinario(String numeroHex)


  /**
   * La función pasa un número de hexadecimal a decimal
   *
   * @param numeroHex número hexadecimal 
   * @return número decimal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long hexadecimalADecimal(String numeroHex) {
    long numeroBi = hexadecimalABinario(numeroHex);

    return binarioADecimal(numeroBi);
  } //public static long hexadecimalADecimal(String numeroHex)


  /**
   * La función pasa un número de hexadecimal a octal
   *
   * @param numeroHex número hexadecimal 
   * @return número octal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long hexadecimalAOctal(String numeroHex) {
    long numeroBi = hexadecimalABinario(numeroHex);

    return binarioAOctal(numeroBi);
  } //public static long hexadecimalAOctal(String numeroHex)
}