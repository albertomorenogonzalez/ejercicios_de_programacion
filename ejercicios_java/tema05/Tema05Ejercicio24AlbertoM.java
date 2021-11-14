/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio24AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA PIRÁMIDE DE NUMEROS POR PANTALLA");
    System.out.println("--------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la altura de la pirámide, por favor: ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    System.out.println(" ");
    
    int linea = 1;
    int numNumeros = 0;
    int espacios = altura - 1;
    
    while (linea <= altura) {
      
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }
      
      for (int longLinea = 1; longLinea <= numNumeros; longLinea++) {
        System.out.print(longLinea); 
      }
      
      for (int numeroLinea = linea; numeroLinea > 0; numeroLinea--) {
        System.out.print(numeroLinea); 
      }
      
      System.out.println(" "); 
      
      linea++;
      numNumeros++;
      espacios--;
    }
  }
}
