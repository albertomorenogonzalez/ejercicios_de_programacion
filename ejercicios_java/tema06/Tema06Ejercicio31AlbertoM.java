/**
 * Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 * partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 * 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
 * si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
 * suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
 * da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
 * entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
 * ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
 * pierde. Si sale otro número, tiene que seguir tirando.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio31AlbertoM { 
  public static void main(String[] args) {
    System.out.println("CRAPS");
    System.out.println("------");
    System.out.println(" ");

    int dado = 0;

    System.out.println("Introduzca la cantidad que quiere apostar, por favor (en €):");
    System.out.print("> ");
    int cantidadApostada = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int sumaDados = 0;

    for (int numTiradas = 0; numTiradas < 2; numTiradas++) {
      dado = ((int)(Math.random()*6) + 1);
      switch (dado) {
        case 1:
          System.out.print("⚀-1 ");
          break;
        case 2:
          System.out.print("⚁-2 ");
          break;
        case 3:
          System.out.print("⚂-3 ");
          break;
        case 4:
          System.out.print("⚂-4 ");
          break;
        case 5:
          System.out.print("⚃-5 ");
          break;
        case 6:
          System.out.print("⚅-6 ");
          break;
        default:

      }

      sumaDados = sumaDados + dado;
    }

    System.out.println(" ");

    switch (sumaDados) {
      case 2:
        System.out.println("¡Que lástima!, ha perdido todo su dinero.");
        break;
      case 3:
        System.out.println("¡Que lástima!, ha perdido todo su dinero.");
        break;
      case 7:
        System.out.println("¡Enhorabuena! Ha doblado lo que ha apostado.");
        System.out.println("Cantidad apostada: " + cantidadApostada + " €");
        System.out.println("Cantidad ganada: " + cantidadApostada + " €");
        System.out.println("Cantidad ganada: " + (cantidadApostada * 2) + " €");
        break;
      case 11:
        System.out.println("¡Enhorabuena! Ha doblado lo que ha apostado.");
        System.out.println("Cantidad apostada: " + cantidadApostada + "€");
        System.out.println("Cantidad ganada: " + cantidadApostada + "€");
        System.out.println("Cantidad ganada: " + (cantidadApostada * 2) + "€");
        break;
      case 12:
        System.out.println("¡Que lástima!, ha perdido todo su dinero.");
        break;
      default:
        System.out.println("Para ganar, ahora debe sacar el mismo número de nuevo, si saca el siete, pierde. Si sale otro número, siga tirando");
        System.out.println(" ");

        int sumaDados2 = 0;;

        while ((sumaDados2 != sumaDados) && (sumaDados2 != 7)) {
          sumaDados2 = 0;

          for (int numTiradas2 = 0; numTiradas2 < 2; numTiradas2++) {
            int dado2 = ((int)(Math.random()*6) + 1);
            switch (dado2) {
              case 1:
                System.out.print("⚀-1 ");
                break;
              case 2:
                System.out.print("⚁-2 ");
                break;
              case 3:
                System.out.print("⚂-3 ");
                break;
              case 4:
                System.out.print("⚂-4 ");
                break;
              case 5:
                System.out.print("⚃-5 ");
                break;
              case 6:
                System.out.print("⚅-6 ");
                break;
              default:
          
            }

            sumaDados2 = sumaDados2 + dado2;
          }

          

          System.out.print(" ");
        }

        if (sumaDados2 == sumaDados) {
          System.out.println(" ");
          System.out.println("¡Enhorabuena! Ha doblado lo que ha apostado.");
          System.out.println("Cantidad apostada: " + cantidadApostada + "€");
          System.out.println("Cantidad ganada: " + cantidadApostada + "€");
          System.out.println("Cantidad ganada: " + (cantidadApostada * 2) + "€");
        } else if (sumaDados2 == 7) {
          System.out.println(" ");
          System.out.println("¡Que lástima!, ha perdido todo su dinero.");
        }
    }
  }
} 