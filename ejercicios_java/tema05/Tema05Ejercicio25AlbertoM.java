/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio25AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE UN NUMERO Y LUEGO LO MUESTRA AL REVÉS");
    System.out.println("--------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int resto = (numero % 10);
    
    int numeroEntreDiez = (numero / 10);
    
    
    while (numeroEntreDiez >= 10) {
      System.out.print(resto);
        
      resto = (numeroEntreDiez % 10);
        
      numeroEntreDiez = (numeroEntreDiez / 10);
    }
    
    System.out.print(resto);
    System.out.print(numeroEntreDiez);
    
  }
}
