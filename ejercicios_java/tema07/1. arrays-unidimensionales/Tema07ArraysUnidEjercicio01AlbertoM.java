/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio01AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA TODOS LOS ELEMENTOS DE UN ARRAY DE 12 NÚMEROS ENTEROS");
    System.out.println("---------------------------------------------------------------------------");
    System.out.println(" ");

    int[] num = new int [12];

    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    System.out.print("Los elementos del array son: ");

    for (int indice = 0; indice < 12; indice++) {
      System.out.print(num[indice] + " ");
    }

    //Los elementos que no han sido inicializados se muestran con valor 0.
  }
}
