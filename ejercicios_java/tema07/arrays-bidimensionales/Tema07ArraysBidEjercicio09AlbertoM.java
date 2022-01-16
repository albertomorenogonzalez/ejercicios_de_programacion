/**
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
 * 12 filas por 12 columnas y debe contener números generados al azar entre 0 y
 * 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
 * con los números convenientemente alineados.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio09AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE ES CAPAZ DE ROTAR TODOS LOS ELEMENTOS DE UNA MATRIZ CUADRADA DE NÚMEROS ALEATORIOS DEL 0 AL 100 UNA POSICIÓN EN EL SENTIDO DE LAS AGUJAS DEL RELOJ");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] [] matriz = new int [12] [12]; //array bidimensional que contiene la matriz, la original al principio y la rotada después.
    int indiceFila = 0; 
    int indiceColumna = 0; 
    int capa; //los números rotarán en capas. Estas capas van desde fuera hacia dentro, Las van tal que columna 0, fila 0, columna 11, fila 11 y así sucesivamente hasta llegar a la 5.
    int indice; //este indice lo usaremos más tarde para cambiar de posición los números.
    int aux1; 
    int aux2; //las variables aux1 y aux2 las usaremos para aquellos números que no pueden ser cambiados de posición de otra forma que no sea guardándolos ahí y añadiéndolos al array posteriormente.

    // mostramos el array original y asignamos sus valores.
    System.out.println("Array original:");
    System.out.println(" ");

    System.out.println("      0     1     2     3     4     5     6     7     8     9     10     11");
    System.out.println("   ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬──────┬──────┐");

    for (indiceFila = 0; indiceFila < 12; indiceFila++) {
      System.out.printf("%2d %-1s",indiceFila ,"|");

      for (indiceColumna = 0; indiceColumna < 12; indiceColumna++) {
        matriz[indiceFila] [indiceColumna] = ((int)(Math.random() * 101));
        if (indiceColumna < 10) {
          System.out.printf(" %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");
        } else {
          System.out.printf("  %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");
        }
      } //for (indiceColumna = 0; indiceColumna < 12; indiceColumna++)

      System.out.println(" ");

      if (indiceFila < 11) {
        System.out.println("   ├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼──────┼──────┤");
      } else {
        System.out.println("   └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴──────┴──────┘");
      } //if
    } //for (indiceFila = 0; indiceFila < 12; indiceFila++)

    System.out.println(" ");
    System.out.println(" ");

    //mostramos el array resultado y cambiamos los valores de posición
    System.out.println("Array resultado:");
    System.out.println(" ");

    System.out.println("      0     1     2     3     4     5     6     7     8     9     10     11");
    System.out.println("   ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬──────┬──────┐");

    //iremos cambiando los números de posición por capas, empezando por la más externa. Estas capas las dividiremos en cuatro partes, 
    //la fila de arriba, la columna de la derecha, la fila de abajo y la columna de la izquierda
    //las variables aux1 y aux2 serán utilizadas para esos números que tengan que cambiar de fila a columna o viceversa.

    int aux = matriz[1][0]; //declaramos la variable aux, que será utilizada en el caso específico del cambio del número de la posición [1] [0] a la [0] [0].

    for (capa = 0; capa < 6; capa++) {
      //rotación de la fila de arriba
      aux1 = matriz[capa][11 - capa];

      //el aumento de la variable capa cada vez que el bucle da una vuelta hace que los números de las esquinas de la capa no cambien de fila o columna.
      for (indice = 11 - capa; indice > capa; indice--) {
        matriz[capa][indice] = matriz[capa][indice - 1];
      }

      //rotación de la columna derecha
      aux2 = matriz[11 - capa][11 - capa];
      for (indice = 11 - capa; indice > capa + 1; indice--) {
        matriz[indice][11 - capa] = matriz[indice - 1][11 - capa];
      }
      matriz[capa + 1][11 - capa] = aux1;

      //rotación de la fila de abajo
      aux1 = matriz[11 - capa][capa];
      for (indice = capa; indice < 11 - capa - 1; indice++) {
        matriz[11 - capa][indice] = matriz[11 - capa][indice + 1];
      }
      matriz[11 - capa][11 - capa - 1] = aux2;

      //rota de la columna izquierda
      for (indice = capa; indice < 11 - capa - 1; indice++) {
        matriz[indice][capa] = matriz[indice + 1][capa];
      }
      matriz[11 - capa - 1][capa] = aux1;
    } //for (capa = 0; capa < 6; capa++)

    matriz[0][0] = aux; //utilizamos la variable aux para definir la posición [0] [0].

    for (indiceFila = 0; indiceFila < 12; indiceFila++) {
      System.out.printf("%2d %-1s",indiceFila ,"|");

      for (indiceColumna = 0; indiceColumna < 12; indiceColumna++) {
        if (indiceColumna < 10) { 
          System.out.printf(" %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");
        } else {
          System.out.printf("  %3d %-1s" ,matriz[indiceFila] [indiceColumna] ,"|");
        } //if
      } //for (indiceColumna = 0; indiceColumna < 12; indiceColumna++)

      System.out.println(" ");

      if (indiceFila < 11) {
        System.out.println("   ├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼──────┼──────┤");
      } else {
        System.out.println("   └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴──────┴──────┘");
      } //if
    } //for (indiceFila = 0; indiceFila < 12; indiceFila++)
  }
}