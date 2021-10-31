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
    
    int restoCincoCifras = (numero % 1000);
    int excedenteCincoCifras = (numero - restoCincoCifras);
    int restoCincoCifrasNumeroEntreCien = (numero % 100);
    
    if ((numero >= 0) && (numero < 10))  {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if (((numero >= 10) && (numero < 100)) || ((numero >= 1000) && (numero < 10000))) {
          if (restoParCifras == 0) {
            System.out.print("El número introducido es capicúa.");
          } else {
              System.out.print("El número introducido no es capicúa.");
          }
        } else if ((numero >= 100) && (numero < 1000)) {
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
        } else if ((numero >= 10000) && (numero < 100000)) {
            if ((excedenteCincoCifras == 10000) && (restoCincoCifrasNumeroEntreCien == 1)) {
              System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 11000) && (restoCincoCifrasNumeroEntreCien  == 11)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 12000) && (restoCincoCifrasNumeroEntreCien  == 21)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 13000) && (restoCincoCifrasNumeroEntreCien  == 31)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 14000) && (restoCincoCifrasNumeroEntreCien  == 41)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 15000) && (restoCincoCifrasNumeroEntreCien  == 51)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 16000) && (restoCincoCifrasNumeroEntreCien  == 61)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 17000) && (restoCincoCifrasNumeroEntreCien  == 71)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 18000) && (restoCincoCifrasNumeroEntreCien  == 81)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 19000) && (restoCincoCifrasNumeroEntreCien  == 91)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 20000) && (restoCincoCifrasNumeroEntreCien == 2)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 21000) && (restoCincoCifrasNumeroEntreCien  == 12)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 22000) && (restoCincoCifrasNumeroEntreCien  == 22)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 23000) && (restoCincoCifrasNumeroEntreCien  == 32)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 24000) && (restoCincoCifrasNumeroEntreCien  == 42)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 25000) && (restoCincoCifrasNumeroEntreCien  == 52)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 26000) && (restoCincoCifrasNumeroEntreCien  == 62)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 27000) && (restoCincoCifrasNumeroEntreCien  == 72)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 28000) && (restoCincoCifrasNumeroEntreCien  == 82)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 29000) && (restoCincoCifrasNumeroEntreCien  == 92)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 30000) && (restoCincoCifrasNumeroEntreCien == 3)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 31000) && (restoCincoCifrasNumeroEntreCien == 31)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 32000) && (restoCincoCifrasNumeroEntreCien  == 23)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 33000) && (restoCincoCifrasNumeroEntreCien  == 33)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 34000) && (restoCincoCifrasNumeroEntreCien  == 43)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 35000) && (restoCincoCifrasNumeroEntreCien  == 53)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 36000) && (restoCincoCifrasNumeroEntreCien  == 63)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 37000) && (restoCincoCifrasNumeroEntreCien  == 73)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 38000) && (restoCincoCifrasNumeroEntreCien  == 83)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 39000) && (restoCincoCifrasNumeroEntreCien  == 93)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 40000) && (restoCincoCifrasNumeroEntreCien == 4)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 41000) && (restoCincoCifrasNumeroEntreCien == 14)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 42000) && (restoCincoCifrasNumeroEntreCien  == 24)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 43000) && (restoCincoCifrasNumeroEntreCien  == 34)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 44000) && (restoCincoCifrasNumeroEntreCien  == 44)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 45000) && (restoCincoCifrasNumeroEntreCien  == 54)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 46000) && (restoCincoCifrasNumeroEntreCien  == 64)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 47000) && (restoCincoCifrasNumeroEntreCien  == 74)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 48000) && (restoCincoCifrasNumeroEntreCien  == 84)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 49000) && (restoCincoCifrasNumeroEntreCien  == 94)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 50000) && (restoCincoCifrasNumeroEntreCien == 5)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 51000) && (restoCincoCifrasNumeroEntreCien == 15)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 52000) && (restoCincoCifrasNumeroEntreCien  == 25)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 53000) && (restoCincoCifrasNumeroEntreCien  == 35)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 54000) && (restoCincoCifrasNumeroEntreCien  == 45)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 55000) && (restoCincoCifrasNumeroEntreCien  == 55)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 56000) && (restoCincoCifrasNumeroEntreCien  == 65)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 57000) && (restoCincoCifrasNumeroEntreCien  == 75)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 58000) && (restoCincoCifrasNumeroEntreCien  == 85)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 59000) && (restoCincoCifrasNumeroEntreCien  == 95)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 60000) && (restoCincoCifrasNumeroEntreCien == 6)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 61000) && (restoCincoCifrasNumeroEntreCien == 16)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 62000) && (restoCincoCifrasNumeroEntreCien  == 26)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 63000) && (restoCincoCifrasNumeroEntreCien  == 36)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 64000) && (restoCincoCifrasNumeroEntreCien  == 46)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 55000) && (restoCincoCifrasNumeroEntreCien  == 55)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 66000) && (restoCincoCifrasNumeroEntreCien  == 66)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 67000) && (restoCincoCifrasNumeroEntreCien  == 76)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 68000) && (restoCincoCifrasNumeroEntreCien  == 86)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 69000) && (restoCincoCifrasNumeroEntreCien  == 96)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 70000) && (restoCincoCifrasNumeroEntreCien == 7)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 71000) && (restoCincoCifrasNumeroEntreCien == 17)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 72000) && (restoCincoCifrasNumeroEntreCien  == 27)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 73000) && (restoCincoCifrasNumeroEntreCien  == 37)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 74000) && (restoCincoCifrasNumeroEntreCien  == 47)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 75000) && (restoCincoCifrasNumeroEntreCien  == 57)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 76000) && (restoCincoCifrasNumeroEntreCien  == 67)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 77000) && (restoCincoCifrasNumeroEntreCien  == 77)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 78000) && (restoCincoCifrasNumeroEntreCien  == 87)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 79000) && (restoCincoCifrasNumeroEntreCien  == 97)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 80000) && (restoCincoCifrasNumeroEntreCien == 8)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 81000) && (restoCincoCifrasNumeroEntreCien == 18)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 82000) && (restoCincoCifrasNumeroEntreCien  == 28)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 83000) && (restoCincoCifrasNumeroEntreCien  == 38)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 84000) && (restoCincoCifrasNumeroEntreCien  == 48)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 85000) && (restoCincoCifrasNumeroEntreCien  == 58)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 86000) && (restoCincoCifrasNumeroEntreCien  == 68)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 87000) && (restoCincoCifrasNumeroEntreCien  == 78)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 88000) && (restoCincoCifrasNumeroEntreCien  == 88)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 89000) && (restoCincoCifrasNumeroEntreCien  == 98)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 90000) && (restoCincoCifrasNumeroEntreCien == 9)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 91000) && (restoCincoCifrasNumeroEntreCien == 19)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 92000) && (restoCincoCifrasNumeroEntreCien  == 29)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 93000) && (restoCincoCifrasNumeroEntreCien  == 39)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 94000) && (restoCincoCifrasNumeroEntreCien  == 49)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 95000) && (restoCincoCifrasNumeroEntreCien  == 59)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 96000) && (restoCincoCifrasNumeroEntreCien  == 69)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 97000) && (restoCincoCifrasNumeroEntreCien  == 79)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 98000) && (restoCincoCifrasNumeroEntreCien  == 89)) {
                System.out.print("El número introducido es capicúa.");
            } else if ((excedenteCincoCifras == 99000) && (restoCincoCifrasNumeroEntreCien  == 99)) {
                System.out.print("El número introducido es capicúa.");
            } else {
                System.out.print("El número introducido no es capicúa.");
            }
        } else {
            if (numero < 0) {
              System.out.print("El programa no funciona con números negativos.");
            } else if (numero >= 100000) {
                System.out.print("El número introducido es demasiado grande.");
            }
        }
    }
  }
}
