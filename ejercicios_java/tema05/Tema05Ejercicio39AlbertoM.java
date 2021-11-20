/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio39AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE HACE EL FACTORIAL DE LOS NÚMEROS DESDE EL UNO HASTA EL NÚMERO INTRODUCIDO");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int resultado = 1;
    
    for (int contadorMultiplos = 1; contadorMultiplos <= numero; contadorMultiplos ++) { 
      resultado = (resultado * contadorMultiplos);
      
      System.out.println(contadorMultiplos + "! = " + resultado);
    }
  }
}
