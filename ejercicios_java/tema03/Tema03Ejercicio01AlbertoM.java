/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio01AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca un número: ");
    System.out.print("> ");
    number = System.console().readLine();
    double Numero1;
    Numero1 = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.println("Introduzca otro para multiplicarlo con el anterior, por favor: ");
    System.out.print("> ");
    number = System.console().readLine();
    double Numero2;
    Numero2 = Double.parseDouble( number );
    
    System.out.println(" ");
    
    double total;
    
    total = (Numero1 * Numero2);
    
    System.out.print("El resultado es de ");
    System.out.printf("%.2f" ,total);
    System.out.println(".");
  }
}
