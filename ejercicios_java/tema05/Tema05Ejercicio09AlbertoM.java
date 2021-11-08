/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio09AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE CUANTAS CIFRAS TIENE EL NÚMERO ENTERO QUE SE INTRODUZCA");
    System.out.println("--------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    long numeroEntreDiez = (numero / 10);
    
    int numeroCifras = 1;
    
    while (numeroEntreDiez != 0) {
        numeroCifras++;
        
        numeroEntreDiez /= 10;
    }
    
    if (numeroCifras == 1) {
      System.out.println("El número introducido tiene " + numeroCifras + " cifra.");
    } else {
        System.out.println("El número introducido tiene " + numeroCifras + " cifras.");
    }
  }
}
