/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio01AlbertoM {
  public static void main(String[] args) {
    String linea;
    
    System.out.println("Por favor, introduce un número: ");
    System.out.print("> ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.println(" ");
    
    System.out.println("Introduzca otro para multiplicarlo con el anterior, por favor: ");
    System.out.print("> ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    System.out.println(" ");
    
    int total;
    
    total = (primerNumero * segundoNumero);
    
    System.out.print("El resultado es de ");
    System.out.print(total);
    System.out.println(".");
  }
}
