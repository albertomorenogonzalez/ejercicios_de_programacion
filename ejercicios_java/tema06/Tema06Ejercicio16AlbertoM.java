/**
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio16AlbertoM { 
  public static void main(String[] args) {
    System.out.println("SIMULADOR DE MÁQUINA TRAGAPERRAS");
    System.out.println("---------------------------------");
    System.out.println(" ");

    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;

    for (int contadorFiguras = 0; contadorFiguras < 3; contadorFiguras++) {
      int numFigura = ((int)(Math.random() * 5));
      String figura = " ";
        switch (numFigura) {
          case 0:
            figura = "❤️";
            break;
          case 1:
            figura = "💎";
            break;
          case 2:
            figura = "Ω";
            break;
          case 3:
            figura = "🔔";
            break;
          case 4:
            figura = "🍋";
            break;
          default:

        }

      System.out.print(figura + " ");

      if (contadorFiguras == 0) {
        figura1 = numFigura;
      } else if (contadorFiguras == 1) {
        figura2 = numFigura;
      } else {
        figura3 = numFigura;
      }
    }

    System.out.println(" ");

    if ((figura1 == figura2) && (figura1 == figura3)) {
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    } else if ((figura1 == figura2) || (figura2 == figura3) || (figura1 == figura3)) {
      System.out.println("Bien, ha recuperado su moneda.");
    } else {
      System.out.println("Lo siento, ha perdido.");
    }
  }    
}