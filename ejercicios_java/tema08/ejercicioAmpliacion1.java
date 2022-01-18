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
public class ejercicioAmpliacion1 { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

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
    for (int i = 1; i <= numEspacios; i++) {
      System.out.print(" ");
    }

    return "";
  } //public static String espacios(int altura)
}