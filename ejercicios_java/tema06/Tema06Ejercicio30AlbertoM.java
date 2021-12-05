/**
 * El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
 * Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
 * le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
 * con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
 * una cuestión de física elemental, ninguno de los animales puede coincidir
 * en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
 * que como mínimo serán de 4 unidades.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio30AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA POR PANTALLA UNA PECERA CON UN PEZ, UN CABALLITO DE MAR Y UNA CARACOLA DENTRO");
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int anchura = 0;
    int altura = 0;

    while (anchura < 4) {
      System.out.println("Introduzca la anchura de la pecera, por favor (mínimo 4): ");
      System.out.print("> ");
      anchura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    }

    while (altura < 4) {
      System.out.println("Introduzca ahora la altura de la pecera, por favor (mínimo 4):");
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    }

    int linea = 1;
    int posicion = 0;

    int posicionPez = ((int)(Math.random() * ((altura - 2) * (anchura - 2))));

    int posicionCaballito = posicionPez;
    while (posicionCaballito == posicionPez) {
      posicionCaballito = ((int)(Math.random() * ((altura - 2) * (anchura - 2))));
    }

    int posicionCaracola = posicionCaballito;
    while ((posicionCaracola == posicionPez) || (posicionCaracola == posicionCaballito)) {
      posicionCaracola = ((int)(Math.random() * ((altura - 2) * (anchura - 2))));
    }
    
    while (linea <= altura) {
      
      for (int longLinea = 1; longLinea <= anchura; longLinea++) {
        if ((linea == 1) || (linea == altura)) {
          System.out.print("* ");
        } else {
            if ((longLinea == 1) || (longLinea == anchura)) {
              System.out.print("* ");
            } else {
              if (posicion == posicionPez) {
                System.out.print("& ");
              } else if (posicion == posicionCaballito) {   
                System.out.print("$ ");
              } else if (posicion == posicionCaracola) {
                System.out.print("@ ");
              } else {
                System.out.print("  ");
              }
              posicion++;
            }
        }
      }
      
      System.out.println(" ");
      
      linea++;
    }
  }
} 