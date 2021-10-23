/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio05AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE RESUELVE UNA ECUACIÓN DE PRIMER GRADO (ax + b = 0)");
    System.out.println("----------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca el valor de a: ");
    System.out.print("> ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el valor de b: ");
    System.out.print("> ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.println(" ");
    
    if (a == 0) {
      System.out.print("La ecuación no tiene solución en R.");
    } else {
        System.out.print("x es igual a ");
        System.out.printf("%.2f" ,(-b / a));
        System.out.println("."); 
    }
  }
}
