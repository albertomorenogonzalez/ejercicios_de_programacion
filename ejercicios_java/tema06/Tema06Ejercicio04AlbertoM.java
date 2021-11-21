/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio04AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA 20 NÚMEROS ALEATORIOS ENTRE EL 0 Y EL 10");
    System.out.println("--------------------------------------------------------------");
    System.out.println(" ");
    
    for (int contador = 0; contador < 20; contador++) {
      int numero = (int)(Math.random()*11);
      System.out.print(numero + " ");
    }
  }
}


