/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio01AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA EL CONTENIDO DE TODOS LOS ELEMENTOS DE UN ARRAY DE 3 FILAS Y 6 COLUMNAS");
    System.out.println("---------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] [] num = new int[3] [6];
    int indiceFila;
    int indiceColumna;

    num[0] [0] = 0;
    num[0] [1] = 30;
    num[0] [2] = 2;
    num[0] [5] = 5;
    num[1] [0] = 75;
    num[1] [4] = 0;
    num[2] [2] = -2;
    num[2] [3] = 9;
    num[2] [5] = 11;

    System.out.println(" ");
  
    System.out.println("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐");

    System.out.print("| Array num |");

    for (indiceColumna = 0; indiceColumna < 6; indiceColumna++) {
      System.out.print(" Columna " + indiceColumna + " |");
    }
    
    System.out.println(" ");

    for (indiceFila = 0; indiceFila < 3; indiceFila++) {
      System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┤");
      System.out.print("|  Fila " + indiceFila + "   |");

      for (indiceColumna = 0; indiceColumna < 6; indiceColumna++) {
        System.out.printf("    %2d     %-1s" ,num[indiceFila] [indiceColumna] ,"|");
      }
      System.out.println(" ");
    }

    System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");
  }
}
