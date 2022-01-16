/**
 * Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden escribir
 * directamente).
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio13AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA LA ESTATURA MEDIA, MÍNIMA Y MÁXIMA EN CENTÍMETROS DE PERSONAS DE DIFERENTES PAÍSES");
    System.out.println("--------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] [] matriz = new int [4] [10]; //array bidimensional de donde se cogerá la diagonal.
    String[] pais = {"España", "Rusia", "Japón", "Australia"}; //array unidimensional que contiene los países
    int indiceFila = 0; 
    int indiceColumna = 0; 
    int numMenor = 0; //inicializamos la variable que contendrá al número que sea el máximo.
    int numMayor = 0; //inicializamos la variable que contendrá al número que sea el mínimo.
    int sumatorio; //en esta variable se irá sumando cada valor de la diagonal para calcular la media a posteriori.

    //mostramos el array bidimensional y asignamos sus valores. También mostramos y realizamos los calculos sobre esos valores
    System.out.println("                                                                        ┌─────┬─────┬─────┐");
    System.out.println("                                                                        | MED | MIN | MAX |");
    System.out.println("┌───────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┼─────┼─────┼─────┤");

    for (indiceFila = 0; indiceFila < 4; indiceFila++) {
      sumatorio = 0; // cada vez que se cambie de fila el sumatorio se vuelve a cero para calcular la media de la fila únicamente

      System.out.printf("%-1s %-9s %-1s" ,"|" ,pais[indiceFila] ,"|");

      for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
        matriz[indiceFila] [indiceColumna] = ((int)(Math.random() * 71) + 140); //se genera un número aleatorio para cada valor del array

        if (indiceColumna == 0) {
          numMenor = matriz[indiceFila] [indiceColumna]; //el primer número será siempre tomado en cuenta como el menor de primera hora
          numMayor = matriz[indiceFila] [indiceColumna]; //el primer número cuando no hay más números es tanto el menor como el mayor
        } else if (matriz[indiceFila] [indiceColumna] > numMayor) {
          numMayor = matriz[indiceFila] [indiceColumna]; //si el siguiente número generado es mayor que el número que era el máximo hasta ahora el nuevo número será el máximo
        } else if (matriz[indiceFila] [indiceColumna] < numMenor) {
          numMenor = matriz[indiceFila] [indiceColumna]; //si el siguiente número generado es menor que el que hasta ahora el mínimo el nuevo nuevo pasará a ser el mínimo
        } //if
  
        //¿por qué calculo así el menor? según se vayan introduciendo números el mínimo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer mínimo,
        //por eso lo declaro como tal cuando el contador (indice) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al décimo número
  
        sumatorio = matriz[indiceFila] [indiceColumna] + sumatorio; //el número de la diagonal se guarda en la variable sumado a lo que ya había dentro de ella.

        //se muestra el valor del array recién generado
        System.out.printf(" %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");

        
      } //for (indiceColumna = 0; indiceColumna < 10; indiceColumna++)

      //mostramos mínimo, máximo y media
      System.out.printf(" %3d %-1s" ,(sumatorio / 10) ,"|");
      System.out.printf(" %3d %-1s" ,numMenor ,"|");
      System.out.printf(" %3d %-1s" ,numMayor ,"|");

      System.out.println(" ");

      if (indiceFila < 3) {
        System.out.println("├───────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
      } else {
        System.out.println("└───────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
      } //if
    } //for (indiceFila = 0; indiceFila < 4; indiceFila++)
  }
}