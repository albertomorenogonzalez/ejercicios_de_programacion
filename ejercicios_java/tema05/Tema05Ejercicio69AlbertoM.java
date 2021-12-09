/**
 * Realiza un programa que pinte una pirámide maya. Por los lados, se trata
 * de una pirámide normal y corriente. Por el centro se van pintando líneas de
 * asteriscos de forma alterna (empezando por la superior): la primera se pinta,
 * la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
 * tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
 * normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
 * usuario introducirá un número entero mayor o igual a 3; no es necesario
 * comprobar los datos de entrada.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio69AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA PIÁMIDE MAYA POR PANTALLA");
    System.out.println("-------------------------------------------------");
    System.out.println(" ");

    int altura = 0;

    System.out.println("Introduzca la altura de la pirámide, por favor: ");
    System.out.print("> ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int linea = 1;
    int numCaracteres = 6;
    int espacios = altura - 1;

    // el programa irá pintando lineas hasta formar la altura introducida por teclado
    while (linea <= altura) {
      // se pintan los espacios que sean necesarios para formar los escalones de la pirámide
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      // se pitan los caracteres de la pirámide 
      // el número de caracteres de la primera línea es 6, después de eso en cada línea habrá dos caracteres más, uno por la izquierda y otro por la derecha
      // en las líneas pares, los caracteres centrales no se pintan. Los caracteres antes del hueco coinciden con el número de línea en el que se encuentran. Cada hueco tiene uatro espacios.
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if ((linea % 2 == 0) && ((longLinea > linea) && (longLinea < (linea + 5)))) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      
      System.out.println(" ");
      
      linea++;
      numCaracteres += 2;
      espacios--;
    }
  }
}