/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio05AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA 50 NÚMEROS ALEATORIOS ENTRE EL 100 Y EL 199, EL MÁXIMO, EL MÍNIMO Y LA MEDIA DE LOS NÚMEROS INTRODUCIDOS");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    int sumatorio = 0;
    int numMayor = 0;
    int numMenor = 199;
    int contador = 0;

    while (contador < 50) {
      int numero = ((int)(Math.random()*100) + 100);
      System.out.print(numero + " ");

      if (numero > numMayor) {
        numMayor = numero;
      }

      if (numero < numMenor) {
        numMenor = numero;
      }

      sumatorio = (numero + sumatorio);
      contador++;
    }

    int media = (sumatorio / contador);

    System.out.println(" ");
    System.out.println("El mayor número es " + numMayor);
    System.out.println("El menor número es " + numMenor);
    System.out.println("La media de todos ellos es " + media);
  }
}


