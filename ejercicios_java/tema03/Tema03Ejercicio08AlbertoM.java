/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 *
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio08AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca cuantas horas ha trabajado el empleado esta semana: ");
    System.out.print("> ");
    number = System.console().readLine();
    int horasdetrabajo;
    horasdetrabajo = Integer.parseInt( number );
    
    System.out.println(" ");
    System.out.print("El empleado debe cobrar ");
    System.out.print(horasdetrabajo * 12);
    System.out.println(" € esta semana.");
  }
}
