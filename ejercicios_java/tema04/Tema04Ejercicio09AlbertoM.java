/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax² + bx + c = 0).
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio09AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE RESUELVE UNA ECUACIÓN DE SEGUNDO GRADO (ax² + bx + c = 0)");
    System.out.println("-----------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca el valor de a: ");
    System.out.print("> ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el valor de b: ");
    System.out.print("> ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el valor de c: ");
    System.out.print("> ");
    double c = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    double interiorRaizCuad = ((Math.pow(b, 2)) - (4 * a * c));
    
    double solucion1 = ((-b + (Math.sqrt(interiorRaizCuad))) / (2 * a));
    
    double solucion2 = ((-b - (Math.sqrt(interiorRaizCuad))) / (2 * a));
    
    if ((a == 0) && ( b == 0 ) && (c == 0)) {
      System.out.print("La ecuación tiene infinitas soluciones.");
    } else if ((a == 0) && ( b == 0 ) && (c != 0)) {
          System.out.print("La ecuación no tiene solución.");
    } else { 
        if (interiorRaizCuad < 0 ) {
          System.out.print("La ecuación no tiene solución en R.");
        } else if (solucion1 == solucion2) {
            System.out.print("La única solución es ");
            System.out.printf("%.2f" ,solucion1);
            System.out.println(".");
        } else {
            System.out.print("La primera solución de x es igual a ");
            System.out.printf("%.2f" ,solucion1);
            System.out.println(".");
            System.out.println(" ");
            System.out.print("La segunda solución de x es igual a ");
            System.out.printf("%.2f" ,solucion2);
            System.out.println(".");
        }
    }
  }
}
