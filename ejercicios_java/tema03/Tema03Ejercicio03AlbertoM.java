/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio03AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca la cantidad en pesetas que quiere convertir: ");
    System.out.print("> ");
    number = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt( number );
    
    System.out.println(" ");
    
    System.out.printf("%d" ,pesetas);
    System.out.print(" pesetas son ");
    System.out.printf("%.2f" ,(pesetas / 166.386) );
    System.out.println(" euros.");
  }
}
