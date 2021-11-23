/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio08AlbertoM { 
  public static void main(String[] args) {
    System.out.println("QUINIELA");
    System.out.println("---------");
    System.out.println(" ");
    
    for (int contador = 1; contador < 15; contador++) {
        System.out.printf("%-8s%2d   " ,"Partido" ,contador);

      for (int columna = 1; columna <=3; columna++) {
        int apuesta = ((int)(Math.random() * 6));

        switch (apuesta) {
          case 0:
            System.out.printf(" %d □ □ " ,1);
            break;
          case 1:
            System.out.printf(" %d □ □ " ,1);
            break;
          case 2:
            System.out.printf(" %d □ □ " ,1);
            break;
          case 3:
            System.out.printf(" □ X □ ");
            break;
          case 4:
            System.out.printf(" □ X □ ");
            break;
          case 5:
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


