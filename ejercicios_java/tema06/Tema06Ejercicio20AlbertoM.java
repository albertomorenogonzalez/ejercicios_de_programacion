/**
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio20AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA CUBA CON UNA CANTIDAD DE AGUA ALEATORIA POR PANTALLA");
    System.out.println("----------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, indique la capacidad de la cuba en litros: ");
    System.out.print("> ");
    int capacidadCuba = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int linea = 0;

    int agua = ((int)(Math.random() * capacidadCuba));

    int cantidadAgua = 0;

    while (linea <= capacidadCuba) {
      for (int longLinea = 1; longLinea <= 6; longLinea++) {
        if (linea == capacidadCuba) {
          System.out.print("\033[37m*");
        } else {
          if ((longLinea == 1) || (longLinea == 6)) {
            System.out.print("\033[37m*");
          } else {
            if ((linea < agua) || (agua == 0)) {
              System.out.print(" ");
            } else {
              System.out.print("\033[36m=");
              cantidadAgua++;
            }
          }
        }
      }

      System.out.println(" ");

      linea++;
    } //while

    System.out.println(" ");
    System.out.println("La cuba tiene una capacidad de " + capacidadCuba + " en litros y contiene " + (cantidadAgua / 4) + " litros de agua.");
  }
}    