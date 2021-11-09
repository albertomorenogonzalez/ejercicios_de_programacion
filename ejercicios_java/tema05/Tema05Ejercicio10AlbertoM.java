/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio10AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA LA MEDIA DE UN CONJUNTO DE NÚMEROS POSITIVOS INTRODUCIDOS POR TECLADO");
    System.out.println("-------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.println(" ");
    System.out.println("Para dejar de introducir números, introduzca un número negativo.");
    System.out.println(" ");
    
    int numeroSumandos = 0;
    
    double sumatorio = 0;
    
    for (double numero = 0; numero >= 0; numeroSumandos++) {
      System.out.print("> ");
      numero = Double.parseDouble(System.console().readLine());
      System.out.println(" ");
      
      if (numero >= 0) {
        sumatorio = numero + sumatorio;
        System.out.println("Introduzca otro número, por favor: ");
      } else {
          double media = (sumatorio / numeroSumandos);
    
          System.out.println("La media entre los números introducidos es de " + media);
      }
    }
    
    
  }
}
