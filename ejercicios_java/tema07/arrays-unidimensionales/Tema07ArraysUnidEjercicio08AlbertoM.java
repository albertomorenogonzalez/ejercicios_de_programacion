/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio08AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE LA TEMPERATURA MEDIA QUE HA HECHO EN CADA MEZ EN UN AÑO Y MUESTRA EL DIAGRAMA DE BARRAS");
    System.out.println("----------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    int[] temperaturaMes = new int [12];
    String[] nombreMes = new String [12];

    int indice;

    for (indice = 0; indice < 12; indice++) {
      switch (indice) {
        case 0:
          nombreMes[0] = "enero";
          break;
        case 1:
          nombreMes[1] = "febrero";
          break;
        case 2:
          nombreMes[2] = "marzo";
          break;
        case 3:
          nombreMes[3] = "abril";
          break;
        case 4:
          nombreMes[4] = "mayo";
          break;
        case 5:
          nombreMes[5] = "junio";
          break;
        case 6:
          nombreMes[6] = "julio";
          break;
        case 7:
          nombreMes[7] = "agosto";
          break;
        case 8:
          nombreMes[8] = "septiembre";
          break;
        case 9:
          nombreMes[9] = "octubre";
          break;
        case 10:
          nombreMes[10] = "noviembre";
          break;
        case 11:
          nombreMes[11] = "diciembre";
          break;
        default:
  
      }

      System.out.println("Introduzca un la temperatura (en grados centígrados) de " + nombreMes[indice] + ": ");
      System.out.print("> ");
      temperaturaMes[indice] = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
    }

    System.out.println(" ");
    System.out.println(" ");

    for (indice = 0; indice < 12; indice++) {
      System.out.print("|");

      for (int caracteresTemperatura = 0; caracteresTemperatura < temperaturaMes[indice]; caracteresTemperatura++) {
        System.out.print("*");
      }

      System.out.println(" ");
    }

    System.out.print("----------------------------------------------------------------------------------");
  }
}