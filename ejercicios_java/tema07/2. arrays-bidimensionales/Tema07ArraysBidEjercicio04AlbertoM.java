/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio04AlbertoM { 
  public static void main(String[] args) 
    throws InterruptedException { //se añade esta linea para poder usar sleep
      System.out.println("PROGRAMA QUE GENERA DE FORMA ALEATORIA 20 NÚMEROS ENTEROS DEL 100 AL 999, LOS MUESTRA EN UNA TABLA DE 4 FILAS Y 5 COLUMNAS Y MUESTRA LAS SUMAS DE LAS FILAS, DE LAS COLUMNA, Y LA TOTAL");
      System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");

      int[] [] num = new int[4] [5]; //array bidimensional de la tabla
      int indiceFila; //determina la posición en la fila de uno de los números del array
      int indiceColumna; // determina la posición en la columna de uno de los números del array
      int[] sumFila = new int[4]; //este array guardará cada uno de los sumatorios de filas
      int[] sumColumna = new int[5]; //este array guardará cada uno de lo sumatorios de columnas
      int sumTotal = 0; //esta variable indica el sumatorio total del array

      for (indiceFila = 0; indiceFila < 4; indiceFila++) {
        for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
          num[indiceFila] [indiceColumna]= ((int)(Math.random() * 900) + 100); //cada posición del array se genera de forma aleatoria

          sumFila[indiceFila] = sumFila[indiceFila] + num[indiceFila] [indiceColumna]; //mientras la fila en la que se estén introduciendo datos no cambie, la posición del array correspondiente irá aumentando
          sumColumna[indiceColumna] = sumColumna[indiceColumna] + num[indiceFila] [indiceColumna]; //cada vez que se vuelva a una columna la posición del array correspondiente irá aumentando
          sumTotal = sumTotal + num[indiceFila] [indiceColumna]; //la suma total irá incrementando cada vez que se introducuce un dato
        }
      }

      //se muestran los resultados
      Thread.sleep(1000); //retardo de un segundo antes de que aparezca la parte superior de la tabla
      System.out.println("┌───────────────────┬───────────────────┬───────────────────┬───────────────────┬───────────────────┬──────────────────────┐");

      Thread.sleep(1000); //retardo de un segundo antes de la aparición del primer dato

      for (indiceFila = 0; indiceFila < 4; indiceFila++) {
        for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
          System.out.printf("%-1s        %3d        " ,"|" ,num[indiceFila] [indiceColumna]);
          Thread.sleep(1000); //retardo de un segundo entre la aparición de un dato y otro
        }

        System.out.printf("%-1s %-15s%5d %-1s" ,"|" ,"Sum. fila " + indiceFila + " = " ,sumFila[indiceFila] ,"|");
        Thread.sleep(1500); //retardo de un segundo y medio entre un cambio de fila

        System.out.println(" ");

        System.out.println("├───────────────────┼───────────────────┼───────────────────┼───────────────────┼───────────────────┼──────────────────────┤");
      }

      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
        System.out.printf("%-1s %-11s%5d " ,"|" ,"Sum. C. " + indiceColumna + " = " ,sumColumna[indiceColumna]);
        Thread.sleep(1500); //retardo de un segundo y medio entre la aparición de los sumatorios de las columnas
      }

      System.out.print("|");

      Thread.sleep(2000); //retardo de dos segundos antes de la aparición del sumatorio total
      System.out.printf("     %-6s %5d     %-1s" ,"TOTAL:" ,sumTotal ,"|");

      System.out.println(" ");

      System.out.println("└───────────────────┴───────────────────┴───────────────────┴───────────────────┴───────────────────┴──────────────────────┘");
  }
}