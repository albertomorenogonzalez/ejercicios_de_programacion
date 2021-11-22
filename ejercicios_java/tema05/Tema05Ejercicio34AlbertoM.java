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
    
    long darLaVuelta1 = 0;
    
    long darLaVuelta2 = 0;
    
    numero1 = ((numero1 * 10) + 1);
    
    numero2 = ((numero2 * 10) + 1);

    int longitud = 0;
    int longitudImp = 0;
    
    while (numero1 > 0) {
      darLaVuelta1 = ((darLaVuelta1 * 10) + (numero1 % 10));
      
      numero1 /= 10;
      longitud++;
      longitudImp++;
    }
    
    while (numero2 > 0) {
      darLaVuelta2 = ((darLaVuelta2 * 10) + (numero2 % 10));
      
      numero2 /= 10;
    }
    
    long darLaVueltaImpar1 = darLaVuelta1;
    
    long darLaVueltaImpar2 = darLaVuelta2;
    
    System.out.print("El número formado por los dígitos pares es ");
    
    while (longitud > 0) {
      if ((darLaVuelta1 % 2) == 0) {
        System.out.print(darLaVuelta1 % 10);
      } 
      
      if ((darLaVuelta2 % 2) == 0) {
        System.out.print(darLaVuelta2 % 10);
      }

      darLaVuelta1 /= 10;
      darLaVuelta2 /= 10;
      longitud--;
    }
    
    System.out.println(" ");
    
    System.out.print("El número formado por los dígitos impares es ");
    
    while (longitudImp > 0) {
      if (((darLaVueltaImpar1 % 2) != 0) && (darLaVueltaImpar1 > 1)) {
        System.out.print(darLaVueltaImpar1 % 10);
      } 
      
      if (((darLaVueltaImpar2 % 2) != 0) && (darLaVueltaImpar2 > 1)) {
        System.out.print(darLaVueltaImpar2 % 10);
      }
      
      darLaVueltaImpar1 /= 10;
      darLaVueltaImpar2 /= 10;
      longitudImp--;
    }
  }
} 
