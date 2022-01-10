/**
 * 3.  Escribe un programa que genere un rectángulo de triángulos rectángulos. Los triángulos
 * tienen 4 asteriscos de base y de altura. El ancho y el alto del rectángulo se recoge por teclado
 * y vienen expresados en nº de triángulos. Observa que los triángulos siempre son iguales.
 *
 * @author Alberto Moreno González
 * 
 * 14/12/2021
 */
public class Ex14amg03 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE RELLENA UN RECTÁNGULO DE TRIÁNGULOS RECTÁNGULOS");
    System.out.println("-------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Indique el ancho en triángulos: ");
    System.out.print("> ");
    int anchura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Indique el alto en triángulos: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int lineaTriangulos = 1;
    int linea = 1;

    while (linea <= altura) {
      lineaTriangulos = 1;

      while (lineaTriangulos <= anchura) {
        System.out.print("   * ");

        lineaTriangulos++;
      }

      System.out.println(" ");

      lineaTriangulos = 1;

      while (lineaTriangulos <= anchura) {
        System.out.print("  ** ");

        lineaTriangulos++;
      }

      System.out.println(" ");

      lineaTriangulos = 1;

      while (lineaTriangulos <= anchura) {
        System.out.print(" *** ");

        lineaTriangulos++;
      }

      System.out.println(" ");

      lineaTriangulos = 1;

      while (lineaTriangulos <= anchura) {
        System.out.print("**** ");

        lineaTriangulos++;
      }

      System.out.println(" ");

      linea++;
    } // while
  }
}