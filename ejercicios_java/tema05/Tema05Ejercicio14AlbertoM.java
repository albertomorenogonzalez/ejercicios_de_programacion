/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio14AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE UNA BASE Y UN EXPONENTE Y QUE CALCULE LA POTENCIA");
    System.out.println("--------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la base: ");
    System.out.print("> ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca el exponente (entero positivo): ");
    System.out.print("> ");
    int exponente = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    double resultado = 1;
    
    for (int numVecesMultiplica = 0; numVecesMultiplica < exponente; numVecesMultiplica++) {
      resultado = (base * resultado);
    }
    
    System.out.print(base + " elevado a " + exponente + " es igual a ");
    System.out.printf("%.0f" ,resultado);
  }
}
