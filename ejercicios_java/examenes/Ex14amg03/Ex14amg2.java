import java.util.Scanner;

/**
 * A) Crea la función linea para pintar lineas de caracteres que tienen un determinado carácter en los
 * extremos y otro carácter de relleno. Prueba esta función en un programa con, al menos, los ejemplos
 * que se proporcionan a continuación.
 *
 * B) Utiliza esta función para pintar una pirámide hueca cuya altura se pide por teclado. Podemos
 * suponer que el usuario va a introducir un número mayor o igual a 1.
 * 
 * @author Alberto Moreno Gonzalez
 * 
 * Fecha: 15 - 2 - 2022
 */
public class Ex14amg2 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    /* APARTADO A */ 

    System.out.println("Apartado A:");
    System.out.println("Comprobamos que la función linea funciona:\n");

    System.out.println(linea(5, '*', ' '));
    System.out.println(linea(5, '*', '*'));
    System.out.println(linea(6, 'X', '-'));
    System.out.println(linea(3, '&', '$'));
    System.out.println(linea(2, '&', '$'));
    System.out.println(linea(1, '&', '$'));
    System.out.println(linea(0, '&', '$'));
    System.out.println(linea(-3, '&', '$'));


    /* APARTADO B */ 

    System.out.println("\n\nApartado B:\n");
    System.out.println("PROGRAMA QUE PINTA UNA PIRÁMIDE HUECA");
    System.out.println("--------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la altura de la pirámide, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    int longitud = 1;
    char extremo = '*';
    char relleno = ' ';
    int numEspacios = altura - 1;

    for (int i = 0; i < altura; i++) {
      if (i == altura - 1) { 
        relleno = '*';
      }

      System.out.print(espacios(numEspacios)); 
      System.out.println(linea(longitud, extremo, relleno)); 

      longitud+=2; 
      numEspacios--; 
    }
  }


  /**** FUNCIONES ****/

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