/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio01AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE QUE ASIGNATURA TIENES A PRIMERA HORA CADA DÍA");
    System.out.println("-------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca un día de la semana: ");
    System.out.print("> ");
    String diasemana = System.console().readLine();
    
    System.out.println(" ");
    
    switch (diasemana.toLowerCase()) {
      case "lunes":
        System.out.println("Este día toca Programación a primera hora.");
        break;
      case "martes":
        System.out.println("Este día toca Sistemas Informáticos a primera hora.");
        break;
      case "miércoles":
        System.out.println("Este día toca Sistemas Informáticos a primera hora.");
        break;
      case "jueves":
        System.out.println("Este día toca Programación a primera hora.");
        break;
      case "viernes":
        System.out.println("Este día toca Sistemas Informáticos a primera hora.");
        break;
      case "sábado":
        System.out.println("Este día no hay clase.");
        break;
      case "domingo":
        System.out.println("Este día no hay clase."); 
        break;    
      default:
        System.out.println("Por favor, introduzca un día de la semana.");
    }
  }
}
