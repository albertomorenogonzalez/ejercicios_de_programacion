/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio40AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA ROMBOS");
    System.out.println("--------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura del rombo, por favor (número impar): ");
    
    int altura = 0;
    
    while (((altura % 2) == 0) || (altura < 3)) {
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      System.out.println(" ");
      
      if (((altura % 2) == 0) || (altura < 3)) {
        System.out.println("Introduzca correctamente la altura del rombo, por favor (número impar): ");
      }
    }
    
    int linea = (altura - (altura / 2));
    int numCaracteres = 1;
    int espacios = (altura / 2);
    
    while (linea <= altura) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      for (int longLinea = 1; longLinea <= numCaracteres; longLinea++) {
        if ((longLinea == 1) || (longLinea == numCaracteres)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      
      System.out.println(" ");
      
      linea++;
      numCaracteres += 2;
      espacios--;
    }
    
    
    linea = (altura / 2);
    numCaracteres = (linea * 2);
    espacios = 1;
    
    while (linea >= 0) {
      
      for (int numEspacios = espacios; numEspacios >= 1; numEspacios--) {
        System.out.print(" "); 
      }
      
      for (int longLinea = numCaracteres; longLinea > 1; longLinea--) {
        if ((longLinea == 2) || (longLinea == numCaracteres)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      
      System.out.println(" ");
      
      linea--;
      numCaracteres -= 2;
      espacios++;
    }
  }
}
