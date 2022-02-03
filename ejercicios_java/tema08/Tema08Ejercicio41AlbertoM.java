import java.util.Scanner; //importamos la clase Scanner

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en
 * los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
 * ya se realizó en el tema de bucles, ahora se trata de usar una función para
 * que la implementación sea más sencilla. Por ejemplo, se puede crear una
 * función linea(char caracter, int repeticiones) que pinte una línea con el carácter
 * especificado.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio41AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE PINTA UN TRIÁNGULO RELLENO POR PANTALLA");
    System.out.println("-----------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la altura del triángulo: ");
    System.out.print("> ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    int numCaracteresLinea = altura; //declaramos el número de caracteres de la primera línea que es igual a la altura

    //este bucle pintará cada línea del triángulo hasta que i sea igual a la altura
    //el número de caracteres de la línea disminuirá en uno en cada iteración
    for (int i = 0; i < altura; i++) {
      System.out.println(linea('*', numCaracteresLinea));

      numCaracteresLinea--;
    }
  }

  /**
   * La función pinta una línea de longitud determinada
   *
   * @param caracter caracter con el que se va a hacer la línea
   * @param repeticiones número de caracteres de la línea
   * @return línea de caracteres
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String linea (char caracter, int repeticiones) {
    String linea = ""; //declaramos la variable String linea para guardar ahí la línea

    //el bucle añadirá un caracter en cada iteración, así hasta llegar a repeticiones
    for (int i = 0; i < repeticiones; i++) {
      linea = linea + caracter;
    }

    return linea;
  } //public static String linea (char caracter, int repeticiones)
}