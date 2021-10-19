/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio07AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca el preecio de la base imponible (precio sin IVA): ");
    System.out.print("> ");
    number = System.console().readLine();
    double bimponible;
    bimponible = Double.parseDouble( number );
    
    double iva;
    
    iva = 0.21;
    
    System.out.println(" ");
    System.out.print("El IVA es de ");
    System.out.printf("%.2f" ,(bimponible *iva));
    System.out.println(" €.");
    System.out.println(" ");
    
    System.out.print("El precio de la factura (IVA incluido) es de ");
    System.out.printf("%.2f", bimponible + (bimponible * iva));
    System.out.println(" €.");
  }
}
