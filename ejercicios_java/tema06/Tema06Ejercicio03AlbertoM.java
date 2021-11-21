/**
 * gual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
* de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio03AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA UNA CARTA DE LA BARAJA ESPAÑOLA");
    System.out.println("-----------------------------------------------------");
    System.out.println(" ");

    int numPalo = ((int)(Math.random()*4) + 1);
    String palo = " ";
    switch (numPalo) {
      case 1:
        palo = "bastos";
        break;
      case 2:
        palo = "espadas";
        break;
      case 3:
        palo = "copas";
        break;
      case 4:
        palo = "oros";
        break;
      default:
    }


    int numCarta = ((int)(Math.random()*10) + 1);
    String carta = " ";
    switch (numCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "sota";
        break;
      case 9:
        carta = "caballo";
        break;
      case 10:
        carta = "rey";
        break;
      default:
        carta = String.valueOf(numCarta);
    }

    if (numCarta == 8) {
      System.out.println("Ha salido la " + carta + " de " + palo + ".");
    } else  {
      System.out.println("Ha salido el " + carta + " de " + palo + ".");
    }
  }
}


