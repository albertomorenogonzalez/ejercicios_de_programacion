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

    //con este switch se buscará la conversión indicada anteriormente para realizarla y mostrar el resultado.
    //para pasar de hexadecimal a otro sistema el valor que se pide por pantalla es un string ya que el 
    //sistema hexadecimal maneja letras de la A a la F
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
        String numeroHex = s.nextLine().toUpperCase();
        System.out.println(" ");

        System.out.println("El número hexadecimal " + numeroHex + " es igual a " + hexadecimalADecimal(numeroHex) + " en el sistema decimal");
        break;
      case 11:
        System.out.println(" hexadecimal:");
        System.out.print("> ");
        numeroHex = s.nextLine().toUpperCase();
        System.out.println(" ");

        System.out.println("El número hexadecimal " + numeroHex + " es igual a " + hexadecimalABinario(numeroHex) + " en el sistema binario");
        break;
      case 12:
        System.out.println(" hexadecimal:");
        System.out.print("> ");
        numeroHex = s.nextLine().toUpperCase();
        System.out.println(" ");

        System.out.println("El número hexadecimal " + numeroHex + " es igual a " + hexadecimalAOctal(numeroHex) + " en el sistema octal");
        break;
      default:
        System.out.println("Debió introducir el número de forma incorrecta. Por favor, reinicie el programa");
    }
  }

  //////// FUNCIONES ////////


  /**
   * La función pasa un número de binario a decimal
   *
   * @param numeroBi número binario 
   * @return número decimal
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long binarioADecimal(long numeroBi) {
    long numeroDe = 0; //inicializamos la variable numeroDe donde guardaremos el resultado
    int posicion = 0; //variable que utilizaremos para indicar la psición del dígito binario (empezando por la derecha) y para usarla de exponente

    //creamos un bucle while en el que numeroBi será dividido entre 10 en cada iteración hasta llegar a 0. El resto de cada división corresponde a un dígito
    //binario, empezando por la derecha. La variable posicion indica la posición de ese número de derecha a izquierda (aumenta en 1 en cada iteración). 
    //Una vez obtenido el dígito se multiplica por dos elevado a posicion y se le suma a lo que ya hay en numeroDe. Si digitoBi es 0 no se le sumará nada
    //a numeroDe, por contra, si es 1, se le sumará la potencia de 2 correspondiente a la posición.
    while (numeroBi > 0) {
      long digitoBi = numeroBi % 10;
      numeroDe = numeroDe + funciones.funcionesTema801.potencia(2, posicion) * digitoBi;

      posicion++;
      numeroBi /= 10;
    } //while (numeroBi > 0)

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
    String numeroOc = ""; //se define el número octal como un string vacío

    //cada dígito del número octal se calcula sacando el resto de la división entre el número binario (numeroBi) y 1000
    //esto se hace así porque cada dígito del número octal corresponde a tres dígitos del número binario comenzando 
    //a agruparlos desde la derecha. Ese trozo de tres dígitos que hemos calculado se pasa a decimal y pasado a String 
    //se le añade por la izquierda a numeroOc. En cada iteración numeroBi se divide entre 1000 y el bucle seguirá hasta
    //que numeroBi llegue a cero.
    while (numeroBi > 0) { 
      String digitoNumeroOc = String.valueOf(binarioADecimal(numeroBi % 1000));

      numeroOc = digitoNumeroOc + numeroOc;

      numeroBi /= 1000;
    } //while (numeroBi > 0)

    //se devuelve el string numeroOc como una variable long
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
    String numeroHex = ""; //se define el número hexadecimal como un string vacío

    //cada dígito del número hexadecimal se calcula sacando el resto de la división entre el número binario (numeroBi) y 10000
    //esto se hace así porque cada dígito del número hexadecimal corresponde a cuatro dígitos del número binario comenzando 
    //a agruparlos desde la derecha. Ese trozo de cuatro dígitos que hemos calculado se pasa a decimal y pasado a String 
    //se le añade por la izquierda a numeroHex. En cada iteración numeroBi se divide entre 10000 y el bucle seguirá hasta
    //que numeroBi llegue a cero.
    while (numeroBi > 0) {
      String digitoNumeroHex = String.valueOf(binarioADecimal(numeroBi % 10000));

      //en el sistema hexadecimal los números del 10 al 15 corresponden a las letras de la A a la F respectivamente
      //con este switch se designa esa conversión en caso de que digitoNumeroHex sea igual a uno de esos números
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
    String numeroBi = ""; //se define el número binario como un string vacío

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
    long numeroBi = decimalABinario(numeroDe); //el número decimal introducido se pasa a binario

    return binarioAOctal(numeroBi); //ese número binario se pasa a octal y la función lo devuelve
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
    long numeroBi = decimalABinario(numeroDe); //el número decimal introducido se pasar a binario

    return binarioAHexadecimal(numeroBi); //ese número se pasa a octal y la función lo devuelve
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
    //si numeroOc (el número octal) es 0, no entrará al bucle while (numeroOc > 0) (hablaremos  de él a continuación), 
    //por lo que hay que poner la condición de que si numeroOc es 0 la función devuelva un 0
    if (numeroOc == 0) {
      return 0;
    } else {
      String numeroBi = ""; //se define el número binario como un string vacío

      //
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