/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio22AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DADO UN DÍA DE LA SEMANA Y UNA HORA TE DICE CUANTOS MINUTOS QUEDAN PARA EL FIN DE SEMANA");
    System.out.println("------------------------------------------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca que día es: ");
    System.out.print("> ");
    String diaSemana = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca que hora es (sin los minutos y en formato 24h): ");
    System.out.print("> ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca los minutos: ");
    System.out.print("> ");
    int minutos = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int horasAMinutos = (hora * 60);
    
    int horasMasMinutos = (horasAMinutos + minutos);
    
    int minutosEnUnDia = (24*60);
    
    int addMinutosHastaLasTresDelViernes = (15*60);
    
    if ((hora >= 0) && (hora < 24) && (minutos >= 0) && (minutos <=59)) {
      if ("lunes".equals(diaSemana)) {
        System.out.print("Quedan ");
        System.out.print(((((minutosEnUnDia) * 4) + (addMinutosHastaLasTresDelViernes)) - horasMasMinutos));
        System.out.println(" minutos para el fin de semana.");
      } else if ("martes".equals(diaSemana)) {
          System.out.print("Quedan ");
          System.out.print(((((minutosEnUnDia) * 3) + (addMinutosHastaLasTresDelViernes)) - horasMasMinutos));
          System.out.println(" minutos para el fin de semana.");
      } else if (("miércoles".equals(diaSemana)) || ("miercoles".equals(diaSemana))) {
          System.out.print("Quedan ");
          System.out.print(((((minutosEnUnDia) * 2) + (addMinutosHastaLasTresDelViernes)) - horasMasMinutos));
          System.out.println(" minutos para el fin de semana.");
      } else if ("jueves".equals(diaSemana)) {
          System.out.print("Quedan ");
          System.out.print((((minutosEnUnDia) + (addMinutosHastaLasTresDelViernes)) - horasMasMinutos));
          System.out.println(" minutos para el fin de semana.");
      }
    }
  }
}
