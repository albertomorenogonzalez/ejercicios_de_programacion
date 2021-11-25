/**
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio59AlbertoM {
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

    for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
      System.out.print(" "); 
    }

    System.out.println("*");

    while (linea <= (altura - 2)) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if (linea == (altura - 2)) {
          System.out.print("^");
        } else {
            if ((longLinea == 1) || (longLinea == numCaracteres)) {
              System.out.print("^");
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

    espacios = (altura - 1);

    for (int tronco = 1; tronco < 2; tronco++) {
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      System.out.println("Y");
    }
  }
}
