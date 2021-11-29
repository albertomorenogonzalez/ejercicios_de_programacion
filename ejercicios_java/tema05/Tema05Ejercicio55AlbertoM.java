/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
 * dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
 * queda igual.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio55AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE ES CAPAZ DE DESPLAZAR TODOS LOS DÍGITOS DE UN NÚMERO DE IZQUIERDA A DERECHA UNA POSICIÓN");
    System.out.println("------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    long restaurarNumero = numero;
    int contadorCifras = 0;
    long cifrasALaDerecha = 0;
    long cifraALaIzquierda = 0;
    long nuevoNumero = 0;

    while (numero > 0) {
      numero /= 10;
      contadorCifras++;
    }

    if (restaurarNumero > 10) {
      int resto = ((int)restaurarNumero % 10);
      cifrasALaDerecha = ((restaurarNumero - resto) / 10);
      cifraALaIzquierda = (resto * ((int)Math.pow(10 ,(contadorCifras - 1))));
      nuevoNumero = (cifraALaIzquierda + cifrasALaDerecha);

      System.out.println("El número resultante es " + nuevoNumero);
    } else {
      System.out.println("El número resultante es " + restaurarNumero);
    }
  }
}