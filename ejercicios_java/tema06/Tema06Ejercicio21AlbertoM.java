/**
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio21AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE JUEGA A CARA O CRUZ CON CINCO MONEDAS DE CURSO LEGAL");
    System.out.println("------------------------------------------------------------------");
    System.out.println(" ");

    for (int contadorMonedas = 0; contadorMonedas < 5; contadorMonedas++) {
      int numMoneda = ((int)(Math.random() * 8));
      String moneda = " ";
      switch (numMoneda) {
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        default:
  
      }

      int numCaraOCruz = ((int)(Math.random() * 2));
      String caraOCruz = " ";
      switch (numCaraOCruz) {
        case 0:
          caraOCruz = "cara";
          break;
        case 1:
          caraOCruz = "cruz";
          break;
        default:

      }

      System.out.print(moneda);
      System.out.printf("%-3s%-4s\n" ," - " ,caraOCruz);
    }
  }
}    