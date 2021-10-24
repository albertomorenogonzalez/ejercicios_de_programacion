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
    String car = System.console().readLine();
    System.out.println(" ");
    
    System.out.println("Introduzca hacia donde quiere que apunte el vértice de la pirámide, por favor:");
    System.out.println("                            (->, <-, up o down)                               ");
    System.out.print("> ");
    String dirver = System.console().readLine();
    System.out.println(" ");
    
    if ("->".equals(dirver)) {
      System.out.println(car);
      System.out.println(car + " " + car);
      System.out.println(car + " " + car + " " + car);
      System.out.println(car + " " + car + " " + car + " " + car);
      System.out.println(car + " " + car + " " + car + " " + car + " " + car);
      System.out.println(car + " " + car + " " + car + " " + car);
      System.out.println(car + " " + car + " " + car);
      System.out.println(car + " " + car);
      System.out.println(car);
    } else if ("<-".equals(dirver)) {
        System.out.println("         " + car);
        System.out.println("      " + car + " " +  car);
        System.out.println("    " + car + " " + car + " " + car);
        System.out.println("  " + car + " " + car + " " + car + " " + car);
        System.out.println(car + " " + car + " " + car + " " + car + " " + car);
        System.out.println("  " + car + " " + car + " " + car + " " + car);
        System.out.println("    " + car + " " + car + " " + car);
        System.out.println("      " + car + " " +  car);
        System.out.println("         " + car);
    } else if ("up".equals(dirver)) {
        System.out.println("    " + car + "    ");
        System.out.println("   " + car + car + car + "   ");
        System.out.println("  " + car + car + car + car + car + "   ");
        System.out.println(" " + car + car + car + car + car + car + car + " ");
        System.out.println(car + car + car + car + car + car + car + car + car);
    } else if ("down".equals(dirver)) {
        System.out.println(car + car + car + car + car + car + car + car + car);
        System.out.println(" " + car + car + car + car + car + car + car + " ");
        System.out.println("  " + car + car + car + car + car + "   ");
        System.out.println("   " + car + car + car + "   ");
        System.out.println("    " + car + "    ");
    } else {
        System.out.println("Introduzca correctamente los parámetros, por favor.");
    }
  }
}
