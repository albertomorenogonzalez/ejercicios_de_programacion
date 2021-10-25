/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio15AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA UNA PIRÁMIDE DEL CARACTER QUE ELIJAS");
    System.out.println("---------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un caracter, por favor: ");
    System.out.print("> ");
    String caracter = System.console().readLine();
    System.out.println(" ");
    
    System.out.println("Introduzca hacia donde quiere que apunte el vértice de la pirámide, por favor:");
    System.out.println("                            (->, <-, up o down)                               ");
    System.out.print("> ");
    String direccionVertice = System.console().readLine();
    System.out.println(" ");
    
    if ("->".equals(direccionVertice)) {
      System.out.println(caracter);
      System.out.println(caracter + " " + caracter);
      System.out.println(caracter + " " + caracter + " " + caracter);
      System.out.println(caracter + " " + caracter + " " + caracter + " " + caracter);
      System.out.println(caracter + " " + caracter + " " + caracter + " " + caracter + " " + caracter);
      System.out.println(caracter + " " + caracter + " " + caracter + " " + caracter);
      System.out.println(caracter + " " + caracter + " " + caracter);
      System.out.println(caracter + " " + caracter);
      System.out.println(caracter);
    } else if ("<-".equals(direccionVertice)) {
        System.out.println("        " + caracter);
        System.out.println("      " + caracter + " " +  caracter);
        System.out.println("    " + caracter + " " + caracter + " " + caracter);
        System.out.println("  " + caracter + " " + caracter + " " + caracter + " " + caracter);
        System.out.println(caracter + " " + caracter + " " + caracter + " " + caracter + " " + caracter);
        System.out.println("  " + caracter + " " + caracter + " " + caracter + " " + caracter);
        System.out.println("    " + caracter + " " + caracter + " " + caracter);
        System.out.println("      " + caracter + " " +  caracter);
        System.out.println("        " + caracter);
    } else if ("up".equals(direccionVertice)) {
        System.out.println("    " + caracter + "    ");
        System.out.println("   " + caracter + caracter + caracter + "   ");
        System.out.println("  " + caracter + caracter + caracter + caracter + caracter + "   ");
        System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter + " ");
        System.out.println(caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
    } else if ("down".equals(direccionVertice)) {
        System.out.println(caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter + " ");
        System.out.println("  " + caracter + caracter + caracter + caracter + caracter + "   ");
        System.out.println("   " + caracter + caracter + caracter + "   ");
        System.out.println("    " + caracter + "    ");
    } else {
        System.out.println("Introduzca correctamente los parámetros, por favor.");
    }
  }
}
