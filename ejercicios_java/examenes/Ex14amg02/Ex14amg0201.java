/**
 * 1. Un comerciante tiene que cruzar el río para llevar su producto al mercado. Tiene un zorro, una
 * gallina y un saco de maíz. El zorro no puede viajar con la gallina porque se la comería y la
 * gallina no puede viajar con el maíz porque se lo comería igualmente.
 * Escribe un programa que pinte un barco con el tamaño de eslora que indique el usuario
 * (mayor o igual a 3). Sobre la cubierta del barco deben situarse, de forma aleatoria, el
 * comerciante (C) junto con productos que sean compatibles, es decir, que no se coman el uno
 * al otro. Por tanto, las opciones viables serán dos: o bien el comerciante (C) con el zorro (Z) y
 * el maíz (M), o bien el comerciante (C) con la gallina (G) únicamente.
 *
 * @author Alberto Moreno González
 * 
 * 14/12/2021
 */
public class Ex14amg0201 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UN BARCO PARA AYUDAR A CRUZAR EL RÍO");
    System.out.println("--------------------------------------------------------");
    System.out.println(" ");

    int eslora = 0;

    System.out.println("Introduzca la eslora del barco (núm. entero mayor o igual a 3): ");
    System.out.print("> ");
    eslora = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int linea = 1;
    int posicion = 0;

    int situacionesPosibles = ((int)(Math.random() * 2));

    int posicionComerciante = ((int)(Math.random() * eslora));
    int posicionZorro = posicionComerciante;
    int posicionGallina = posicionComerciante;

    switch (situacionesPosibles) {
      case 0:
        while (posicionZorro == posicionComerciante) {
          posicionZorro = ((int)(Math.random() * eslora));
        }
        
        int posicionSaco = posicionZorro;
        while (posicionSaco == posicionZorro) {
          posicionSaco = ((int)(Math.random() * eslora));
        }

        for (int longLinea = 1; longLinea <= eslora; longLinea++) {
          if (posicion == posicionComerciante) {
            System.out.print("C");
          } else if (posicion == posicionZorro) {
            System.out.print("Z");
          } else if (posicion == posicionSaco) {
            System.out.print("M");
          } else {
            System.out.print(" ");
          } // if

          posicion++;
        } // for

        break;
      case 1:
        while (posicionGallina == posicionComerciante) {
          posicionGallina = ((int)(Math.random() * eslora));
        }

        for (int longLinea = 1; longLinea <= eslora; longLinea++) {
          if (posicion == posicionComerciante) {
            System.out.print("C");
          } else if (posicion == posicionGallina) {
            System.out.print("G");
          } else {
            System.out.print(" ");
          } // if

          posicion++;
        } // for

        break;
      default:

    } // switch

    System.out.println(" ");

    while (linea <= 2) {
      for (int longLinea = 1; longLinea <= eslora; longLinea++) {
        System.out.print("*");
      }

      System.out.println(" ");

      System.out.print(" ");

      linea++;
      eslora -= 2;
    } // while
  }
}