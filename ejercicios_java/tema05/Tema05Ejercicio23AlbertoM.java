/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio23AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL TOTAL, LOS NÚMEROS INTRODUCIDOS Y LA MEDIA DE LOS NÚMEROS INTRODUCIDOS MIENTRAS NO SUMEN ENTRE ELLLOS MÁS DE 10000");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.println(" ");
    
    int numeroSumandos = 1;
    
    double sumatorio = 0;
    
    double media = 0;
    
    for (double numero = 0; sumatorio < 10000;) {
      System.out.print("> ");
      numero = Double.parseDouble(System.console().readLine());
      System.out.println(" ");
      
      sumatorio = numero + sumatorio;
      
      if (sumatorio < 10000) {
        System.out.println("Introduzca otro número, por favor: ");
        
        numeroSumandos++;
      }
      
      media = (sumatorio / numeroSumandos);
    }
    
    System.out.println(" ");
    System.out.println("El total acumulado es de " + sumatorio);
    System.out.println(" ");
    System.out.println("Ha introducido " + numeroSumandos + " números.");
    System.out.println(" ");
    System.out.println("La media entre los números introducidos es de " + media);
    
  }
}
