import java.util.Scanner;

/**
 * Crea la función linea para pintar lineas de caracteres que tienen un determinado carácter en los
 * extremos y otro carácter de relleno.
 *
 * Utiliza esta función para pintar una pirámide hueca cuya altura se pide por teclado. Podemos suponer
 * que el usuario va a introducir un número mayor o igual a 1.
 * 
 * @author Alberto Moreno Gonzalez
 */
public class EjercicioAmpliacion1 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("PROGRAMA QUE PINTA UNA PIRÁMIDE HUECA");
    System.out.println("--------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la altura de la pirámide, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    //después de pedir la altura por pantalla, se definen la longitud de la primera línea de caracteres, 
    //el carácter de los extremos de la línea, los espacios vacíos del interior de la pirámide 
    //(relleno de la línea) y el número de espacios previos al primer carácter de la priera línea que
    //escalona a pirámide
    int longitud = 1;
    char extremo = '*';
    char relleno = ' ';
    int numEspacios = altura - 1;

    //el bucle pintará líneas hasta que el número de líneas sea igual a la altura
    for (int i = 0; i < altura; i++) {
      if (i == altura - 1) { //en la última línea todos los caracteres serán los del extremo de la línea
        relleno = '*';
      }

      System.out.print(espacios(numEspacios)); //pintamos los espacios previos
      System.out.println(linea(longitud, extremo, relleno)); //pintamos la línea

      longitud+=2; //una línea será dos caracteres más larga que la anterior
      numEspacios--; //en cada línea hay un espacio previo menos que en la anterior
    }
  }


  /**
   * La función pinta lineas de caracteres que tienen un determinado carácter en los
   * extremos y otro carácter de relleno.
   *
   * @param longitud longitud de la línea
   * @param extremo carácter de los extremos
   * @param relleno carácter de relleno
   * @return línea de caracteres
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String linea(int longitud, char extremo, char relleno) {
    //longitud es el número de caracteres de la línea
    //cuando el bucle se encuentre entre la primera iteración o en la última el caracter pintado
    //será el del extremo, el resto de veces será el del relleno
    for (int i = 1; i <= longitud; i++) {
      if ((i == 1) || (i == longitud)) {
        System.out.print(extremo);
      } else {
        System.out.print(relleno);
      }
    }

    return "";
  } //public static String linea(int longitud, char extremo, char relleno)


  /**
   * Función auxiliar para incluir los espacios previos al piso de una pirámide 
   *
   * @param numEspacios número de espacios necesarios
   * @return espacios previos al piso de una pirámide
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String espacios(int numEspacios) {
    //definido un número de espacios, la función pintará una línea de espacios de esa longitud
    for (int i = 1; i <= numEspacios; i++) {
      System.out.print(" ");
    }

    return "";
  } //public static String espacios(int altura)
}