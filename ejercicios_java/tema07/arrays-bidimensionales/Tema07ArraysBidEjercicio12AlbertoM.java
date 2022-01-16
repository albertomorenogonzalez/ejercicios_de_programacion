/**
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio12AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LA DIAGONAL QUE VA DESDE LA ESQUINA INFERIOR IZQUIERDA A LA ESQUINA SUPERIOR DERECHA DE UN ARRAY DE 10X10, SU NÚMERO MÍNIMO, SU MÁXIMO Y SU MEDIA");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] [] matriz = new int [9] [9]; //array bidimensional de donde se cogerá la diagonal.
    int[] diagonal = new int [9]; //array unidimensional donde se guardará la diagonal.
    int indiceFila = 0; 
    int indiceColumna = 0; 
    int numMenor = 0; //inicializamos la variable que contendrá al número que sea el máximo.
    int numMayor = 0; //inicializamos la variable que contendrá al número que sea el mínimo.
    int sumatorio = 0; //en esta variable se irá sumando cada valor de la diagonal para calcular la media a posteriori.

    //mostramos el array bidimensional y asignamos sus valores.
    System.out.println("      0     1     2     3     4     5     6     7     8");
    System.out.println("   ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");

    for (indiceFila = 0; indiceFila < 9; indiceFila++) {
      System.out.printf("%2d %-1s",indiceFila ,"|");

      for (indiceColumna = 0; indiceColumna < 9; indiceColumna++) {
        matriz[indiceFila] [indiceColumna] = ((int)(Math.random() * 401) + 500);

        if (indiceFila + indiceColumna == 8) { //si la suma del índice de la fila y el índice de la columna es igual a 8 significa que el número pertence a la diagonal
          diagonal[indiceColumna] = matriz[indiceFila] [indiceColumna];
        } //if

        System.out.printf(" %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");
      } //for (indiceColumna = 0; indiceColumna < 9; indiceColumna++)

      System.out.println(" ");

      if (indiceFila < 8) {
        System.out.println("   ├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      } else {
        System.out.println("   └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
      } //if
    } //for (indiceFila = 0; indiceFila < 9; indiceFila++)

    System.out.println(" ");
    System.out.println(" ");

    //mostramos los números de la diagonal, calculamos el mínimo, el máximo y la media y también lo mostramos
    System.out.println("Los números de la diagonal que va de la esquina superior izquierda a la esquina inferior derecha son:");

    for (int indice = 0; indice < 9; indice++) {
      System.out.print(diagonal[indice] + " ");

      if (indice == 0) {
        numMenor = diagonal[indice]; //el primer número será siempre tomado en cuenta como el menor de primera hora
        numMayor = diagonal[indice]; //el primer número cuando no hay más números es tanto el menor como el mayor
      } else if (diagonal[indice] > numMayor) {
        numMayor = diagonal[indice]; //si el siguiente número generado es mayor que el número que era el máximo hasta ahora el nuevo número será el máximo
      } else if (diagonal[indice] < numMenor) {
        numMenor = diagonal[indice]; //si el siguiente número generado es menor que el que hasta ahora el mínimo el nuevo nuevo pasará a ser el mínimo
      }

      //¿por qué calculo así el menor? según se vayan introduciendo números el mínimo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer mínimo,
      //por eso lo declaro como tal cuando el contador (indice) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al noveno número

      sumatorio = diagonal[indice] + sumatorio; //el número de la diagonal se guarda en la variable sumado a lo que ya había dentro de ella.
    } //for (int indice = 0; indice < 9; indice++)

    System.out.println("\n ");

    System.out.println("El número mínimo es " + numMenor);
    System.out.println("El número máximo es " + numMayor);
    System.out.println("La media de los números de la diagonal es " + (sumatorio / 9));
  }
}