/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio17AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE CUAL ES LA ULTIMA CIFRA DEL NÚMERO ENTERO QUE SE INTRODUZCA");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int resto = (numero % 10);
    
    if ((numero < 10) && (numero > -10)) {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if (resto == 0) {
          System.out.print("La última cifra del número introducido es 0");
        } else if ((resto == 1) || (resto == -1)) {
            System.out.print("La última cifra del número introducido es 1");
        } else if ((resto == 2) || (resto == -2)) {
            System.out.print("La última cifra del número introducido es 2");
        } else if ((resto == 3) || (resto == -3)) {
            System.out.print("La última cifra del número introducido es 3");
        } else if ((resto == 4) || (resto == -4)) {
            System.out.print("La última cifra del número introducido es 4");
        } else if ((resto == 5) || (resto == -5)) {
            System.out.print("La última cifra del número introducido es 5");
        } else if ((resto == 6) || (resto == -6)) {
            System.out.print("La última cifra del número introducido es 6");
        } else if ((resto == 7) || (resto == -7)) {
            System.out.print("La última cifra del número introducido es 7");
        } else if ((resto == 8) || (resto == -8)) {
            System.out.print("La última cifra del número introducido es 8");
        } else if ((resto == 9) || (resto == -9)) {
            System.out.print("La última cifra del número introducido es 9");
        } 
    }
  }
}
