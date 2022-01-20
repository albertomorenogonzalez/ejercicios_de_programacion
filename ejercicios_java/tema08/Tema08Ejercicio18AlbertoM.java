import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801
import java.util.Scanner; //importamos la clase Scanner

/**
 * Escribe un programa que pase de decimal a binario.

 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio18AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR DECIMAL->BINARIO");
    System.out.println("---------------------------");
    System.out.println(" ");

    //pedimos el número decimal por pantalla
    System.out.println("Introduzca un número decimal: ");
    System.out.print("> ");
    long numeroDe = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroDe + " en decimal es igual a ");

    String numeroBi = "";
    int i = 0;

    while (funciones.funcionesTema801.potencia(2, i) <= numeroDe) {
      i++;
    }

    for (int j = i; j > 0; j--) {
      int constNumDe = funciones.funcionesTema801.potencia(2, i);
      if (constNumDe + funciones.funcionesTema801.potencia(2, j) <= numeroDe) {
        numeroBi = numeroBi + "1";
      } else {
        numeroBi = numeroBi + "0";
      }
    }

    System.out.println(numeroBi);
  }
}