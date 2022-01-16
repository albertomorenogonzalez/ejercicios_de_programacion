/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio10AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA 20 NÚMEROS ALEATORIOS ENTRE EL 0 Y EL 100, LUEGO MUESTRA PRIMERO LOS PARES Y LUEGO LOS IMPARES");
    System.out.println("-------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [20];

    int indice;

    for (indice = 0; indice < 20; indice++) {
      numero[indice] = ((int)(Math.random() * 101));
      System.out.print(numero[indice] + " ");
    }

    System.out.println(" ");
    System.out.println(" ");

    int[] numeroImpar = new int [20];

    int indice2 = 0;
    int contadorImpares = 0;

    for (indice = 0; indice < 20; indice++) {
      if ((numero[indice] % 2) == 0) {
        System.out.print(numero[indice] + " ");
      } else {
        numeroImpar[indice2] = numero[indice];
        indice2++;
        contadorImpares++;
      }
    }

    for (indice2 = 0; indice2 < contadorImpares; indice2++) {
      System.out.print(numeroImpar[indice2] + " ");
    }
  }
}