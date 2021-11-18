/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio34AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE DOS NÚMEROS Y FORMA DOS NÚMEROS DISTINTOS, UNO CON LOS DÍGITOS IMPARES DE AMBOS NÚMEROS Y OTRO CON LOS PARES");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero, por favor: ");
    System.out.print("> ");
    long numero1 = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca otro número entero, por favor: ");
    System.out.print("> ");
    long numero2 = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    int darLaVuelta1 = 0;
    
    int darLaVuelta2 = 0;
    
    numero1 = ((numero1 * 10) + 1);
    
    numero2 = ((numero2 * 10) + 1);
    
    int contador = 0;
    
    while ((numero1 > 0) && (numero2 > 0)) {
      darLaVuelta1 = ((darLaVuelta1 * 10) + ((int)numero1 % 10));
      darLaVuelta2 = ((darLaVuelta2 * 10) + ((int)numero2 % 10));
      
      numero1 /= 10;
      numero2 /= 10;
    }
    
    while ((darLaVuelta1 > 0) && (darLaVuelta2 > 0)) {
      if ((darLaVuelta1 % 2) == 0) {
        System.out.print(darLaVuelta1 % 10);
      } else if ((darLaVuelta2 % 2) == 0) {
        System.out.print(darLaVuelta2 % 10);
      }
      
      darLaVuelta1 /= 10;
      darLaVuelta2 /= 10;
      contador++;
    }
    
    System.out.println(" ");
    
    System.out.print(darLaVuelta1);
    System.out.print(darLaVuelta2);
    
    double restaurarDarLaVuelta = Math.pow(10, contador);
    
    //darLaVuelta1 = (((double)darLaVuelta1) * restaurarDarLaVuelta);
    
    //darLaVuelta2 = (((double)darLaVuelta2) * restaurarDarLaVuelta);
    
    System.out.println(" ");
    
    while ((darLaVuelta1 > 0) && (darLaVuelta2 > 0)) {
      if ((darLaVuelta1 % 2) != 0) {
        System.out.print(darLaVuelta1 % 10);
      } else if ((darLaVuelta2 % 2) != 0) {
        System.out.print(darLaVuelta2 % 10);
      }
      
      darLaVuelta1 /= 10;
      darLaVuelta2 /= 10;
    }
  }
} 
