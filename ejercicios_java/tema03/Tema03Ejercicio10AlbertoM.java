/**
 * Realiza un conversor de Mb a Kb.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio10AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca la cantidad en Mb que quiere convertir en Kb: ");
    System.out.print("> ");
    number = System.console().readLine();
    double Mb;
    Mb = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.print(Mb);
    System.out.print(" Mb son ");
    System.out.print(Mb * 1000);
    System.out.println(" Kb.");
  }
}
