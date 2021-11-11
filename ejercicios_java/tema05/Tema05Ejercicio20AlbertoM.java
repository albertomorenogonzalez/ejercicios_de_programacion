/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio20AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA PIRÁMIDE HUECA POR PANTALLA");
    System.out.println("---------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura de la pirámide, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca el carácter del que quiere hacer la pirámide, por favor:");
    System.out.print("> ");
    String caracter = System.console().readLine();
    System.out.println(" ");
    
    int linea = 1;
    int numCaracteres = 1;
    int espacios = altura - 1;
    
    while (linea <= altura) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if (linea == altura) {
          System.out.print(caracter);
        } else {
            if ((longLinea == 1) || (longLinea == numCaracteres)) {
              System.out.print(caracter);
            } else {
                System.out.print(" ");
            }
        }
      }
      
      System.out.println(" ");
      
      linea++;
      numCaracteres += 2;
      espacios--;
    }
  }
}
