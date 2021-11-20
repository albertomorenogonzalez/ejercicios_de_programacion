/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio37AlbertoM {
  public static void main(String[] args) {
    System.out.println("CONVERSOR DECIMAL-PALOTES");
    System.out.println("--------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    System.out.print(numero + " en decimal es ");
    
    int darLaVuelta = 0;
    
    int digito = 0;
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + ((int)numero % 10));
      
      numero /= 10;
    }
    
    while (darLaVuelta > 0) {
      digito = (darLaVuelta % 10);
      
      for (int numPalotes = 0; numPalotes < digito; numPalotes++) {
        System.out.print("|");
      }
      
      if (darLaVuelta > 10) {
        System.out.print("-");
      }
      
      darLaVuelta /= 10;
    }
    
    System.out.print(" en el sistema de palotes.");
  }
}
