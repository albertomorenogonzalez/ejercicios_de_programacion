/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio13AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE ORDENA TRES NÚMEROS INTRODUCIDOS POR TECLADO");
    System.out.println("----------------------------------------------------------");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int n1 = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca otro número, por favor: ");
    System.out.print("> ");
    int n2 = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca otro número, por favor: ");
    System.out.print("> ");
    int n3 = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    if ((n1 > n2) && (n1 > n3) && (n2 > n3)) {
      System.out.print(n1);
      System.out.print(" > ");
      System.out.print(n2);
      System.out.print(" > ");
      System.out.print(n3);
    } else if ((n1 > n2) && (n1 > n3) && (n3 > n2)) {
        System.out.print(n1);
        System.out.print(" > ");
        System.out.print(n3);
        System.out.print(" > ");
        System.out.print(n2);
    } else {
        if ((n2 > n1) && (n2 > n3) && (n1 > n3)) {
          System.out.print(n2);
          System.out.print(" > ");
          System.out.print(n1);
          System.out.print(" > ");
          System.out.print(n3);
        } else if ((n2 > n1) && (n2 > n3) && (n3 > n1)) {
            System.out.print(n2);
            System.out.print(" > ");
            System.out.print(n3);
            System.out.print(" > ");
            System.out.print(n1);
        } else {
            if ((n3 > n1) && (n3 > n2) && (n1 > n2)) {
              System.out.print(n3);
              System.out.print(" > ");
              System.out.print(n1);
              System.out.print(" > ");
              System.out.print(n2);
            } else if ((n3 > n1) && (n3 > n2) && (n2 > n1)) {
                System.out.print(n3);
                System.out.print(" > ");
                System.out.print(n2);
                System.out.print(" > ");
                System.out.print(n1);
            } else {
                if ((n1 == n2) && (n1 > n3)) {
                  System.out.print(n1);
                  System.out.print(" > ");
                  System.out.print(n3);
                } else if ((n1 == n2) && (n3 > n1)) {
                    System.out.print(n3);
                    System.out.print(" > ");
                    System.out.print(n1);
                } else if ((n1 == n3) && (n2 > n1)) {
                    System.out.print(n2);
                    System.out.print(" > ");
                    System.out.print(n1);
                } else if ((n1 == n3) && (n1 > n2)) {
                    System.out.print(n1);
                    System.out.print(" > ");
                    System.out.print(n2);
                } else if ((n2 == n3) && (n1 > n2)) {
                    System.out.print(n1);
                    System.out.print(" > ");
                    System.out.print(n2);
                } else if ((n2 == n3) && (n2 > n1)) {
                    System.out.print(n2);
                    System.out.print(" > ");
                    System.out.print(n1);
                } else {
                    System.out.print("Los tres números son iguales.");
                }
            }
        }
    }
  }
}






