import java.util.Scanner; //importamos la clase Scanner

/**
 * Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
 * usuario debe introducir la altura de la figura. Podemos suponer que el usuario
 * introduce una altura mayor o igual a 3.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio45AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE PINTA UN VALLE POR PANTALLA");
    System.out.println("-----------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la altura del valle: ");
    System.out.print("> ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    int numCaracteresValle = altura * 2 - 3; //utilizaremos esta variable para determinar los espacios que conforman el valle

    //el bucle imprimirá primero una línea de asteriscos, luego una de espacios y después otra línea de asteriscos en cada
    //iteración. El tamaño de las líneas de de asteriscos es igual a i + 1, excepto la segunda línea de asteriscos que es igual
    //a i porque si no sobraría un asterisco (el caracter extremo derecho de la primera línea de asteriscos "se tiene que fusionar"
    //con el caracter extremo izquierda de la segunda). En la última linea numCaracteresValle es igual a 0 y por tanto no se 
    //imprimen espacios, numCaracteresValle disminuye en 2 en cada iteración
    for (int i = 0; i < altura; i++) {
      System.out.print(linea('*', '*', i + 1));
      System.out.print(linea(' ', ' ', numCaracteresValle));

      if (i == altura - 1) {
        System.out.println(linea('*', '*', i));
      } else {
        System.out.println(linea('*', '*', i + 1));
      }

      numCaracteresValle-=2;
    } //for (int i = 0; i < altura; i++) 
  }


  /**
   * La función pinta una línea de longitud determinada.
   * Tendrá dos carcatres iguales en cada extremo y el
   * resto de relleno entre ellos
   *
   * @param caracter caracter de los extremos de la línea
   * @param relleno caracter de relleno de la línea
   * @param repeticiones número de caracteres de la línea
   * @return línea de caracteres
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static String linea (char caracter, char relleno, int repeticiones) {
    String linea = ""; //declaramos la variable String linea para guardar ahí la línea

    //el bucle añadirá un caracter en cada iteración, así hasta llegar a repeticiones.
    //en la primera y última posición de la línea se añadirá el caracter de caracter
    //en el resto de psoicones se añadirá el crácter de relleno.
    for (int i = 0; i < repeticiones; i++) {
      if ((i == 0) || (i == repeticiones - 1)) {
        linea = linea + caracter;
      } else {
        linea = linea + relleno;
      } //if ((i == 0) || (i == repeticiones - 1))
    } //for (int i = 0; i < repeticiones; i++)

    return linea;
  } //public static String linea (char caracter, int repeticiones) 
}