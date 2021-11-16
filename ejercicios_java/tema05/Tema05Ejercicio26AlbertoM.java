/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio26AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE LA POSICIÓN QUE OCUPA UN DÍGITO DENTRO DE UN NÚMERO");
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca el digito del que quiera saber la posición, por favor: ");
    System.out.print("> ");
    int digito = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.print("El número " + digito + " ocupa la posición/las posiciones número: ");
    
    int comprobarDigito = 1;
    
    int posicion = 0;
    
    int darLaVuelta = 0;
    
    numero = ((numero * 10) + 1);
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + ((int)numero % 10));
      
      numero /= 10;
    }
    
    while (darLaVuelta > 0) {
      if (posicion > 0) {
        if (comprobarDigito == digito) {
          System.out.print(posicion + " ");
        }
      }
      
      comprobarDigito = (darLaVuelta % 10);
      
      darLaVuelta = (darLaVuelta / 10);
      
      posicion++;
    }
  }
} 

