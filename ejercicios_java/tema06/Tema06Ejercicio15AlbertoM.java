/**
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
 * la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio15AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA UNA MELODÍA AL AZAR");
    System.out.println("----------------------------------------");
    System.out.println(" ");

    int compases = ((int)(Math.random() * 7) + 1);

    String notaTonica = " ";

    for (int contadorCompases = compases; contadorCompases > 0; contadorCompases--) {
      for (int parteCompas = 0; parteCompas < 4; parteCompas++) {
        int posNota = ((int)(Math.random() * 7));
        String nota = " ";
        switch (posNota) {
          case 0:
            nota = "do";
            break;
          case 1:
            nota = "re";
            break;
          case 2:
            nota = "mi";
            break;
          case 3:
            nota = "fa";
            break;
          case 4:
            nota = "sol";
            break;
          case 5:
            nota = "la";
            break;
          case 6:
            nota = "si";
            break;
          default:

        }

        if ((contadorCompases == compases) && (parteCompas == 0)) {
          notaTonica = nota;
        } 

        if ((contadorCompases == 1) && (parteCompas == 3)) {
          System.out.print(notaTonica + " |");
        } else {
          System.out.print(nota + " ");
        }
        
      }

      System.out.print("| ");
    }
  }    
}