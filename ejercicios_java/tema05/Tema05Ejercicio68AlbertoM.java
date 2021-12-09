/**
 * Escribe un programa que pida un número por teclado y que luego lo “disloque”
 * de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si es impar.
 * Usa long en lugar de int donde sea necesario para admitir números largos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio68AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE UN NÚMERO POR TECLADO Y LUEGO LO DISLOCA");
    System.out.println("-----------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int digito = 0;
    long numeroMant = numero;
    numero = ((numero * 10) + 1);
    long darLaVuelta = 0;
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + (numero % 10));
      
      numero /= 10;
    }

    System.out.print("Dislocando el " + numeroMant + " sale el ");

    long resultado = 0;

    while (darLaVuelta > 10) {
      digito = ((int)darLaVuelta % 10);

      if ((digito % 2) == 0) {
        digito = (digito + 1);
      } else {
        digito = (digito - 1);
      }

      resultado = ((resultado * 10) + digito);

      darLaVuelta /= 10;
    }

    System.out.print(resultado);
  }
}