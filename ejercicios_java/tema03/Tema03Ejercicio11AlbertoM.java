/**
 * Realiza un conversor de Kb a Mb.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio11AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca la cantidad en Kb que quiere convertir en Mb: ");
    System.out.print("> ");
    number = System.console().readLine();
    double Kb;
    Kb = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.print(Kb);
    System.out.print(" Kb son ");
    System.out.print(Kb / 1000);
    System.out.println(" Mb.");
  }
}
