/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio02AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA TODOS LOS ELEMENTOS DE UN ARRAY DE 10 CARACTERES");
    System.out.println("----------------------------------------------------------------------");
    System.out.println(" ");

    char[] simbolo = new char [10];

    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[8] = '+';
    simbolo[9] = 'Q';

    System.out.print("Los elementos del array son: ");

    for (int indice = 0; indice < 10; indice++) {
      System.out.print(simbolo[indice] + " ");
    }

    //Los elementos que no han sido inicializados se muestran como un espacio vacío.
  }
}
