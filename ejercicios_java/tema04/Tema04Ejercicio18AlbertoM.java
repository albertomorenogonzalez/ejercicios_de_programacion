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
    
    int restoDosCifras = (numero % 10);
    int excedenteDosCifras = (numero - restoDosCifras);
    
    int restoTresCifras = (numero % 100);
    int excedenteTresCifras = (numero - restoTresCifras);
    
    int restoCuatroCifras = (numero % 1000);
    int excedenteCuatroCifras = (numero - restoCuatroCifras);
    
    int restoCincoCifras = (numero % 10000);
    int excedenteCincoCifras = (numero - restoCincoCifras);
    
    if ((numero < 10) && (numero > -10)) {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if ((numero < 100) && (numero > -100)) {
          if ((excedenteDosCifras == 10) || (excedenteDosCifras == -10)) {
            System.out.print("La primera cifra del número introducido es 1.");
          } else if ((excedenteDosCifras == 20) || (excedenteDosCifras == -20)) {
            System.out.print("La primera cifra del número introducido es 2.");
          } else if ((excedenteDosCifras == 30) || (excedenteDosCifras == -30)) {
            System.out.print("La primera cifra del número introducido es 3.");
          } else if ((excedenteDosCifras == 40) || (excedenteDosCifras == -40)) {
            System.out.print("La primera cifra del número introducido es 4.");
          } else if ((excedenteDosCifras == 50) || (excedenteDosCifras == -50)) {
            System.out.print("La primera cifra del número introducido es 5.");
          } else if ((excedenteDosCifras == 60) || (excedenteDosCifras == -60)) {
            System.out.print("La primera cifra del número introducido es 6.");
          } else if ((excedenteDosCifras == 70) || (excedenteDosCifras == -70)) {
            System.out.print("La primera cifra del número introducido es 7.");
          } else if ((excedenteDosCifras == 80) || (excedenteDosCifras == -80)) {
            System.out.print("La primera cifra del número introducido es 8.");
          } else if ((excedenteDosCifras == 90) || (excedenteDosCifras == -90)) {
            System.out.print("La primera cifra del número introducido es 9.");
          } 
        } else if ((numero < 1000) && (numero > -1000)) {
            if ((excedenteDosCifras == 100) || (excedenteDosCifras == -100)) {
              System.out.print("La primera cifra del número introducido es 1.");
            } else if ((excedenteTresCifras == 200) || (excedenteTresCifras == -200)) {
              System.out.print("La primera cifra del número introducido es 2.");
            } else if ((excedenteTresCifras == 300) || (excedenteTresCifras == -300)) {
              System.out.print("La primera cifra del número introducido es 3.");
            } else if ((excedenteTresCifras == 400) || (excedenteTresCifras == -400)) {
              System.out.print("La primera cifra del número introducido es 4.");
            } else if ((excedenteTresCifras == 500) || (excedenteTresCifras == -500)) {
              System.out.print("La primera cifra del número introducido es 5.");
            } else if ((excedenteTresCifras == 600) || (excedenteTresCifras == -600)) {
              System.out.print("La primera cifra del número introducido es 6.");
            } else if ((excedenteTresCifras == 700) || (excedenteTresCifras == -700)) {
              System.out.print("La primera cifra del número introducido es 7.");
            } else if ((excedenteTresCifras == 800) || (excedenteTresCifras == -800)) {
              System.out.print("La primera cifra del número introducido es 8.");
            } else if ((excedenteTresCifras == 900) || (excedenteTresCifras == -900)) {
              System.out.print("La primera cifra del número introducido es 9.");
            }
        } else if ((numero < 10000) && (numero > -10000)) {
            if ((excedenteDosCifras == 1000) || (excedenteDosCifras == -1000)) {
              System.out.print("La primera cifra del número introducido es 1.");
            } else if ((excedenteCuatroCifras == 2000) || (excedenteCuatroCifras == -2000)) {
              System.out.print("La primera cifra del número introducido es 2.");
            } else if ((excedenteCuatroCifras == 3000) || (excedenteCuatroCifras == -3000)) {
              System.out.print("La primera cifra del número introducido es 3.");
            } else if ((excedenteCuatroCifras == 4000) || (excedenteCuatroCifras == -4000)) {
              System.out.print("La primera cifra del número introducido es 4.");
            } else if ((excedenteCuatroCifras == 5000) || (excedenteCuatroCifras == -5000)) {
              System.out.print("La primera cifra del número introducido es 5.");
            } else if ((excedenteCuatroCifras == 6000) || (excedenteCuatroCifras == -6000)) {
              System.out.print("La primera cifra del número introducido es 6.");
            } else if ((excedenteCuatroCifras == 7000) || (excedenteCuatroCifras == -7000)) {
              System.out.print("La primera cifra del número introducido es 7.");
            } else if ((excedenteCuatroCifras == 8000) || (excedenteCuatroCifras == -8000)) {
              System.out.print("La primera cifra del número introducido es 8.");
            } else if ((excedenteCuatroCifras == 9000) || (excedenteCuatroCifras == -9000)) {
              System.out.print("La primera cifra del número introducido es 9.");
            } 
        } else if ((numero < 100000) && (numero > -100000)) {
            if ((excedenteDosCifras == 10000) || (excedenteDosCifras == -10000)) {
              System.out.print("La primera cifra del número introducido es 1.");
            } else if ((excedenteCincoCifras == 20000) || (excedenteCincoCifras == -20000)) {
              System.out.print("La primera cifra del número introducido es 2.");
            } else if ((excedenteCincoCifras == 30000) || (excedenteCincoCifras == -30000)) {
              System.out.print("La primera cifra del número introducido es 3.");
            } else if ((excedenteCincoCifras == 40000) || (excedenteCincoCifras == -40000)) {
              System.out.print("La primera cifra del número introducido es 4.");
            } else if ((excedenteCincoCifras == 50000) || (excedenteCincoCifras == -50000)) {
              System.out.print("La primera cifra del número introducido es 5.");
            } else if ((excedenteCincoCifras == 60000) || (excedenteCincoCifras == -60000)) {
              System.out.print("La primera cifra del número introducido es 6.");
            } else if ((excedenteCincoCifras == 70000) || (excedenteCincoCifras == -70000)) {
              System.out.print("La primera cifra del número introducido es 7.");
            } else if ((excedenteCincoCifras == 80000) || (excedenteCincoCifras == -80000)) {
              System.out.print("La primera cifra del número introducido es 8.");
            } else if ((excedenteCincoCifras == 90000) || (excedenteCincoCifras == -90000)) {
              System.out.print("La primera cifra del número introducido es 9.");
            } 
        } else {
            if ((numero >= 100000) || (numero <= 100000)) {
            System.out.println("El número introducido es demasiado grande.");
            }
        }
    }
  }
}
