/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio06AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE RELLENA UN ARRAY DE 6 FILAS Y 10 COLUMNAS CON NÚMEROS ALEATORIOS ENTRE EL 0 Y EL 100 (AMBOS INCLUIDOS), Y QUE INDICA CUAL ES EL MÁXIMO Y EL MÍNIMO");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int [] numUnid = new int [60]; //arra unidimensional donde se asignarán los valores sin repetir
    int[] [] num = new int[6] [10]; //array bidimensional de la tabla donde se asignará el resultado
    int indiceFila; //esta variable indica la fila en la que se encuentra el número
    int indiceColumna; //esta variable indica la columna donde se encuentra el número
    int numMenor = 0; //inicializamos la variable que contendrá al número que sea el máximo
    int numMayor = 0; //inicializamos la variable que contendrá al número que sea el mínimo
    int numNumeros = 0; //variable utilizada como contador, nos ayudará también para asignar cada valor del array unidimensional al bidimensional y para encontrar el número mínimo 
    int numPropuesto; //variable que utilizaremos para generar números

    //asignamos los valores sin que se repitan
    while(numNumeros < 60) { 
      numPropuesto = ((int)(Math.random() * 1001)); //se generará un número aleatorio
      boolean repetido = false; //con esta variable booleana determinaremos si el numero está repetido o no

      while(!repetido) { //mientras la variable sea falsa este bucle anidado se seguirá repitiendo
        for(int indice = 0; indice < numNumeros; indice++) { //con este bucle se irá comprobando si el número generado aleatoriamente es igual a alguno de los números presentes en el array unidimensional
          if(numPropuesto == numUnid[indice]) { //si el número generado coincide con alguno de los números ya existentes la vaiable será verdadera y el programa saldrá del bucle
            repetido = true;
          }
        } //for

        if(!repetido) { //si el número generado no coincide con ninguno de los números que había en el array se asignará al array y se pasará a la siguiente posición. Si no comenzará de nuevo el bucle y se generará otro número
          numUnid[numNumeros] = numPropuesto;
          numNumeros++;
        } //if
      } //while
    } //while

    //se asignan los valores del array unidimensional al bidimensional

    numNumeros = 0; // se vuelve a asignar la variable numNumeros a 0 para usarla de nuevo

    for (indiceFila = 0; indiceFila < 6; indiceFila++) {
      for (indiceColumna = 0; indiceColumna < 10; indiceColumna++) {
        num[indiceFila] [indiceColumna] = numUnid[numNumeros]; //se asigna cada valor en su posición

        if (numNumeros == 0) {
          numMenor = num[indiceFila] [indiceColumna]; //el primer número será siempre tomado en cuenta como el menor de primera hora (también sería el máximo ya que no hay ningún otro número)
        } else if (num[indiceFila] [indiceColumna] > numMayor) {
          numMayor = num[indiceFila] [indiceColumna]; //si el siguiente número generado es mayor que el número que era el máximo hasta ahora el nuevo número será el máximo
        } else if (num[indiceFila] [indiceColumna] < numMenor) {
          numMenor = num[indiceFila] [indiceColumna]; //si el siguiente número generado es menor que el que hasta ahora el mínimo el nuevo nuevo pasará a ser el mínimo
        } //if

        //¿por qué calculo así el menor? según se vayan introduciendo números el mínimo irá cambiando. El primer número generado cuando no se ha generado ningún otro es el primer mínimo,
        //por eso lo declaro como tal cuando el contador (numNumeros) está a 0. Si el siguiente número generado es menor, el número mínimo cambiará, así hasta llegar al sexagésimo número

        numNumeros++;
      } //for
    } //for

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
    } //for

    System.out.println("└───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┴───────────┘");

    System.out.println(" ");

    System.out.println("El número mínimo es el " + numMenor + " y el máximo es el " + numMayor);
  }
}