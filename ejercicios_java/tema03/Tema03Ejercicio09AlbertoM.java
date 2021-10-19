/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
 * (1/3)πr²h.
 *
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio09AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca la medida del radio de la base del cono (cm): ");
    System.out.print("> ");
    number = System.console().readLine();
    double r;
    r = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la medida de la altura del cono (cm): ");
    System.out.print("> ");
    number = System.console().readLine();
    double h;
    h = Double.parseDouble( number );
    
    System.out.println(" ");
    
    double unoentretres;
    unoentretres = ((double)1 / (double)3);
   
    System.out.print("El volumen del cono es de ");
    System.out.printf("%.1f" ,(unoentretres * Math.PI * Math.pow(r, 2) * h));
    System.out.println(" cm.");
  }
}
