/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio27AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PIEDRA, PAPEL O TIJERAS");
    System.out.println("------------------------");
    System.out.println(" ");
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    System.out.print("> ");
    String turno1 = (System.console().readLine().toLowerCase());
    System.out.println(" ");

    int numTurno2 = ((int)(Math.random() * 3));
    String turno2 = " ";
    switch (numTurno2) {
      case 0:
        turno2 = "piedra";
        break;
      case 1:
        turno2 = "papel";
        break;
      case 2:
        turno2 = "tijeras";
        break;
      default:

    }
    
    switch (turno1) {
      case "piedra":
        System.out.println("Turno del jugador 2: ");
        System.out.println("> " + turno2);
        System.out.println(" ");

        if ("piedra".equals(turno2)) {
          System.out.println("Empate");
        } else if ("papel".equals(turno2)) {
            System.out.println("Gana el jugador 2");
        } else if ("tijeras".equals(turno2)) {
            System.out.println("Gana el jugador 1");
        } 
        break;
      case "papel":
        System.out.println("Turno del jugador 2: ");
        System.out.println("> " + turno2);
        System.out.println(" ");

        if ("piedra".equals(turno2)) {
          System.out.println("Gana el jugador 1");
        } else if ("papel".equals(turno2)) {
            System.out.println("Empate");
        } else if ("tijeras".equals(turno2)) {
            System.out.println("Gana el jugador 2");
        } 
        break;
      case "tijeras":
        System.out.println("Turno del jugador 2: ");
        System.out.println("> " + turno2);
        System.out.println(" ");

        if ("piedra".equals(turno2)) {
          System.out.println("Gana el jugador 2");
        } else if ("papel".equals(turno2)) {
            System.out.println("Gana el jugador 1");
        } else if ("tijeras".equals(turno2)) {
            System.out.println("Empate");
        } 
        break;
      default:
        System.out.println("Introduzca correctamente los datos.");
    }
  }
} 