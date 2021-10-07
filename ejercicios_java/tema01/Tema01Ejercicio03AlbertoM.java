/**
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
 * correspondiente traducción al castellano. Las palabras deben estar distribuidas
 * en dos columnas y alineadas a la izquierda.
 *
 *
 * @author Alberto Moreno González
 */
public class Tema01Ejercicio03AlbertoM {
  public static void main(String[] args) {
    System.out.println("Inglés       Español");
    System.out.println("---------------------");
    System.out.printf("%-10s   %-10s\n", "tap", "pestaña");
    System.out.printf("%-10s   %-10s\n", "esquina", "corner");
    System.out.printf("%-10s   %-10s\n", "ant", "hormiga");
    System.out.printf("%-10s   %-10s\n", "mouse", "ratón");
    System.out.printf("%-10s   %-10s\n", "key", "clave");
    System.out.printf("%-10s   %-10s\n", "ball", "pelota");
    System.out.printf("%-10s   %-10s\n", "bird", "pájaro");
    System.out.printf("%-10s   %-10s\n", "page", "página");
    System.out.printf("%-10s   %-10s\n", "throw", "lanzar");
    System.out.printf("%-10s   %-10s\n", "goal", "meta");
  }
}

