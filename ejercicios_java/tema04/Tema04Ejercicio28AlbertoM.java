/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio28AlbertoM {
  public static void main(String[] args) {
    System.out.println("PIEDRA, PAPEL O TIJERAS");
    System.out.println("------------------------");
    System.out.println(" ");
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    System.out.print("> ");
    String turno1 = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    System.out.print("> ");
    String turno2 = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    switch (turno1) {
      case "piedra":
        if ("piedra".equals(turno2)) {
          System.out.println("Empate");
        } else if ("papel".equals(turno2)) {
            System.out.println("Gana el jugador 2");
        } else if ("tijeras".equals(turno2)) {
            System.out.println("Gana el jugador 1");
        } else {
            System.out.println("Introduzca correctamente los datos.");
        }
        break;
      case "papel":
        if ("piedra".equals(turno2)) {
          System.out.println("Gana el jugador 1");
        } else if ("papel".equals(turno2)) {
            System.out.println("Empate");
        } else if ("tijeras".equals(turno2)) {
            System.out.println("Gana el jugador 2");
        } else {
            System.out.println("Introduzca correctamente los datos.");
        }
        break;
      case "tijeras":
        if ("piedra".equals(turno2)) {
          System.out.println("Gana el jugador 2");
        } else if ("papel".equals(turno2)) {
            System.out.println("Gana el jugador 1");
        } else if ("tijeras".equals(turno2)) {
            System.out.println("Empate");
        } else {
            System.out.println("Introduzca correctamente los datos.");
        }
        break;
      default:
        System.out.println("Introduzca correctamente los datos.");
    }
  }
}
