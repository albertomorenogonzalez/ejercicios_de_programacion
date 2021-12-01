/**
 * Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
 * la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
 * mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
 * debe mostrar un mensaje de error.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio61AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA V POR PANTALLA");
    System.out.println("--------------------------------------");
    System.out.println(" ");

    int altura = 0;

    System.out.println("Introduzca la altura de la V, por favor (número mayor o igual que 3): ");

    while (altura <= 3) {
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      if (altura <= 3) {
        System.out.println("Introduzca correctamente la altura de la V, por favor (número mayor o igual que 3): ");
      }
    }

    int linea = 1;
    int numCaracteres = (altura * 2);
    int espacios = 1;

    while (linea <= altura) {
        
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
        
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if ((longLinea == 1) || (longLinea == numCaracteres)) {
          System.out.print("***");
        } else {
          System.out.print(" ");
        }
      }
        
      System.out.println(" ");
        
      linea++;
      numCaracteres -= 2;
      espacios++;
    }
  }
}
