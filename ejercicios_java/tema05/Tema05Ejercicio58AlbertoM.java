/**
 * Realiza un programa que calcule la media de los dígitos que contiene un número
 * entero introducido por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio58AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA LA MEDIA DE LOS DIGITOS QUE CONTIENE UN NÚMERO ENTERO INTROUCIDO POR TECLADO");
    System.out.println("--------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int contadorNumeros = 0;
    int digito = 0;
    int sumatorio = 0;
    numero = ((numero * 10) + 1);
    long darLaVuelta = 0;
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + (numero % 10));
      
      numero /= 10;
    }

    while (darLaVuelta > 10) {
      digito = ((int)darLaVuelta % 10);

      sumatorio = (digito + sumatorio);

      darLaVuelta /= 10;
      contadorNumeros++;
    }

    double media = ((double)sumatorio / (double)contadorNumeros);


    System.out.println("La media de sus dígitos es " + media);
  }
}