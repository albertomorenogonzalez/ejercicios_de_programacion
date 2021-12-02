/**
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
 * Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
 * número es afortunado si contiene más números de la suerte que de la mala
 * suerte. Realiza un programa que diga si un número introducido por el usuario
 * es afortunado o no.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio62AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI UN NÚMERO ES AFORTUNADO O NO");
    System.out.println("--------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int digito = 0;
    long numeroResultado = numero;
    numero = ((numero * 10) + 1);
    long darLaVuelta = 0;
    int contadorAfortunado = 0;
    int contadorCifras = 0;
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + (numero % 10));
      
      numero /= 10;

      if (numero > 1) {
        contadorCifras++;
      }
    }

    while (darLaVuelta > 10) {
      digito = ((int)darLaVuelta % 10);

      switch (digito) {
        case 3:
          contadorAfortunado++;
          break;
        case 7:
          contadorAfortunado++;
          break;
        case 8:
          contadorAfortunado++;
          break;
        case 9:
          contadorAfortunado++;
          break;
        default:

      }

      darLaVuelta /= 10;
    }

    if (contadorAfortunado > (contadorCifras / 2)) {
      System.out.println("El " + numeroResultado + " es un número afortunado.");
    } else {
      System.out.println("El " + numeroResultado + " no es un número afortunado.");
    }
  }
}