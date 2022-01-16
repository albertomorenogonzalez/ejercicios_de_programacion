/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
 * números están entre 0 y 9. El programa deberá colocar el número de la posición
 * inicial en la posición final, rotando el resto de números para que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio12AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE 10 NÚMEROS POR TECLADO, LOS MUESTRA Y LUEGO PIDE DOS POSICIONES (INICIAL Y FINAL) PARA MOSTRAR EL NÚMERO DE LA POSICIÓN INICAL EN LA POSICIÓN FINAL");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [10];

    int indice;

    System.out.println("Introduzca 10 números:");

    for (indice = 0; indice < 10; indice++) {
      System.out.print("> ");
      numero[indice] = Integer.parseInt(System.console().readLine());
    }

    System.out.println(" ");
    System.out.println(" ");

    System.out.printf("%-6s %-1s   %-5s\n" ,"Índice" ,"|" ,"Valor");

    for (indice = 0; indice < 10; indice++) {
      System.out.println("--------------------");
      System.out.printf("%6d %-1s %10d\n" ,indice ,"|" ,numero[indice]);
    }

    System.out.println("--------------------");

    int[] resultado = new int [10];

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("Introduzca la posición (índice) inicial del número que quiere cambiar de posición:");
    System.out.print("> ");
    int posInicial = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Introduzca la posición final a donde quiere mover el número (debe ser mayor que la posición inicial):");
    System.out.print("> ");
    int posFinal = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println(" ");

    if ((posInicial < posFinal) && (posInicial >= 0) && (posInicial < 10) && (posFinal >= 0) && (posFinal < 10)) {
      System.out.printf("%-6s %-1s   %-5s\n" ,"Índice" ,"|" ,"Valor");

      indice = 0;

      for (indice = 0; indice < 10; indice++) {
        resultado[posFinal] = numero[posInicial];

        if (((indice <= posInicial) && (indice != 0)) || (indice > posFinal)) {
          resultado[indice] = numero[(indice - 1)];
        } else if (indice == 0) {
          resultado[0] = numero[9];
        } else if (indice != posFinal) {
          resultado[indice] = numero[indice];
        }
        
        System.out.println("--------------------");
        System.out.printf("%6d %-1s %10d\n" ,indice ,"|" ,resultado[indice]);
      }
  
      System.out.println("--------------------");
    } else {
      System.out.print("Los datos introducidos no son correctos. Por favor, reinicie el programa e introdúzcalos correctamente.");
    }
  }
}