/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio02AlbertoM {
  public static void main(String[] args) {
    
    String number;
    
    System.out.println("Por favor, introduzca la cantidad en euros que quiere convertir: ");
    System.out.print("> ");
    number = System.console().readLine();
    double euros;
    euros = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.printf( "%.2f" ,euros);
    System.out.print(" € son ");
    System.out.print((int)(euros * 166.386));
    System.out.println(" pesetas.");
  }
}
