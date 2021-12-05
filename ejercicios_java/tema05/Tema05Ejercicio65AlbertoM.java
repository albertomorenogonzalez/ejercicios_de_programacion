/**
 * Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
 * la altura total y la fila en la que debe aparecer el palito horizontal (contando
 * desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
 * horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
 * introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio65AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA A POR PANTALLA");
    System.out.println("--------------------------------------");
    System.out.println(" ");

    int altura = 0;

    System.out.println("Introduzca la altura de la A, por favor (número mayor o igual que 3): ");

    while (altura < 3) {
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      if (altura < 3) {
        System.out.println("La altura introducida no es correcta, por favor, introduzca la altura de la A (número mayor o igual que 3): ");
      }
    }
    
    int barraHorizontal = 0;

    if (altura == 3) {
      System.out.println("Introduzca la fila de la barra horizontal (2):");
    } else{
      System.out.println("Introduzca la fila de la barra horizontal (entre 2 y " + (altura - 1) + "):");
    }
    
    while ((barraHorizontal < 2) || (barraHorizontal > altura)) {
      System.out.print("> ");
      barraHorizontal = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      if ((barraHorizontal < 2) || (barraHorizontal > altura)) {
        System.out.println("La altura fila introducida no es correcta, por favor, introduzca la fila de la barra horizontal (entre 2 y " + (altura - 1) + "):");
      }
    }
    
    int linea = 1;
    int numCaracteres = 1;
    int espacios = altura - 1;
    
    while (linea <= altura) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if (linea == barraHorizontal) {
          System.out.print("*");
        } else {
          if ((longLinea == 1) || (longLinea == numCaracteres)) {
            System.out.print("*");
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