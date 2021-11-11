/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio11AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL CUADRADO Y EL CUBO DE CINCO NÚMEROS A PARTIR DE UNO INTRODUCIDO POR TECLADO");
    System.out.println("----------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    double numero = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    int contador = 1;
    
    while (contador <= 5) {
      double numeroAlCuadrado = Math.pow(numero, 2);
      double numeroAlCubo = Math.pow(numero, 3);
      
      System.out.printf("%3.0f   %3.0f   %3.0f\n" ,numero ,numeroAlCuadrado ,numeroAlCubo);
      
      contador++;
      numero++;
    }
  }
}
