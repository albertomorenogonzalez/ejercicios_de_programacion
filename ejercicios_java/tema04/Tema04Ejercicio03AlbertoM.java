/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
 * diente nombre del día de la semana.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio03AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE EL NOMBRE DEL DÍA DE LA SEMANA SEGÚN EL NÚMERO CORRESPONDIENTE QUE INTRODUZCAS");
    System.out.println("----------------------------------------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca un número del 1 al 7: ");
    System.out.print("> ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.println(" ");
    
    switch (dia) {
      case 1:
        System.out.println("Lunes.");
        break;
      case 2:
        System.out.println("Martes.");
        break;
      case 3:
        System.out.println("Miércoles.");
        break;
      case 4:
        System.out.println("Jueves.");
        break;
      case 5:
        System.out.println("Viernes.");
        break;
      case 6:
        System.out.println("Sábado.");
        break;
      case 7:
      System.out.println("Domingo");     
      default:
        System.out.println("Por favor, introduzca un número del 1 al 7.");
    }
  }
}
