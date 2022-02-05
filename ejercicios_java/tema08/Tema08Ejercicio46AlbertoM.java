import java.util.Scanner; //importamos la clase Scanner

/**
 * Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
 * usuario debe introducir la altura de la figura. Podemos suponer que el usuario
 * introduce una altura mayor o igual a 3.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio46AlbertoM { 
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

    //el bucle imprimirá primero una línea de asteriscos hueca, luego una de espacios y después otra línea de asteriscos hueca 
    //en cada iteración hasta llegar al valor de la altura - 1. El tamaño de las líneas de de asteriscos huecas  es igual a i + 1.  
    //en la última linea numCaracteresValle es igua a 0 y por tanto no se imprimen espacios, numCaracteresValle disminuye en 2 en cada iteración
    //la última línea no es hueca, por lo que fuera del bucle se pintará por pantalla una línea completa de asteriscos
    //de valor altura * 2 - 1
    for (int i = 0; i < altura - 1; i++) {
      System.out.print(linea('*', ' ', i + 1));
      System.out.print(linea(' ', ' ', numCaracteresValle));
      System.out.println(linea('*', ' ', i + 1));

      numCaracteresValle-=2;
    } //for (int i = 0; i < altura; i++) 

    System.out.println(linea('*', '*', altura * 2 - 1));
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