/**
 * Realiza un programa que muestre la previsión del tiempo para mañana en
 * Málaga. Las temperaturas máxima y mínima se deben generar de forma
 * aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
 * últimas décadas para cada estación. La probabilidad de que esté soleado
 * o nublado en cada estación se proporciona a continuación. Obviamente, la
 * temperatura mínima deberá ser menor o igual que la temperatura máxima.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio29AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LA PREVISIÓN DEL TIEMPO PARA MAÑANA EN MÁLAGA");
    System.out.println("-------------------------------------------------------------------");
    System.out.println(" ");

    int tempMinimaAbs = 0;
    int tempMaximaAbs = 0;
    boolean soleado = false;
    boolean nublado = false;
    int numCielo = ((int)(Math.random() * 10));

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.println(" ");
    System.out.println("Seleccione la estación del año (1-4):");
    System.out.print("> ");
    int estacion = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    switch (estacion) {
      case 1:
        tempMinimaAbs = 15;
        tempMaximaAbs = 30;
        switch (numCielo) {
          case 0:
            nublado = true;
            break;
          case 1:
            nublado = true;
            break;
          case 2:
            nublado = true;
            break;
          case 3:
            nublado = true;
            break;
          default:
            soleado = true;
        }
        break;
      case 2:
        tempMinimaAbs = 25;
        tempMaximaAbs = 45;
        switch (numCielo) {
          case 0:
            nublado = true;
            break;
          case 1:
            nublado = true;
            break;
          default:
            soleado = true;
        }
        break;
      case 3:
        tempMinimaAbs = 20;
        tempMaximaAbs = 30;
        switch (numCielo) {
          case 0:
            soleado = true;
            break;
          case 1:
            soleado = true;
            break;
          case 2:
            soleado = true;
            break;
          case 3:
            soleado = true;
            break;
          default:
            nublado = true;
        }
        break;
      case 4:
        tempMinimaAbs = 0;
        tempMaximaAbs = 25;
        switch (numCielo) {
          case 0:
            soleado = true;
            break;
          case 1:
            soleado = true;
            break;
          default:
            nublado = true;
        }
        break;
    }

    int tempMinima = ((int)(Math.random() * (tempMaximaAbs + 1 - tempMinimaAbs)) + tempMinimaAbs);
    int tempMaxima = ((int)(Math.random() * (tempMaximaAbs + 1 - tempMinima)) + tempMinima);

    System.out.println("Previsión del tiempo para mañana:");
    System.out.println("----------------------------------");
    System.out.println(" ");
    System.out.println("Temperatura mínima: " + tempMinima + " ºC");
    System.out.println("Temperatura máxima: " + tempMaxima + " ºC");
    System.out.println(" ");

    if (nublado == true) {
      System.out.println("El cielo está nublado.");
    } else if (soleado == true) {
      System.out.println("El cielo está soleado.");
    }
  }
} 