/**
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio59AlbertoMv2 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA ÁRBOL DE NAVIDAD POR PANTALLA");
    System.out.println("-----------------------------------------------------");
    System.out.println(" ");
    
    int altura = 0;

    while (altura < 4) {
      System.out.println("Introduzca la altura del árbol, por favor (número mayor o igual que 4): ");
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    }

    int linea = 1;
    int numCaracteres = 1;
    int espacios = altura - 1;
    
    while (linea <= (altura - 3)) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        int coposNieve = ((int)(Math.random() * 30));
        switch (coposNieve) {
          case 0:
            System.out.print("\033[97m.");
            break;
          default:
            System.out.print(" "); 
            break;
        }
      }
      
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if (linea == (altura - 3)) {
          System.out.print("\033[32m-");
        } else if (linea == 1) {
          System.out.print("\033[33m✯");
        } else {
          if (longLinea == 1) {
            System.out.print("\033[32m/");
          } else if (longLinea == numCaracteres) {
            System.out.print("\033[32m\\");
          } else {
            int bolasNavidad = ((int)(Math.random() * 35));
            switch (bolasNavidad) {
              case 0:
                System.out.print("\033[91m◍");
                break;
              case 1:
                System.out.print("\033[92m◍");
                break;
              case 2:
                System.out.print("\033[93m◍");
                break;
              case 3:
                System.out.print("\033[94m◍");
                break;
              case 4:
                System.out.print("\033[95m◍");
                break;
              case 5:
                System.out.print("\033[96m◍");
                break;
              case 6:
                System.out.print("\033[97m◍");
                break;
              default:
                System.out.print(" ");
            }
          }
        }
      }
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        int coposNieve = ((int)(Math.random() * 30));
        switch (coposNieve) {
          case 0:
            System.out.print("\033[97m.");
            break;
          default:
            System.out.print(" "); 
            break;
        }
      }

      System.out.println(" ");
      
      linea++;
      numCaracteres += 2;
      espacios--;
    }

    espacios = (altura - 1);

    for (int tronco = 1; tronco <= 2; tronco++) {
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      System.out.println("\033[31m#");
    }
  }
}
