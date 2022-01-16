/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio05AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE LEE 10 NÚMEROS POR TECLADO Y LUEGO MUESTRA CUAL ES EL MÁXIMO Y EL MÍNIMO");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [10];

    int numMenor = 0;
    int numMayor = 0;

    int indice;

    System.out.println("Introduzca diez números:");
    
    for (indice = 0; indice < 10; indice++) {
      System.out.print("> ");
      numero[indice] = Integer.parseInt(System.console().readLine());

      if (indice == 1) {
        numMenor = numero[indice];
      } else if (numero[indice] > numMayor) {
        numMayor = numero[indice];
      } else if (numero[indice] < numMenor) {
        numMenor = numero[indice];
      }
    }

    System.out.println(" ");

    for (indice = 0; indice < 10; indice++) {
      if (numero[indice] == numMayor) {
        System.out.print(numero[indice] + "-Máximo  ");
      } else if (numero[indice] == numMenor) {
        System.out.print(numero[indice] + "-Mínimo  ");
      } else {
        System.out.print(numero[indice] + "  ");
      }
    }
  }
}