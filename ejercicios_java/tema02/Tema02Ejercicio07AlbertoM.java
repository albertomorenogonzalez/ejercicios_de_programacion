/**
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 * mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 * de Java (con un solo println) ¿es posible?
 * 
 * Si, es posible, tal y como se muestra a continuación.
 *
 * @author Alberto Moreno González
 */
public class Tema02Ejercicio07AlbertoM {
  public static void main(String[] args) {
    String texto1 = "Las tres primeras letras ";
    String texto2 = "del abecedario ";
    String texto3 = "son: ";
    char letra1 = 'a';
    String texto4 = ", ";
    char letra2 = 'b';
    String texto5 = " y ";
    char letra3 = 'c';
    String dot = ".";
    
    System.out.println(texto1 + texto2 + texto3 + letra1 + texto4 + letra2 + texto5 + letra3 + dot);
  }
}
