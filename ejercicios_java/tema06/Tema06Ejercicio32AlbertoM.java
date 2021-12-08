/**
 * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
 * el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
 * del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
 * espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
 * la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
 * Por cada metro de sendero - representado por una línea - puede que haya un
 * obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
 * es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
 * sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
 * O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
 * habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio32AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UN SENDERO ALEATORIO");
    System.out.println("----------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la longitud del sendero, por favor (en metros):");
    System.out.print("> ");
    int longitud = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int metro = 1;

    while (metro <= longitud) {
      if (metro == 1) {
        System.out.print("      ");
      } else {
        int numEspacios = ((int)(Math.random() * 3) + 5);

        for (int espaciosSendero = 1; espaciosSendero <= numEspacios; espaciosSendero++) {
          System.out.print(" "); 
        }
      }

      System.out.print("|");

      for (int interiorSendero = 0; interiorSendero < 4; interiorSendero++) {
        int probObstaculo = ((int)(Math.random() * 4));
        String obstaculo = " ";
        switch (probObstaculo) {
          case 2:
            obstaculo = "*";
            break;
          case 3:
            obstaculo = "O";
            break;
          default:
            obstaculo = " ";
        }

        System.out.print(obstaculo);
      }

      System.out.println("|");

      metro++;
    }
  }
} 