/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio41AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE CUANTOS DIGITOS PARES E IMPARES TIENE UN NÚMERO");
    System.out.println("---------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");

    long darLaVuelta = 0;
    
    numero = ((numero * 10) + 1);
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + (numero % 10));
      
      numero /= 10;
    }
    
    long darLaVueltaImpar = darLaVuelta;

    int contadorPares = 0;
    
    while (darLaVuelta > 0) {
      if ((darLaVuelta % 2) == 0) {
        contadorPares++;
      } 
      
      darLaVuelta /= 10;
    }

    int contadorImpares = 0;

    while (darLaVueltaImpar > 0) {
      if (((darLaVueltaImpar % 2) != 0) && (darLaVueltaImpar > 1)) {
        contadorImpares++;
      } 
      
      darLaVueltaImpar /= 10;
    }

    System.out.println("El número tiene " + contadorPares + " dígitos pares y " + contadorImpares + " impares.");
  }
} 
