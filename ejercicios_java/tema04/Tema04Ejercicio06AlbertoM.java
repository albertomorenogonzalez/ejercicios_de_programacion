/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m/s².
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio06AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL TIEMPO QUE TARDARÁ EN CAER UN OBJETO DESDE UNA ALTURA ");
    System.out.println("------------------------------------------------------------------------------");
    System.out.println(" "); 
    
    System.out.println("Aplicaremos la fórmula t = √(2h/g)");
    System.out.println(" ");
    System.out.println("t = tiempo.");
    System.out.println("h = altura.");
    System.out.println("g = gravedad = 9.81 m/s².");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el valor de h (m): ");
    System.out.print("> ");
    double h = Double.parseDouble(System.console().readLine());
    
    System.out.println(" ");
    
    double interiorrcuad = ((2 * h) / 9.81);
    
    if (h < 0) {
      System.out.print("La altura no puede tener un valor negativo.");
    } else {
        System.out.print("El tiempo que tardará el objeto en caer es de ");
        System.out.printf("%.2f" ,Math.sqrt(interiorrcuad));
        System.out.println(" s."); 
    }
  }
}
