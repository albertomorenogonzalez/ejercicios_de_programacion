/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio07AlbertoM {
  public static void main(String[] args) {
    System.out.println("ACCESO A LA CAJA FUERTE");
    System.out.println("------------------------");
    System.out.println(" ");
    
    int intento = 0;
    
    while (intento < 4) {
      System.out.println("Introduzca el PIN: ");
      System.out.print("> ");
      int pin = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      
      if (pin == 4325) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        break;
      } else {
          System.out.println("Lo siento, esa no es la combinación.");
          System.out.println(" ");
          System.out.println(" ");
          intento ++;
      }
      
      if (intento == 4) {
        System.out.println("Se ha quedado sin intentos.");
      }
    }
  }
}
