/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio04AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DEFINE 3 ARRAYS");
    System.out.println("-----------------------------");
    System.out.println(" ");

    int[] numero = new int [20];
    int[] cuadrado = new int [20];
    int[] cubo = new int [20];

    int indice;

    System.out.printf("%-8s  %-8s     %-8s\n" ,"NÚMERO" ,"CUADRADO" ,"CUBO");

    for (indice = 0; indice < 20; indice++) {
      numero[indice] = ((int)(Math.random() * 101));
      cuadrado[indice] = ((int)Math.pow(numero[indice], 2));
      cubo[indice] = ((int)Math.pow(numero[indice], 3));

      System.out.printf("%4d       %5d     %7d\n" ,numero[indice] ,cuadrado[indice] ,cubo[indice]);
    }
  }
}