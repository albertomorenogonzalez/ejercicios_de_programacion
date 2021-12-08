/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 * array resultante.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio11AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE 10 NÚMEROS POR TECLADO, LOS MUESTRA Y LUEGO VUELVE A MOSTRARLOS PERO PONIENDO PRIMERO A LOS PRIMOS");
    System.out.println("---------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [10];

    int indice;

    int entreNumero = 0;

    int[] numeroPrimo = new int [10];
    int[] numeroNoPrimo = new int [10];

    int indice2 = 0;
    int contadorPrimos = 0;

    int indice3 = 0;
    int contadorNoPrimos = 0;

    System.out.println("Introduzca 10 números:");

    for (indice = 0; indice < 10; indice++) {
      System.out.print("> ");
      numero[indice] = Integer.parseInt(System.console().readLine());

      for (entreNumero = 2; ((entreNumero < numero[indice]) && ((numero[indice] % entreNumero) != 0)); entreNumero++) { }
    
      if ((entreNumero == numero[indice]) || (numero[indice] == 1) || (numero[indice] == 2)) {
        numeroPrimo[indice2] = numero[indice];
        indice2++;
        contadorPrimos++;
      } else {
        numeroNoPrimo[indice3] = numero[indice];
        indice3++;
        contadorNoPrimos++;
      }
    }

    System.out.println(" ");
    System.out.println(" ");

    System.out.printf("%-6s %-1s   %-5s\n" ,"Índice" ,"|" ,"Valor");

    for (indice = 0; indice < 10; indice++) {
      System.out.println("--------------------");
      System.out.printf("%6d %-1s %10d\n" ,indice ,"|" ,numero[indice]);
    }

    System.out.println("--------------------");

    System.out.println(" ");
    System.out.println(" ");

    System.out.printf("%-6s %-1s   %-5s\n" ,"Índice" ,"|" ,"Valor");

    for (indice2 = 0; indice2 < contadorPrimos; indice2++) {
      System.out.println("--------------------");
      System.out.printf("%6d %-1s %10d\n" ,indice2 ,"|" ,numeroPrimo[indice2]);
    }

    for (indice3 = contadorPrimos; indice3 < (contadorNoPrimos + contadorPrimos); indice3++) {
      System.out.println("--------------------");
      System.out.printf("%6d %-1s %10d\n" ,indice3 ,"|" ,numeroNoPrimo[indice3 - contadorNoPrimos]);
    }

    System.out.println("--------------------");
  }
}