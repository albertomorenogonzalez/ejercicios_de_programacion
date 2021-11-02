/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio18AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE CUAL ES LA PRIMERA CIFRA DEL NÚMERO ENTERO QUE SE INTRODUZCA");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    if ((numero < 10) && (numero > -10)) {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if ((numero < 100) && (numero > -100)) {
          int primeraCifra = (numero / 10);
          System.out.printf("La primera cifra del número introducido es %d." ,Math.abs(primeraCifra));
        } else if ((numero < 1000) && (numero > -1000)) {
            int primeraCifra = (numero / 100);
            System.out.printf("La primera cifra del número introducido es %d." ,Math.abs(primeraCifra));
        } else if ((numero < 10000) && (numero > -10000)) {
            int primeraCifra = (numero / 1000);
            System.out.printf("La primera cifra del número introducido es %d." ,Math.abs(primeraCifra));
        } else if ((numero < 100000) && (numero > -100000)) {
            int primeraCifra = (numero / 10000);
            System.out.printf("La primera cifra del número introducido es %d." ,Math.abs(primeraCifra));
        } else {
            if ((numero >= 100000) || (numero <= -100000)) {
              System.out.println("El número introducido es demasiado grande.");
            }
        }
    }
  }
}
