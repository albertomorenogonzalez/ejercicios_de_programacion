/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio07AlbertoM { 
  public static void main(String[] args) {
    System.out.println("QUINIELA");
    System.out.println("---------");
    System.out.println(" ");
    
    for (int contador = 1; contador < 15; contador++) {
        System.out.printf("%-8s%2d   " ,"Partido" ,contador);

      for (int columna = 1; columna <=3; columna++) {
        int apuesta = ((int)(Math.random() * 3));

        switch (apuesta) {
          case 0:
            System.out.printf(" %d □ □ " ,1);
            break;
          case 1:
            System.out.printf(" □ X □ ");
            break;
          case 2:
            System.out.printf(" □ □ %d " ,2);
            break;
          default:

        }
      }

      System.out.println(" ");
    }

    System.out.println(" ");

    for (int contadorP15 = 1; contadorP15 <= 2; contadorP15++) {
      int plenoAlQuince = ((int)(Math.random() * 4));
      String muchosGoles = " ";

      switch (plenoAlQuince) {
        case 0:
          muchosGoles = String.valueOf(plenoAlQuince);
          break;
        case 1:
          muchosGoles = String.valueOf(plenoAlQuince);
          break;
        case 2:
          muchosGoles = String.valueOf(plenoAlQuince);
          break;
        case 3:
          muchosGoles = "M";
          break;
        default:
        
      }

      if (contadorP15 < 2) {
        System.out.printf("%-12s   %-6s " ,"Pleno al 15" ,"Equipo1");
        System.out.print(muchosGoles);
      } else if (contadorP15 == 2) {
        System.out.printf("  %-6s " ,"Equipo2");
        System.out.print(muchosGoles);
      }
    }
  }
}


