/**
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio17AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE SUMA LOS 100 NUMEROS SIGUIENTES A UN NÚMERO INTRODUCIDO POR TECLADO");
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println(" ");
    
    int numero = 0;
    
    int sumaGuardada = 0;
    
    while (numero <= 0) {
      System.out.println("Por favor, introduzca un número (entero y positivo): ");
      System.out.print("> ");
      numero = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    
      int sumando = (numero + 1);
      
      if (numero > 0) {
        for (int contador = 0; contador < 100; contador++) {
    
          sumaGuardada = (sumaGuardada + sumando);
        
          sumando++;
      }
        System.out.println("El resultado es " + sumaGuardada + ".");
      } 
    }
  }
}
