import funciones.funcionesTema801;

/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio16AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS NÚMEROS CAPICÚA QUE HAY ENTRE EL 1 Y EL 99999");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Los números capicúa que hay entre el 1 y el 99999 son:\n");

    for (int i = 1;i <= 99999; i++) {
      if (funciones.funcionesTema801.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}