/**
 * Realiza un programa que sea capaz de recolocar los números de un array de
 * fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
 * del array. A continuación generará un array con ese tamaño con números
 * enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
 * irá colocando desde fuera hacia adentro los números de tal forma que el
 * primero se coloca en la primera posición, el segundo en la última, el tercero
 * en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
 * antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
 * el array resultado.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio22AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA CAPAZ DE RECOLOCAR LOS NÚMEROS DE UN ARRAY DE FUERA HACIA DENTRO");
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(" ");

    // establecemos la longitud del array
    System.out.println("Introduzca el tamaño de array:");
    System.out.print("> ");
    int numTotalArray = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int[] numero = new int [numTotalArray];

    int[] numerosHaciaDentro = new int [numTotalArray];
    int indice2 = 0;
    int contadorNumHacDen = 0;

    int[] numerosHaciaFuera = new int [numTotalArray];
    int indice3 = 0;
    int contadorNumHacFue = 0;

    int indice;

    System.out.println("Array original:");

    // introducimos valores y mostramos el array original
    for (indice = 0; indice < numTotalArray; indice++) {
      numero[indice] = ((int)(Math.random() * 201));

      // el número de la posición 0 se deja donde está. Separamos los números de posiciones pares y los números de posiciones impares en dos arrays distintos
      switch(indice) {
        case 0:

          break;
        default:
          if ((indice % 2) == 0) {
            numerosHaciaDentro[indice2] = numero[indice];
            indice2++;
            contadorNumHacDen++;
          } else {
            numerosHaciaFuera[indice3] = numero[indice];
            indice3++;
            contadorNumHacFue++;
          }
      } // switch

      System.out.print(numero[indice] + " ");
    } // for

    System.out.println(" ");

    System.out.println("Resultado:");

    // mostramos el resultado
    // mostramos primero el primer valor del array, que es invariable
    System.out.print(numero[0] + " ");

    // luego empezamos a mostrar los números pares en orden ascendente (menor a mayor)
    for (indice = 0; indice < contadorNumHacDen; indice++) {
      System.out.print(numerosHaciaDentro[indice] + " ");
    } 

    // después mostramos los números impares en orden descendente (mayor a menor)
    for (indice = (contadorNumHacFue - 1); indice >= 0; indice--) {
      System.out.print(numerosHaciaFuera[indice] + " ");
    }
  }
} 