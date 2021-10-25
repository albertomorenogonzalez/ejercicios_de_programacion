/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio04AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca un número: ");
    System.out.print("> ");
    number = System.console().readLine();
    double numero1;
    numero1 = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.println("Introduzca otro, por favor: ");
    System.out.print("> ");
    number = System.console().readLine();
    double numero2;
    numero2 = Double.parseDouble( number );
    
    System.out.println(" ");
    
    double suma;
    double resta;
    double multiplicacion;
    double division;
    
    
    suma = (numero1 + numero2);
    resta = (numero1 - numero2);
    multiplicacion = ( numero1 * numero2);
    division = (numero1 / numero2);
    
    System.out.printf("%.3f" ,numero1);
    System.out.print(" + ");
    System.out.printf("%.3f" ,numero2);
    System.out.print(" = ");
    System.out.printf("%.3f" ,suma);
    System.out.println(" ");
    
    System.out.printf("%.3f" ,numero1);
    System.out.print(" - ");
    System.out.printf("%.3f" ,numero2);
    System.out.print(" = ");
    System.out.printf("%.3f" ,resta);
    System.out.println(" ");
    
    System.out.printf("%.3f" ,numero1);
    System.out.print(" x ");
    System.out.printf("%.3f" ,numero2);
    System.out.print(" = ");
    System.out.printf("%.3f" ,multiplicacion);
    System.out.println(" ");
    
    System.out.printf("%.3f" ,numero1);
    System.out.print(" / ");
    System.out.printf("%.3f" ,numero2);
    System.out.print(" = ");
    System.out.printf("%.3f" ,division);
    System.out.println(" ");
  }
}
