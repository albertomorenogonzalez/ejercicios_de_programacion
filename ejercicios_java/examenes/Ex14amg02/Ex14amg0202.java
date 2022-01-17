/**
 * 2.  Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios
 * comprendidos entre 1 y 999 (ambos incluidos). A continuación el programa mostrará el array y
 * preguntará al usuario qué filtro quiere aplicar. Los filtros disponibles son tres: números pares,
 * números primos y números capicúa.
 *
 * @author Alberto Moreno González
 * 
 * 14/12/2021
 */
public class Ex14amg0202 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE RELLENA UN ARRAY DE 20 ELEMENTOS CON NÚMEROS ALATORIOS ENTRE 1 Y 999 Y AL QUE LUEGO PUEDES APLICARLE UN FILTRO");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [20];

    int indice;

    for (indice = 0; indice < 20; indice++) {
      numero[indice] = ((int)(Math.random() * 999) + 1);

      System.out.print(numero[indice] + " ");
    }

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("¿Qué filtro quieres aplicar?:");
    System.out.println("1 - Pares");
    System.out.println("2 - Primos");
    System.out.println("3 - Capicúas");
    System.out.print("> ");
    int filtro = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Los números filtrados son los siguientes:");

    switch (filtro) {
      case 1:
        for (indice = 0; indice < 20; indice++) {
          if ((numero[indice] % 2) == 0) {
            System.out.print(numero[indice] + " ");
          }
        } // for
        break;
      case 2:
        for (indice = 0; indice < 20; indice++) {
          int entreNumero = 0;

          for (entreNumero = 2; ((entreNumero < numero[indice]) && ((numero[indice] % entreNumero) != 0)); entreNumero++) { }
    
          if ((entreNumero == numero[indice]) || (numero[indice] == 1) || (numero[indice] == 2)) {
            System.out.print(numero[indice] + " ");
          }
        } // for
        break;
      case 3:
        for (indice = 0; indice < 20; indice++) {
          int numeroInicial = numero[indice];
        
          int darLaVuelta = 0;
          
          while (numero[indice] > 0) {
            darLaVuelta = ((darLaVuelta * 10) + ((int)numero[indice] % 10));
            
            numero[indice] /= 10;
          } // while

          if ((numeroInicial == darLaVuelta) && (numeroInicial > 9)) {
            System.out.print(numeroInicial + " ");
          } 
        } // for
        break;
      default:
        System.out.println("Introduzca el número correctamente.");
    } // switch
  }
}