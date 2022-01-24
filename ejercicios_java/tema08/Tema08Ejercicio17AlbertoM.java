import funciones.funcionesTema801; //importamos la biblioteca de funciones funcionesTema801
import java.util.Scanner; //importamos la clase Scanner

/**
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio17AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("CONVERSOR BINARIO->DECIMAL");
    System.out.println("---------------------------");
    System.out.println(" ");

    //pedimos el número binario por pantalla
    System.out.println("Introduzca un número binario: ");
    System.out.print("> ");
    long numeroBi = Long.parseLong(s.nextLine());
    System.out.println(" ");

    System.out.print(numeroBi + " en binario es igual a ");

    long numeroDe = 0; //inicializamos la variable numeroDe donde guardaremos el resultado
    int posicion = 0; //variable que utilizaremos para indicar la psición del dígito binario (empezando por la derecha) y para usarla de exponente

    //creamos un bucle while en el que numeroBi será dividido entre 10 en cada iteración hasta llegar a 0. El resto de cada división corresponde a un dígito
    //binario, empezando por la derecha. La variable posicion indica la posición de ese número de derecha a izquierda (aumenta en 1 en cada iteración). 
    //Una vez obtenido el dígito se multiplica por dos elevado a posicion y se le suma a lo que ya hay en numeroDe. Si digitoBi es 0 no se le sumará nada
    //a numeroDe, por contra, si es 1, se le sumará la potencia de 2 correspondiente a la posición.
    while (numeroBi > 0) {
      long digitoBi = numeroBi % 10;
      numeroDe = numeroDe + funciones.funcionesTema801.potencia(2, posicion) * digitoBi;
      

      posicion++;
      numeroBi /= 10;
    } //while (numeroBi > 0)

    System.out.println(numeroDe + " en decimal"); //mostramos los resultados
  }
}