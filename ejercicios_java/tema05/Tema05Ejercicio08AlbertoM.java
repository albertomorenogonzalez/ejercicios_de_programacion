/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio08AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LA TABLA DE MULTIPLICAR DE UN NÚMERO INTRODUCIDO POR TECLADO");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(" ");
  
    System.out.println("Introduzca un número del 1 al 10, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
  
    for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
      int resultado = (numero * multiplicador);
      
      System.out.println(numero + " x " + multiplicador + " = " + resultado);
    }
  }
}
