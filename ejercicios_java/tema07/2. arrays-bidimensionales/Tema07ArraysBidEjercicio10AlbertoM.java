/**
 * Realiza el juego de las tres en raya.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio10AlbertoM { 
  public static void main(String[] args) {
    System.out.println("TRES EN RAYA");
    System.out.println("-------------");
    System.out.println(" ");

    String[] [] cuadricula = new String [3] [3]; //array bidimensional de la cuadrícula sobre la que se juega.
    int indiceFila = 0;
    int indiceColumna = 0;;
    int coordenadaXJ1 = 0; //coordenada x que introduce el juagdor 1.
    int coordenadaYJ1 = 0; //coordenada y que introduce el jugador 1.
    int coordenadaXJ2 = 0; //coordenada x que introduce el jugador 2.
    int coordenadaYJ2 = 0; //coordenada x que introduce el jugador 2.

    //pintamos una cuadrícula inicial para mostrar al jugador las posiciones que puede seleccionar.
    System.out.println("y");

    System.out.println("  ┌───┬───┬───┐");

    for (indiceFila = 0; indiceFila < 3; indiceFila++) {
      
      System.out.print(indiceFila + " |");

      for (indiceColumna = 0; indiceColumna < 3; indiceColumna++) {
        cuadricula[indiceFila] [indiceColumna] = " "; //se definen las posiciones del array como espacios vacíos.
        System.out.print(" " + cuadricula[indiceFila] [indiceColumna] + " |");
      } //for (indiceColumna = 0; indiceColumna < 3; indiceColumna++)

      System.out.println(" ");

      if (indiceFila < 2) {
        System.out.println("  ├───┼───┼───┤");
      } else {
        System.out.println("  └───┴───┴───┘");
      } //if
    } //for (indiceFila = 0; indiceFila < 4; indiceFila++)

    System.out.print("    ");

    for (indiceColumna = 0; indiceColumna < 3; indiceColumna++) {
      System.out.print(indiceColumna + "   ");
    } 

    System.out.print("x");

    System.out.println(" ");
    System.out.println(" ");

    boolean victoria = false; //variable booleana que indica cuando se ha ganado.
    boolean empate = false; //variable booleana que indica que si el tablero se llena y nadie ha ganado la partida quedará en empate.

    int turno = 1; //definimos cada turno, los impares corresponden al jugador 1 y los pares al jugador 2

    while ((!victoria) && (!empate)) { //mientras nadie encadene tres en raya ni el tablero se llene se seguirán sucediendo los turnos, que aumentan en 1 pòr cada vuelta del bucle
      //se piden los valores por pantalla ya sea a un jugador u otro
      if ((turno % 2) != 0) {
        System.out.println("Jugador 1:\n");

        System.out.println("Coordenada x:");
        System.out.print("> ");
        coordenadaXJ1 = Integer.parseInt(System.console().readLine());
        System.out.println(" ");

        System.out.println("Coordenada y:");
        System.out.print("> ");
        coordenadaYJ1 = Integer.parseInt(System.console().readLine());
        System.out.println(" ");  
      } else {
        System.out.println("Jugador 2:\n");

        System.out.println("Coordenada x:");
        System.out.print("> ");
        coordenadaXJ2 = Integer.parseInt(System.console().readLine());
        System.out.println(" ");

        System.out.println("Coordenada y:");
        System.out.print("> ");
        coordenadaYJ2 = Integer.parseInt(System.console().readLine());
        System.out.println(" ");  
      } //if

      System.out.println("y");

      //mostramos de nuevo la cuadrícula pero esta vez con la coordenada que ha introducido el usuario señalada.
      System.out.println("  ┌───┬───┬───┐");

      for (indiceFila = 0; indiceFila < 3; indiceFila++) {
        System.out.print(indiceFila + " |");

        for (indiceColumna = 0; indiceColumna < 3; indiceColumna++) {
            if ((turno % 2) != 0) { 
              cuadricula[coordenadaYJ1] [coordenadaXJ1] = "x"; //cada vez que un jugador señale una coordenada, se marcará con un símbolo; la "x" si es el jugador 1 y la "o" si es el jugador dos.
            } else {
              cuadricula[coordenadaYJ2] [coordenadaXJ2] = "o";
            } //if

          System.out.print(" " + cuadricula[indiceFila] [indiceColumna] + " |");
        } //for (indiceColumna = 0; indiceColumna < 3; indiceColumna++)

        System.out.println(" ");        
        
        if (indiceFila < 2) {
          System.out.println("  ├───┼───┼───┤");
        } else {
          System.out.println("  └───┴───┴───┘");
        } //if
      } //for (indiceColumna = 0; indiceColumna < 3; indiceColumna++)

      System.out.print("    ");

      for (indiceColumna = 0; indiceColumna < 3; indiceColumna++) {
        System.out.print(indiceColumna + "   ");
      } 

      System.out.print("x");

      System.out.println(" ");

      //este bucle comprobará coordenada por coordenada si se han encadenado tres en raya.
      //se comprobarán todos los casos posibles. Si ningún caso se cumple y estamos en el turno 9, significa que la partida ha quedado en empate.
      for (indiceFila = 0; indiceFila < 3; indiceFila++) {
        for (indiceColumna = 0; indiceColumna < 3; indiceColumna++) {
          if ((cuadricula[0] [0].equals("x")) && (cuadricula[0] [1].equals("x")) && (cuadricula[0] [2].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[1] [0].equals("x")) && (cuadricula[1] [1].equals("x")) && (cuadricula[1] [2].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[2] [0].equals("x")) && (cuadricula[2] [1].equals("x")) && (cuadricula[2] [2].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[0] [0].equals("x")) && (cuadricula[1] [0].equals("x")) && (cuadricula[2] [0].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[0] [1].equals("x")) && (cuadricula[2] [1].equals("x")) && (cuadricula[2] [1].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[0] [2].equals("x")) && (cuadricula[1] [2].equals("x")) && (cuadricula[2] [2].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[0] [0].equals("x")) && (cuadricula[1] [1].equals("x")) && (cuadricula[2] [2].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[2] [0].equals("x")) && (cuadricula[1] [1].equals("x")) && (cuadricula[0] [2].equals("x"))) {
            victoria = true;
          } else if ((cuadricula[0] [0].equals("o")) && (cuadricula[0] [1].equals("o")) && (cuadricula[0] [2].equals("o"))) {
            victoria = true;
          } else if ((cuadricula[1] [0].equals("o")) && (cuadricula[1] [1].equals("o")) && (cuadricula[1] [2].equals("o"))) {
            victoria = true;
          } else if ((cuadricula[2] [0].equals("o")) && (cuadricula[2] [1].equals("o")) && (cuadricula[2] [2].equals("o"))) {
            victoria = true;
          } else if ((cuadricula[0] [0].equals("o")) && (cuadricula[1] [0].equals("o")) && (cuadricula[2] [0].equals("o"))) {
            victoria = true;
          } else if ((cuadricula[0] [1].equals("o")) && (cuadricula[2] [1].equals("o")) && (cuadricula[2] [1].equals("o"))) {
            victoria = true;
          } else if ((cuadricula[0] [2].equals("o")) && (cuadricula[1] [2].equals("o")) && (cuadricula[2] [2].equals("o"))) {
            victoria = true;
          } else if ((cuadricula[0] [0].equals("o")) && (cuadricula[1] [1].equals("o")) && (cuadricula[2] [2].equals("o"))) {
            victoria = true;
          } else if ((cuadricula[2] [0].equals("o")) && (cuadricula[1] [1].equals("o")) && (cuadricula[0] [2].equals("o"))) {
            victoria = true;
          } else if (turno > 8) {
            empate = true;
          } //if
        } //for (indiceColumna = 0; indiceColumna < 3; indiceColumna++)
      } //for (indiceColumna = 0; indiceColumna < 3; indiceColumna++)

      System.out.println(" ");

      turno++;
    } //while ((!victoria) && (!empate))

    if (victoria) {
      if ((turno % 2) == 0) { 
        System.out.println("¡Gana el jugador 1!");
      } else {
        System.out.println("¡Gana el jugador 2!");
      } //if
    } else if (empate) {
      System.out.println("¡Empate!");
    }
  }
}