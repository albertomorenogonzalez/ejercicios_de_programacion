/**
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio06AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca la medida de la base del triángulo (cm): ");
    System.out.print("> ");
    number = System.console().readLine();
    double b;
    b = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la medida de la altura del triángulo (cm): ");
    System.out.print("> ");
    number = System.console().readLine();
    double a;
    a = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.print("El área del triángulo es de ");
    System.out.printf("%.1f" ,((b * a)/2));
    System.out.println(" cm.");
  }
}
