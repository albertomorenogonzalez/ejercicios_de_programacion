/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio30AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA LAS HORAS TRANSCURRIDAS ENTRE DOS HORAS DE DOS DÍAS DE LA SEMANA");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    String dia1 = " ";
    int hora1 = -1;
    
    String dia2 = " ";
    int hora2 = -1;
    
    int numDia1 = 0;
    int numDia2 = 0;
    
    while ((dia1 == dia2) || (((hora1 < 0) || (hora1 >= 24)) || ((hora2 < 0) || (hora2 >= 24)))) {
      System.out.println("Introduzca un día de la semana, por favor: (lunes-domingo)");
      System.out.print("> ");
      dia1 = System.console().readLine();
      System.out.println(" ");
    
      System.out.println("Introduzca la hora, por favor: (sin minutos, en formato 24h)");
      System.out.print("> ");
      hora1 = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    
      System.out.println("Introduzca otro día de la semana, por favor: (lunes-domingo)");
      System.out.print("> ");
      dia2 = System.console().readLine();
      System.out.println(" ");
    
      System.out.println("Introduzca otra hora, por favor: (sin minutos, en formato 24h)");
      System.out.print("> ");
      hora2 = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      
      if ((dia1 == dia2) || (numDia1 > numDia2) || (((hora1 < 0) || (hora1 >= 24)) || ((hora2 < 0) || (hora2 >= 24)))) {
        System.out.println(" ");
        System.out.println("Introduzca los datos de nuevo correctamente, por favor:");
        System.out.println(" ");
        System.out.println(" ");
      } else {
        switch (dia1.toLowerCase()) {
          case "lunes":
            numDia1 = 1;
            break;
          case "martes":
            numDia1 = 2;
            break;
          case "miércoles":
            numDia1 = 3;
            break;
          case "jueves":
            numDia1 = 4;
            break;
          case "viernes":
            numDia1 = 5;
            break;
          case "sábado":
            numDia1 = 6;
            break;
          case "domingo":
            numDia1 = 7;  
            break;  
          default:
            System.out.println(" ");
            System.out.println("Introduzca los datos de nuevo correctamente, por favor:");
            System.out.println(" ");
            System.out.println(" ");
          } 
      
        switch (dia2.toLowerCase()) {
          case "martes":
            numDia2 = 2;
            break;
          case "miércoles":
            numDia2 = 3;
            break;
          case "jueves":
            numDia2 = 4;
            break;
          case "viernes":
            numDia2 = 5;
            break;
          case "sábado":
            numDia2 = 6;
            break;
          case "domingo":
            numDia2 = 7;  
            break;  
          default:
            System.out.println(" ");
            System.out.println("Introduzca los datos de nuevo correctamente, por favor:");
            System.out.println(" ");
            System.out.println(" ");
        } 
      }
    }
    
    int horasRestantesDia = (24 - hora1);
    
    int contadorDias = ((numDia2 - numDia1) - 1);
    
    int diasEnHorasTranscurridos = (24 * contadorDias);
    
    int horasTotales = (horasRestantesDia + diasEnHorasTranscurridos + hora2);
    
    if ((dia1 != dia2) || (numDia1 > numDia2) || (((hora1 >= 0) || (hora1 < 24)) || ((hora2 >= 0) || (hora2 < 24)))) {
      System.out.println("Entre las " + hora1 + ":00 del " + dia1 + " y las " + hora2 + ":00 del " + dia2 + " han transcurrido " + horasTotales + " horas.");
    }
  }
}
