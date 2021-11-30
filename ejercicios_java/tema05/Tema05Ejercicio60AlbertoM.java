/**
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
 * se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una
 * altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
 * que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio60AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA DOS CALCETINES DE NAVIDAD POR PANTALLA");
    System.out.println("----------------------------------------------------------");
    System.out.println(" ");
    
    int altura = 0;

    while (altura < 4) {
      System.out.println("Introduzca la altura de los calcetines, por favor (número mayor o igual que 4): ");
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    }

    int linea = 1;
    int numCalcetines;

    while (linea <= altura) {
      if (linea < (altura - 1)) {
        for (numCalcetines = 0; numCalcetines < 2; numCalcetines++) {
          for (int longLinea = 1; longLinea <= 3; longLinea++) {
              System.out.print("*");
          }
          
          for (int numEspacios = 1; numEspacios <= 5; numEspacios++) {
            System.out.print(" "); 
          }
        }

        System.out.println(" ");
      } else {
        for (numCalcetines = 0; numCalcetines < 2; numCalcetines++) {
          for (int longLinea = 1; longLinea <= 6; longLinea++) {
            System.out.print("*");
          }
        
          for (int numEspacios = 1; numEspacios <= 2; numEspacios++) {
            System.out.print(" "); 
          }
        }

        System.out.println(" ");
      }
      linea++;
    }
  }
}
