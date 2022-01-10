/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio05AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE RELLENA UN ARRAY DE 6 FILAS Y 10 COLUMNAS CON NÚMEROS ALEATORIOS ENTRE EL 0 Y EL 100 (AMBOS INCLUIDOS), Y QUE INDICA CUAL ES EL MÁXIMO Y EL MÍNIMO");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] [] num = new int[6] [10]; //array bidimensional de la tabla
    int indiceFila; //esta variable indica la fila en la que se encuentra el número
    int indiceColumna; //esta variable indica la columna donde se encuentra el número
    int numMenor = 0; //inicializamos la variable que contendrá al número que sea el máximo
    int numMayor = 0; //inicializamos la variable que contendrá al número que sea el mínimo
    int numNumeros = 0; //variable utilizada como contador, nos ayudará para encontrar el número mínimo

    for (indiceFila = 0; indiceFila < 6; indiceFila++) {
      for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
        num[indiceFila] [indiceColumna]= ((int)(Math.random() * 1001)); //cada posición del array se genera de forma aleatoria

        if (numNumeros == 0) {
          numMenor = num[indiceFila] [indiceColumna]; //el primer número será siempre tomado en cuenta como el menor de primera hora (también sería el máximo ya que no hay ningún otro número)
        } else if (num[indiceFila] [indiceColumna] > numMayor) {
          numMayor = num[indiceFila] [indiceColumna]; //si el siguiente número generado es mayor que el número que era el máximo hasta ahora el nuevo número será el máximo
        } else if (num[indiceFila] [indiceColumna] < numMenor) {
          numMenor = num[indiceFila] [indiceColumna]; //si el siguiente número generado es menor que el que hasta ahora el mínimo el nuevo nuevo pasará a ser el mínimo
        }

        //¿por qué calculo así el menor? según se vayan introduciendo números el mínimo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer mínimo,
        //por eso lo declaro como tal cuando el contador (numNumeros) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al sexagésimo número

        numNumeros++;
      }
    }

    //se muestran los resultados
    System.out.println("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐");

    System.out.print("| Array num |");

    for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
      System.out.print(" Columna " + indiceColumna + " |");
    }
    
    System.out.println(" ");

    for (indiceFila = 0; indiceFila < 6; indiceFila++) {
      System.out.println("├───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┼───────────┤");
      System.out.print("|  Fila " + indiceFila + "   |");

      for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
        System.out.printf("   %4d    %-1s" ,num[indiceFila] [indiceColumna] ,"|");
      }
      System.out.println(" ");
    }

    System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");

    System.out.println(" ");

    System.out.println("El número mínimo es el " + numMenor + " y el máximo es el " + numMayor);
  }
}