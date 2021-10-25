/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio11AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DADA UNA HORA TE DICE CUANTOS SEGUNDOS FALTAN PARA MEDIANOCHE");
    System.out.println("---------------------------------------------------------------------------");
    
    System.out.println("Por favor, introduzca que hora es (sin los minutos y en formato 24h): ");
    System.out.print("> ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca los minutos: ");
    System.out.print("> ");
    int minutos = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int horasASegundos = ((24 - hora) * 3600);
    
    int horasConMinutosASegundos = ((23 - hora) * 3600);
    
    int minutosASegundos = ((60 - minutos) * 60);
    
    int horasMasMinutosEnS = (horasConMinutosASegundos + minutosASegundos);
    
    if ((hora >= 0) && (hora < 24) && (minutos >= 0) && (minutos <=59)) {
      if (minutos == 0) {
        if (hora == 0) {
          System.out.println("Es medianoche.");
        } else {
          System.out.print("Quedan ");
          System.out.print(horasASegundos);
          System.out.println(" segundos para medianoche");
        }
      } else if (minutos > 0) {
        System.out.print("Quedan ");
        System.out.print(horasMasMinutosEnS);
        System.out.println(" segundos para medianoche");
      } 
    } else {
        System.out.println("Introduzca la hora correctamente.");
    }
  }
}
