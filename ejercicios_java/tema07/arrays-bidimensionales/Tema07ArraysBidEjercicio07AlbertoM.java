/**
 * Minijuego "Busca el tesoro"
 * 
 * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
 * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
 * está el tesoro.
 * 
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
 * de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysBidEjercicio07AlbertoM { 
  public static void main(String[] args) {
    System.out.println("¡BUSCA EL TESORO!");
    System.out.println("------------------");
    System.out.println(" ");

    String[] [] cuadricula = new String [4] [5]; //definimos el array bidimensional de la cuadricula.
    int indiceFila = 0;
    int indiceColumna = 0;;
    int coordenadaX; //valor de columna introducida por el usuario.
    int coordenadaY; //valor de fila introducido por el usuario.
    int intentos = 5; //intentos para encontrar el tesoro.

    int posicionTesoroX = ((int)(Math.random() * 5)); //definimos la columna en la que se encuentra el tesoro de forma aleatoria.
    int posicionTesoroY = ((int)(Math.random() * 4)); //definimos la fila en la que se encuentra el tesoro de forma aleatoria.
    //para que la posición de la mina no coincida con la del tesoro, ponemos en un principio que la posición sea la misma 
    //y que hasta que al menos uno de los valores sea distinto siga generando números aleatorios
    //la mina y el tesoro si pueden estar en la misma fila o en la misma columna.
    int posicionMinaX = posicionTesoroX;
    int posicionMinaY = posicionTesoroY;
    while ((posicionMinaX == posicionTesoroX) && (posicionMinaY == posicionTesoroY)) {
      posicionMinaX = ((int)(Math.random() * 5));
      posicionMinaY = ((int)(Math.random() * 4));
    } // while ((posicionMinaX == posicionTesoroX) && (posicionMinaY == posicionTesoroY))

    //definimos un array unidimensional que completaremos con los diferentes estados del juego: ganar, estar cerca de la mina, encontrar la mina, quedarse sin intentos y perder, 
    //para que se muestren en tal casa.
    String[] estado = {"¡Has encontrado la mina!", "¡Enhorabuena! ¡Has encontrado el tesoro!", "¡Cuidado! ¡Hay una mina cerca!", "Te has quedado sin intentos.", "Lo siento, has perdido"};
    int numEstado = 0;

    //pintamos una cuadrícula inicial para mostrar al jugador las posiciones que puede seleccionar.
    System.out.println("y");

    System.out.println("  ┌───┬───┬───┬───┬───┐");

    for (indiceFila = 0; indiceFila < 4; indiceFila++) {
      
      System.out.print(indiceFila + " |");

      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
        cuadricula[indiceFila] [indiceColumna] = " ";
        System.out.print(" " + cuadricula[indiceFila] [indiceColumna] + " |");
      } //for (indiceColumna = 0; indiceColumna < 5; indiceColumna++)

      System.out.println(" ");

      if (indiceFila < 3) {
        System.out.println("  ├───┼───┼───┼───┼───┤");
      } else {
        System.out.println("  └───┴───┴───┴───┴───┘");
      } //if
    } //for (indiceFila = 0; indiceFila < 4; indiceFila++)

    System.out.print("    ");

    for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
      System.out.print(indiceColumna + "   ");
    } 

    System.out.print("x");

    System.out.println(" ");
    System.out.println(" ");

    boolean finDelJuego = false; //esta variable booleana será verdadera si el juego tiene que terminar antes de que se acaben los cinco intentos.

    // mientras los intentos no se acaben y no encuentres ni la mina ni el tesoro podrás seguir jugando.
    while ((!finDelJuego) && (intentos > 0)) {
      //mostraos los intentos que quedan
      if (intentos > 1) {
        System.out.println("Tienes " + intentos + " intentos.");
      } else {
        System.out.println("Te queda solo " + intentos + " intento.");
      } //if

      System.out.println(" ");

      //pedimos las coordenadas que quiere comprobar el jugador por pantalla.
      System.out.println("Coordenada x:");
      System.out.print("> ");
      coordenadaX = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      System.out.println("Coordenada y:");
      System.out.print("> ");
      coordenadaY = Integer.parseInt(System.console().readLine());
      System.out.println(" ");  
      System.out.println("y");

      //mostramos de nuevo la cuadrícula pero esta vez con la coordenada que ha introducido el usuario señalada.
      System.out.println("  ┌───┬───┬───┬───┬───┐");

      for (indiceFila = 0; indiceFila < 4; indiceFila++) {
        System.out.print(indiceFila + " |");

        for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
          if ((coordenadaY == posicionTesoroY) && (coordenadaX == posicionTesoroX)) { 
            cuadricula[coordenadaY] [coordenadaX] = "+"; //si la coordenada es la misma que la del tesoro el valor de esa posición en el array pasará de estar vacío a "+".
            finDelJuego = true; //el bucle terminará.
            numEstado = 1; //con este número posteriormente se mostrará el mensaje de que el jugador ha ganado.
          } else if ((coordenadaY == posicionMinaY) && (coordenadaX == posicionMinaX)) {
            cuadricula[coordenadaY] [coordenadaX] = "*"; //si la coordenada es la misma que la de la mina el valor de esa posición en el array pasará de estar vacío a "*".
            finDelJuego = true; //el bucl terminará.
            numEstado = 0; //con este número posteriormente se mostrará el mensaje de que el jugador ha encontrado la mina.
          } else {
            cuadricula[coordenadaY] [coordenadaX] = "x"; //si la posición consultada por el usuario no es ni la de la mina ni la del tesoro pasará de estar vacía a "x".
          } //if

          System.out.print(" " + cuadricula[indiceFila] [indiceColumna] + " |");
        } //for (indiceColumna = 0; indiceColumna < 5; indiceColumna++)

        System.out.println(" ");        
        
        if (indiceFila < 3) {
          System.out.println("  ├───┼───┼───┼───┼───┤");
        } else {
          System.out.println("  └───┴───┴───┴───┴───┘");
        } //if
      } //for (indiceColumna = 0; indiceColumna < 5; indiceColumna++)

      System.out.print("    ");

      for (indiceColumna = 0; indiceColumna < 5; indiceColumna++) {
        System.out.print(indiceColumna + "   ");
      } 

      System.out.print("x");

      System.out.println(" ");
      System.out.println(" ");

      if ((finDelJuego) && (numEstado == 0)) {
        System.out.println(estado[numEstado]); //si se encontró la mina se mostrará la posición del array estado que corresponde a ese texto.
        System.out.println(estado[4]); //también se mostrará el mensaje de que el jugador ha perdido de la misma manera.
      } else if ((finDelJuego) && (numEstado == 1)) {
        System.out.println(estado[numEstado]); // se el jugador encontró el tesoro se mostrará la posición del array estado correspondiente
      } else if ((!finDelJuego) && ((coordenadaX - posicionMinaX >= -1) && (coordenadaX - posicionMinaX <= 1) && (coordenadaY - posicionMinaY >= -1) && (coordenadaY - posicionMinaY <= 1))) {
        System.out.println(estado[2]); 
        //si el jugador ha consultado una posición que se encuentra a una casilla de la mina 
        //(la resta entre la coordenada introducida y la posición de la mina en la fila/columna está entre -1 y 1, ambos incluidos) 
        //se mostrará el correspondiente mensaje.
      } //if

      System.out.println(" ");

      intentos--;
    } //while ((!finDelJuego) && (intentos > 0))

    //si el jugador se ha quedado sin intentos antes de encontrar el tesoro o la mina se mostrará el correspodinte mensaje y el mensaje de la derrota.
    if ((intentos == 0) && (!finDelJuego)) {
      System.out.println(estado[3]);
      System.out.println(estado[4]);
    } //if 
  }
}