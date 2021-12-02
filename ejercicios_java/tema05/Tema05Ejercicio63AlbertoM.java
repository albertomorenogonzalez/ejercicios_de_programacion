/**
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
 * una al lado de la otra y separadas por un espacio en su base.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio63AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA DOS PIRÁMIDES POR PANTALLA");
    System.out.println("----------------------------------------------");
    System.out.println(" ");

    int altura1 = 0;
    int altura2 = 0;

    while ((altura1 <= 0) || (altura2 <=0)) {
      System.out.println("Introduzca la altura de la pirámide, por favor (número mayor que 0): ");
      System.out.print("> ");
      altura1 = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      System.out.println("Introduzca la altura de la pirámide, por favor (número mayor que 0): ");
      System.out.print("> ");
      altura2 = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    }
    
    int linea = 1;
    int numCaracteres = 1;
    int numCaracteres2 = 1;
    int espacios = altura1 - 1;
    int espacios2 = altura2 - 1;

    if (altura1 > altura2) {
      while (linea <= altura1) { // si la primera prirámide va a ser mayor que la segunda
        // Pimera Pirámide
        for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) { // espacios antes de la pirámide
          System.out.print(" "); 
        }
        
        for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) { // pisos pirámide
          System.out.print("*");
        }

        for (int numEspacios = 1; numEspacios <= (espacios + 1); numEspacios++) { // espacios posteriores a la pirámide + espacio de un caracter de separación con la otra pirámide
          System.out.print(" "); 
        }

        // Segunda pirámide
        if (linea <= (altura1 - altura2)) {
          for (int numEspacios = 1; numEspacios <= ((altura2 * 2) - 1); numEspacios++) { // espacios vacíos encima de la seguda pirámide
            System.out.print(" "); 
          }
        } else {
          for (int numEspacios = 1; numEspacios <= espacios2; numEspacios++) { // espacios antes de la pirámide
            System.out.print(" "); 
          }
          
          for (int longLinea = 1; longLinea <= numCaracteres2; longLinea++) { // pisos pirámide
            System.out.print("*");
          }

          numCaracteres2 += 2;
          espacios2--;
        } // if

        System.out.println(" "); // salto de línea

        linea++;
        numCaracteres += 2;
        espacios--;
      } // while
    } else if (altura2 > altura1) { // si la seguda pirámide va a ser mayor que la primera
      while (linea <= altura2) {
        // Primera pirámide
        if (linea <= (altura2 - altura1)) {
          for (int numEspacios = 1; numEspacios <= (altura1 * 2); numEspacios++) { // espacios encima de la pimera pirámide + espacio de un caracter de separación con la otra pirámide
            System.out.print(" "); 
          }
        } else {
          for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) { // espacios antes de la pirámide
            System.out.print(" "); 
          }
          
          for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) { // pisos pirámide
            System.out.print("*");
          }

          for (int numEspacios = 1; numEspacios <= (espacios + 1); numEspacios++) { // espacios posteriores a la pirámide
            System.out.print(" "); 
          }

          numCaracteres += 2;
          espacios--;
        } // if

        // Segunda pirámide
        for (int numEspacios = 1; numEspacios <= espacios2; numEspacios++) { // espacios antes de la pirámide
          System.out.print(" "); 
        }

        for (int longLinea = 1; longLinea <= numCaracteres2; longLinea++) { // pisos pirámide
          System.out.print("*");
        }

        System.out.println(" "); // salto de línea

        linea++;
        numCaracteres2 += 2;
        espacios2--;
      } // while
    } // if
  }
}