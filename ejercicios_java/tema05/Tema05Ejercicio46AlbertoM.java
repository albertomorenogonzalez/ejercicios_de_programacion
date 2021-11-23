/**
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio46AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA POR PANTALLA UN RECTÁNGULO DE ASTERÍSCOS");
    System.out.println("------------------------------------------------------------");
    System.out.println(" ");

    int anchura = 0;
    int altura = 0;

    while ((altura < 2) || (anchura < 2)) {
      System.out.println("Introduzca la anchura del rectángulo, por favor (mínimo 2): ");
      System.out.print("> ");
      anchura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      System.out.println("Introduzca ahora la altura del rectángulo, por favor (mínimo 2):");
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      if ((altura < 2) || (anchura < 2)) {
        System.out.println("Introduzca correctamente los datos");
        System.out.println(" ");
      }
    }
    
    int linea = 1;
    
    while (linea <= altura) {
      
      for (int longLinea = 1; longLinea <= anchura; longLinea++) {
        if ((linea == 1) || (linea == altura)) {
          System.out.print("* ");
        } else {
            if ((longLinea == 1) || (longLinea == anchura)) {
              System.out.print("* ");
            } else {
              System.out.print("  ");
            }
        }
      }
      
      System.out.println(" ");
      
      linea++;
    }
  }
} 
