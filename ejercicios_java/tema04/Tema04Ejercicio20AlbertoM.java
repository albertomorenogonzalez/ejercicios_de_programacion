/**
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio20AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI EL NUMERO ENTERO POSTIVO INTRODUCIDO ES CAPICUA");
    System.out.println("---------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int restoParCifras = (numero % 11);
    
    int restoTresCifras = (numero % 100);
    int excedenteTresCifras = (numero - restoTresCifras);
    int restoTresCifrasNumeroEntreDiez = (numero % 10);
    
    if ((numero >= 0) && (numero < 10))  {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if (((numero >= 10) && (numero < 100)) || ((numero >= 1000) && (numero < 10000))) {
          if (restoParCifras == 0) {
            System.out.print("El número introducido es capicúa.");
          } else {
              System.out.print("El número introducido no es capicúa.");
          }
        } else if (numero < 1000) {
            if ((excedenteTresCifras == 100) && (restoTresCifrasNumeroEntreDiez == 1)) {
              System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 200) && (restoTresCifrasNumeroEntreDiez  == 2)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 300) && (restoTresCifrasNumeroEntreDiez  == 3)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 400) && (restoTresCifrasNumeroEntreDiez  == 4)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 500) && (restoTresCifrasNumeroEntreDiez  == 5)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 600) && (restoTresCifrasNumeroEntreDiez  == 6)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 700) && (restoTresCifrasNumeroEntreDiez  == 7)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 800) && (restoTresCifrasNumeroEntreDiez  == 8)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteTresCifras == 900) && (restoTresCifrasNumeroEntreDiez  == 9)) {
                System.out.print("El número introducido es capicúa.");
            } else {
                System.out.print("El número introducido no es capicúa.");
            }
        } 
    }
  }
}
