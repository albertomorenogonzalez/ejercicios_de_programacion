/**
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio17AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA UN ARRAY DE DIEZ NÚMEROS ALEATORIOS, PIDE UNO DE ELLOS POR TECLADO Y LO MUESTRA EN LA POSICIÓN 0, DESPLAZANDO EL RESTO");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [10];

    int indice;

    // mostramos el array original
    System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
    System.out.print("|Índice|");

    for (indice = 0; indice < 10; indice++) {
      System.out.printf(" %d %-1s" ,indice ,"|");
    }

    System.out.println(" ");

    System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
    System.out.print("|Número|");

    for (indice = 0; indice < 10; indice++) {
      numero[indice] = ((int)(Math.random() * 101));

      System.out.printf("%3d%-1s" ,numero[indice] ,"|");
    } // for

    System.out.println(" ");

    System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");

    System.out.println(" ");

    int numPosCero = -1;
    int comprobadorArray = 0;
    boolean numeroEnArray = false;

    int posicionesDeMenos = 0;

    System.out.println("Introduca el número que quiere pasar a la posición 0, por favor: ");

    // mientras numPosCero (el número que queremos poner en la posición 0) sea distinto a cualquiera del array, el programa nos pedirá que introduzcamos un número
    while (!numeroEnArray) {
      System.out.print("> ");
      numPosCero = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      // con este bucle comprobamos si el número se encuentra en el array
      for (comprobadorArray = 0; ((comprobadorArray < 10) && (numPosCero != numero[comprobadorArray])); comprobadorArray++) { }

      // cuando el bucle encuentre el número en el array, parará. Le damos el valor del número donde se ha quedado el bucle a la variable posicionesDeMenos 
      // esta variable representa el número de posiciones previas al número introducido
      posicionesDeMenos = comprobadorArray;

      if (comprobadorArray == 10) {
        numeroEnArray = false;
        System.out.println("Introduca correctamente el número que quiere pasar a la posición 0, por favor: ");
      } else {
        // esta variable booleana cuando es verdadera es la que rompe el bucle y continua con el programa. Si es falsa lo continúa
        numeroEnArray = true;
      }
    } // while

    // creamos un nuevo array donde guardaremos el array resultado
    int[] resultado = new int [10];

    // el número introuducido en la posición 0
    resultado[0] = numPosCero;

    // esta variable se encarga de establecer el número de números posteriores al número introducido
    int posAntesNumPosCero = (10 - posicionesDeMenos);

    // este bucle se encarga de los números posteriores al número introducido
    // empieza en la posición 1 del nuevo array y termina cuando todos los números posteriores al introducido hasta la posiicón 9 han sido guardados
    for (indice = 1; indice < posAntesNumPosCero; indice++) {
      resultado[indice] = numero[(posicionesDeMenos + indice)];
    }

    // este bucle se encarga de los números anteriores al número introducido
    // desde la posición siguiente a la última posición utilizada en el nuevo array el bucle guarda desde el número en la posición 0 original y el número previo a numPosCero
    for (indice = posAntesNumPosCero; indice < (posAntesNumPosCero + posicionesDeMenos); indice++) {
      resultado[indice] = numero[indice - posAntesNumPosCero];
    }

    // mostramos el array resultado
    System.out.println("┌──────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
    System.out.print("|Índice|");

    for (indice = 0; indice < 10; indice++) {
      System.out.printf(" %d %-1s" ,indice ,"|");
    }

    System.out.println(" ");

    System.out.println("├──────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
    System.out.print("|Número|");

    for (indice = 0; indice < 10; indice++) {
      System.out.printf("%3d%-1s" ,resultado[indice] ,"|");
    } 

    System.out.println(" ");

    System.out.println("└──────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
  }
} 