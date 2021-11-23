/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio10AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTAPOR PANTALLA DIEZ LÍNEAS DE CARACTERES Y LONGITUD ALEATORIAS");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println(" ");
    

    for (int contadorLineas = 0; contadorLineas < 10; contadorLineas++) {
      int numCaracter = ((int)(Math.random() * 6));
      String caracter = " ";
      switch (numCaracter) {
        case 0:
          caracter = "*";
          break;
        case 1:
          caracter = "-";
          break;
        case 2:
          caracter = "=";
          break;
        case 3:
          caracter = ".";
          break;
        case 4:
          caracter = "|";
          break;
        case 5:
          caracter = "@";
          break;
        default:

      }

      int longLinea = ((int)(Math.random() * 40) + 1);

      for (int numCaracteres = 0; numCaracteres < longLinea; numCaracteres++) {
        System.out.print(caracter);
      }

      System.out.println(" ");
    }
  }
}


