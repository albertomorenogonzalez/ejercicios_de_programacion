/**
 * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio13AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE QUE RELLENA UN ARRAY DE 100 ELEMENTOS CON NÚMEROS ALEATORIOS ENTRE EL 0 Y EL 500. LUEGO PREGUNTAÁ SI QUIERE DESTACAR EL MÁXIMO O EL MÍMNIMO Y LO HARÁ");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [100];

    int indice;

    int numMayor = 0;
    int numMenor = 0;

    for (indice = 0; indice < 100; indice++) {
      numero[indice] = ((int)(Math.random() * 501));

      System.out.print(numero[indice] + " ");

      if (indice == 1) {
        numMenor = numero[indice];
      } else if (numero[indice] > numMayor) {
        numMayor = numero[indice];
      } else if (numero[indice] < numMenor) {
        numMenor = numero[indice];
      }
    }

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("¿Qué número quiere destacar?");
    System.out.println("1 - Máximo");
    System.out.println("2 - Mínimo");
    System.out.print("> ");
    int numDestacado = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    for (indice = 0; indice < 100; indice++) {
      if (((numDestacado == 1) && (numero[indice] == numMayor)) || ((numDestacado == 2) && (numero[indice] == numMenor))) {
        System.out.print("**" + numero[indice] + "** ");
      } else {
        System.out.print(numero[indice] + " ");
      }
    }
  }
}