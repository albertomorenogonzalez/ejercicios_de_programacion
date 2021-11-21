/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio02AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA UNA CARTA DE LA BARAJA FRANCESA");
    System.out.println("-----------------------------------------------------");
    System.out.println(" ");

    int numPalo = ((int)(Math.random()*4) + 1);
    String palo = " ";
    switch (numPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
        break;
      default:
    }


    int numCarta = ((int)(Math.random()*13) + 1);
    String carta = " ";
    switch (numCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numCarta);
    }

    if ((numCarta == 11) || (numCarta == 12) || (numCarta == 13)) {
      System.out.println("Ha salido la " + carta + " de " + palo + ".");
    } else  {
      System.out.println("Ha salido el " + carta + " de " + palo + ".");
    }
  }
}


