/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio07AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA 100 NÚMEROS, TE PIDE LUEGO DOS VALORES, E INTERCAMBIA EL PRIMERO POR EL SEGUNDO EN ESA LISTA DE NÚMEROS");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [100];

    int indice;

    for (indice = 0; indice < 100; indice++) {
      numero[indice] = ((int)(Math.random() * 21));

      System.out.print(numero[indice] + " ");
    }

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("Introduzca un número: ");
    System.out.print("> ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Introduzca otro número: ");
    System.out.print("> ");
    int numero2 = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    for (indice = 0; indice < 100; indice++) {
      if (numero[indice] == numero1) {
        System.out.print("*" + numero2 + "* ");
      } else {
        System.out.print(numero[indice] + " ");
      }
    }
  }
}