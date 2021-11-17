/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio32AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE EL DÍGITO/LOS DIGITOS PAR(ES) DENTRO DE UN NÚMERO Y LOS SUMA");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    int comprobarDigitoPar = 1;
    
    int digitoPar = comprobarDigitoPar % 2;
    
    int posicion = 0;
    
    int darLaVuelta = 0;
    
    numero = ((numero * 10) + 1);
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + ((int)numero % 10));
      
      numero /= 10;
    }
    
    while (darLaVuelta > 0) {
      if (posicion > 0) {
        if (digitoPar == 0) {
          System.out.print(digitoPar + " ");
        }
      }
      
      comprobarDigitoPar = (darLaVuelta % 10);
      
      darLaVuelta = (darLaVuelta / 10);
      
      posicion++;
    }
  }
} 
