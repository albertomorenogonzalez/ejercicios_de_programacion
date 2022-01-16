/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio09AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE 8 NÚMEROS Y DICE CUAL ES PAR O IMPAR");
    System.out.println("-------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [8];

    int indice;

    System.out.println("Introduzca ocho números:");
    for (indice = 0; indice < 8; indice++) {
      System.out.print("> ");
      numero[indice] = Integer.parseInt(System.console().readLine());
    }

    System.out.println(" ");

    for (indice = 0; indice < 8; indice++) {
      if ((numero[indice] % 2) == 0) {
        System.out.print(numero[indice] + "-Par  ");
      } else {
        System.out.print(numero[indice] + "-Impar  ");
      }
    }
  }
}