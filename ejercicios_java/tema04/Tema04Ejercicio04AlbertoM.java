/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio04AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL SALARIO SEMANAL DE UNA PERSONA TENIENDO EN CUENTA LAS HORAS TRABAJADAS");
    System.out.println("-----------------------------------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca cuantas horas ha trabajado el empleado esta semana: ");
    System.out.print("> ");
    int horasDeTrabajo = Integer.parseInt(System.console().readLine());
    
    System.out.println(" ");
    
    if ((horasDeTrabajo>0) && (horasDeTrabajo<=40)) {
      System.out.print("El empleado debe cobrar ");
      System.out.print(horasDeTrabajo * 12);
      System.out.println(" € esta semana.");
    } else if (horasDeTrabajo>40) {
        System.out.print("El empleado debe cobrar ");
        System.out.print((40 * 12) + (horasDeTrabajo - 40) * 16);
        System.out.println(" € esta semana.");
    } else {
        System.out.println("El trabajador no ha podido trabajar este número de horas.");
    }
  }
}
