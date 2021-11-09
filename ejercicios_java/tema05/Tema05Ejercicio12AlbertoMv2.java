/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio12AlbertoMv2 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS N PRIMEROS NÚMEROS DE LA SECUENCIA DE FIBONACCI");
    System.out.println("-------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca el número de números que quiere mostrar, por favor: ");
    System.out.print("> ");
    int numeroDeNumeros = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int numero1 = 0;
    
    int numero2 = 1;
    
    System.out.print(numero1);
    System.out.print(" ");
  
    System.out.print(numero2);
    System.out.print(" ");
    
    int contador = 2;
    
    do {
      int suma = (numero1 + numero2);
      
      System.out.print(suma);
      System.out.print(" ");
      
      numero1 = numero2;
      
      numero2 = suma;
      
      contador++;
    } while (contador != numeroDeNumeros);
  }
}
