/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
 * queda igual.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio52AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA CAPAZ DE DESPLAZAR TODOS LOS DIGITOS DE UN NUMERO  DE DERECHA A IZQUIERDA UNA POSICIÓN");
    System.out.println("------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    long restaurarNumero = numero;
    int contadorCifras = 0;

    while (numero > 0) {
      numero /= 10;
      contadorCifras++;
    }

    if (restaurarNumero < 10) {
      System.out.printf("%-20s%d" ,"El número resultante es " ,restaurarNumero);
    } else {
      long cifraALaDerecha = (restaurarNumero % ((int)Math.pow(10 ,(contadorCifras - 1))));
      long cifrasALaIzquierda = (restaurarNumero / ((int)Math.pow(10 ,(contadorCifras - 1))));

      System.out.printf("%-20s%d%d" ,"El número resultante es " ,cifraALaDerecha ,cifrasALaIzquierda);
    }
  }
}