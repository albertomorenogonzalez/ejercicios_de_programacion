/**
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio11AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LA DIAGONAL QUE VA DESDE LA ESQUINA SUPERIOR IZQUIERDA A LA ESQUINA INFERIOR DERECHA DE UN ARRAY DE 10X10, SU NÚMERO MÍNIMO, SU MÁXIMO Y SU MEDIA");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] [] matriz = new int [10] [10]; //array bidimensional de donde se cogerá la diagonal.
    int[] diagonal = new int [10]; //array unidimensional donde se guardará la diagonal.
    int indiceFila = 0; 
    int indiceColumna = 0; 
    int numMenor = 0; //inicializamos la variable que contendrá al número que sea el máximo.
    int numMayor = 0; //inicializamos la variable que contendrá al número que sea el mínimo.
    int sumatorio = 0; //en esta variable se irá sumando cada valor de la diagonal para calcular la media a posteriori.

    //mostramos el array original y asignamos sus valores.
    System.out.println("      0     1     2     3     4     5     6     7     8     9");
    System.out.println("   ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");

    for (indiceFila = 0; indiceFila < 10; indiceFila++) {
      System.out.printf("%2d %-1s",indiceFila ,"|");

      for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
        matriz[indiceFila] [indiceColumna] = ((int)(Math.random() * 101) + 200);

        if (indiceFila == indiceColumna) { //si el índice de la fila y el índice de la columna son iguales significa que el número pertenece a la diagonal
          diagonal[indiceColumna] = matriz[indiceFila] [indiceColumna];
        } //if

        if (indiceColumna < 10) {
          System.out.printf(" %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");
        } else {
          System.out.printf("  %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");
        } //if
      } //for (indiceColumna = 0; indiceColumna < 10; indiceColumna++)

      System.out.println(" ");

      if (indiceFila < 9) {
        System.out.println("   ├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      } else {
        System.out.println("   └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
      } //if
    } //for (indiceFila = 0; indiceFila < 10; indiceFila++)

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("Los números de la diagonal que va de la esquina superior izquierda a la esquina inferior derecha son:");

    for (int indice = 0; indice < 10; indice++) {
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
      //por eso lo declaro como tal cuando el contador (indice) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al décimo número

      sumatorio = diagonal[indice] + sumatorio; //el número de la diagonal se guarda en la variable sumado a lo que ya había dentro de ella.
    } //for (int indice = 0; indice < 10; indice++)

    System.out.println("\n ");

    System.out.println("El número mínimo es " + numMenor);
    System.out.println("El número máximo es " + numMayor);
    System.out.println("La media de los números de la diagonal es " + (sumatorio / 10));
  }
}