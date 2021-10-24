/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio13AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE QUE ORDENA TRES NÚMEROS INTRODUCIDOS POR TECLADO");
    System.out.println("--------------------------------------------------------------");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    double n1 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca otro número, por favor: ");
    System.out.print("> ");
    double n2 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca otro número, por favor: ");
    System.out.print("> ");
    double n3 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    if ((n1 > n2) && (n1 > n3) && (n2 > n3)) {
      System.out.printf("%.2f" ,n1);
      System.out.print(" > ");
      System.out.printf("%.2f" ,n2);
      System.out.print(" > ");
      System.out.printf("%.2f" ,n3);
      System.out.print(".");
    } else if ((n1 > n2) && (n1 > n3) && (n3 > n2)) {
        System.out.printf("%.2f" ,n1);
        System.out.print(" > ");
        System.out.printf("%.2f" ,n3);
        System.out.print(" > ");
        System.out.printf("%.2f" ,n2);
        System.out.print(".");
    } else {
        if ((n2 > n1) && (n2 > n3) && (n1 > n3)) {
          System.out.printf("%.2f" ,n2);
          System.out.print(" > ");
          System.out.printf("%.2f" ,n1);
          System.out.print(" > ");
          System.out.printf("%.2f" ,n3);
          System.out.print(".");
        } else if ((n2 > n1) && (n2 > n3) && (n3 > n1)) {
            System.out.printf("%.2f" ,n2);
            System.out.print(" > ");
            System.out.printf("%.2f" ,n3);
            System.out.print(" > ");
            System.out.printf("%.2f" ,n1);
            System.out.print(".");
        } else {
            if ((n3 > n1) && (n3 > n2) && (n1 > n2)) {
              System.out.printf("%.2f" ,n3);
              System.out.print(" > ");
              System.out.printf("%.2f" ,n1);
              System.out.print(" > ");
              System.out.printf("%.2f" ,n2);
              System.out.print(".");
            } else if ((n3 > n1) && (n3 > n2) && (n2 > n1)) {
                System.out.printf("%.2f" ,n3);
                System.out.print(" > ");
                System.out.printf("%.2f" ,n1);
                System.out.print(" > ");
                System.out.printf("%.2f" ,n2);
                System.out.print(".");
            } else {
                System.out.print("Los tres números son iguales.");
            }
          }
        }
  }
}
