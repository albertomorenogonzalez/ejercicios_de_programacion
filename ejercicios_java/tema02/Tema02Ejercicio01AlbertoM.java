/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 *
 * @author Alberto Moreno González
 */
public class Tema02Ejercicio01AlbertoM {
  public static void main(String[] args) {
    int x; 

    x = 144; 

    System.out.println("x = " + x);
    
    int y = 999;
    
    System.out.println("y = " + y);
    
    int suma;
    
    suma = x + y;
    
    System.out.print("La suma de ");
    System.out.print(x);
    System.out.print(" y ");
    System.out.print(y);
    System.out.print(" es igual a " + suma);
    System.out.println(".");
    
    int resta;
    
    resta = y - x;
    
    System.out.print("El resultado de restar ");
    System.out.print(x);
    System.out.print(" a ");
    System.out.print(y);
    System.out.print(" es igual a " + resta);
    System.out.println(".");
    
    double division;
    
    division = (double) y / (double) x;
    
    System.out.print("El resultado de dividir ");
    System.out.print(y);
    System.out.print(" entre ");
    System.out.print(x);
    System.out.print(" es igual a " + division);
    System.out.println(".");
    
    int multiplicacion;
    
    multiplicacion = x * y;
    
    System.out.print("El resultado de multiplicar ");
    System.out.print(x);
    System.out.print(" por ");
    System.out.print(y);
    System.out.print(" es igual a " + multiplicacion);
    System.out.println(".");
  }
}
