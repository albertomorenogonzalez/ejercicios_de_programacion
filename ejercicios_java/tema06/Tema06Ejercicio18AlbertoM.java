/**
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio18AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA POR PANTALLA UN RECTÁNGULO DE ASTERÍSCOS");
    System.out.println("------------------------------------------------------------");
    System.out.println(" ");

    int anchura = 0;
    int altura = 0;

    System.out.println("Introduzca la anchura del rectángulo, por favor (mínimo 4): ");
    System.out.print("> ");
    anchura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Introduzca ahora la altura del rectángulo, por favor (mínimo 4):");
    System.out.print("> ");
    altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int linea = 1;
    int posicion = 0;
    int posicionPez = ((int)(Math.random() * ((altura - 2) * (anchura - 2))));
    
    while (linea <= altura) {
      
      for (int longLinea = 1; longLinea <= anchura; longLinea++) {
        if ((linea == 1) || (linea == altura)) {
          System.out.print("\033[37m* ");
        } else {
            if ((longLinea == 1) || (longLinea == anchura)) {
              System.out.print("\033[37m* ");
            } else {
              if (posicion == posicionPez) {
                  System.out.print("🐟");
              } else {   
                  System.out.print("\033[96m■");
              }
              System.out.print(" ");
              posicion++;
            }
        }
      }
      
      System.out.println(" ");
      
      linea++;
    }
  }    
}