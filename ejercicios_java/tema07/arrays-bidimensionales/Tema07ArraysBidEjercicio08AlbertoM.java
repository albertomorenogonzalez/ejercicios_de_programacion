/**
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
 * indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
 * 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas
 * se indican del 1 al 8.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio08AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DADA UNA POSICIÓN EN UN TABLERO DE AJEDREZ, NOS INDICA A QUÉ CASILLAS PODRÍA SALTAR UN ALFIL ENCONTRADA EN ESA POSICIÓN");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    String[] [] tablero = new String [8] [8]; //definimos el array bidimensional que contendrá todas las posiciones posibles del tablero.
    int indiceFila = 0;
    int filaAlfil = 0; //esta variable la usaremos más tarde para indicar en que fila ha puesto el usuario el alfil.
    int columnaAlfil = 0; //esta variable la usaremos más tarde para indicar en que columna ha puesto el usuario el alfil.
    int indiceColumna = 0; 
    int coordenadaLateral = 8; //variable para indicar el número de la fila según la nomenclatura del tablero de ajedrez.
    String[] columnas = {"a", "b", "c", "d", "e", "f", "g", "h"}; ////variable para indicar la letra de la columna según la nomenclatura del tablero de ajedrez.

    //pintamos un tablero para que el usuario conozca las posiciones posibles.
    System.out.println("    a   b   c   d   e   f   g   h");
    System.out.println("  ┌───┬───┬───┬───┬───┬───┬───┬───┐");

    for (indiceFila = 0; indiceFila < 8; indiceFila++) {
      System.out.print(coordenadaLateral + " |");

      for (indiceColumna = 0; indiceColumna < 8; indiceColumna++) {
        tablero[indiceFila] [indiceColumna] = columnas[indiceColumna] + coordenadaLateral; //se defnen las posiciones.
        System.out.print("   |");
      } //for (indiceColumna = 0; indiceColumna < 8; indiceColumna++)

      System.out.print(" " + coordenadaLateral);

      System.out.println(" ");

      if (indiceFila < 7) {
        System.out.println("  ├───┼───┼───┼───┼───┼───┼───┼───┤");
      } else {
        System.out.println("  └───┴───┴───┴───┴───┴───┴───┴───┘");
      } //if

      coordenadaLateral--;
    } //for (indiceFila = 0; indiceFila < 8; indiceFila++)

    System.out.println("    a   b   c   d   e   f   g   h");

    System.out.println(" ");

    //se pedirá la posición que quiera el usuario por pantalla.
    System.out.println("Introduzca la posición del alfil:");
    System.out.print("> ");
    String posicion = System.console().readLine().toLowerCase();
    System.out.println(" ");

    System.out.println("El álfil puede moverse a las siguientes posiciones:");

    boolean encontrado = false; //esta variable booleana servirá para encontrar la posición en el array en la que se encuentra la posición introducida.

    while (!encontrado) { //con este bucle tratamos de encontrar la posición introducida en el array.
      for (indiceFila = 0; indiceFila < 8; indiceFila++) {
        for (indiceColumna = 0; indiceColumna < 8; indiceColumna++) {
          if (tablero[indiceFila] [indiceColumna].equals(posicion)) { //una vez encontrada guardaremos en la variable filaAlfil la fila de la posición y en columnaAlfil la columna.
            filaAlfil = indiceFila;
            columnaAlfil = indiceColumna;
            encontrado = true; //con la variable encontrada, la booleana se hará verdadera y el bucle while parará
          } //if
        } //for (indiceColumna = 0; indiceColumna < 8; indiceColumna++)
      } //for (indiceFila = 0; indiceFila < 8; indiceFila++)
    } //while (!encontrado)

    //con este bucle aparecerán por pantalla aquellas posiciones a las que puede moverse el alfil.
    //se pondrán desde la fila de abajo hasta la de arriba y de izquierda a derecha.
    for (indiceFila = 7; indiceFila >= 0; indiceFila--) { 
      for (indiceColumna = 0; indiceColumna < 8; indiceColumna++) {
        //en las posiciones a las que puede moverse el alfil que se encuentran arriba a su derecha y abajo a su izquierda se cumple que 
        //su posición en el eje x sumada a la del eje y es la misma que la posición en el eje x y la del eje y del alfil sumadas.
        //en las posiciones a las que puede moverse el alfil que se encuentran abajo a su derecha y arriba a su izquierda se cumple que
        // su posición en el eje y menos la posición en el eje y del alfil es igual a su posiicón en el eje x menos la posición en el eje x del alfil
        if ((indiceColumna + indiceFila == filaAlfil + columnaAlfil) || (indiceFila - filaAlfil == indiceColumna - columnaAlfil)) {
          //como en la posición introducida por teclado también se cumple la segunda condición, pondremos que la posición del alfil no salga por pantalla
          if ((indiceFila != filaAlfil) && (indiceColumna != columnaAlfil)) { 
            System.out.print(tablero[indiceFila] [indiceColumna] + " ");
          }
        } //if
      } //for (indiceColumna = 0; indiceColumna < 8; indiceColumna++)
    } //for (indiceFila = 0; indiceFila < 8; indiceFila++)
  }
}