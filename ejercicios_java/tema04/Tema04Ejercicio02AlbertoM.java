/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio02AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE BUENOS DÍAS, BUENAS TARDES O BUENAS NOCHES SEGÚN LA HORA DEL DÍA");
    System.out.println("--------------------------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca que hora es (sin lo minutos, 0-23): ");
    System.out.print("> ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println(" ");
    
    if ((hora>=0) && (hora<=5)) {
      System.out.println("¡Buenas noches!");
    } if ((hora >= 6) && (hora <= 12)) {
        System.out.println("¡Buenos días!");
    } if ((hora >= 13) && (hora <= 20)) {
        System.out.println("¡Buenas tardes!");
    } if ((hora >= 21) && (hora <= 23)) {
        System.out.println("¡Buenas noches!");
    } else {
        if ((hora<0) || (hora>23)) {
          System.out.println("La hora introducida no existe.");
      }
    }
  }
}
