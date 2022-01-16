/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio03AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE LEE 10 NÚMEROS POR TECLADO Y LUEGO LOS MUESTRA EN ORDEN INVERSO");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [10];

    int indice;

    for (indice = 0; indice < 10; indice++) {
      System.out.print("> ");
      numero[indice] = Integer.parseInt(System.console().readLine());
    }

    System.out.println(" ");

    for (indice = 9; indice >= 0; indice--) {
      System.out.print(numero[indice] + " ");
    }
  }
}
