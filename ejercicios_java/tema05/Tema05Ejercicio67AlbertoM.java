/**
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda
 * a derecha. El programa pedirá el número de escalones y la altura de cada
 * escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio67AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA ESCALERA POR PANTALLA");
    System.out.println("---------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca el número de escalones, por favor: ");
    System.out.print("> ");
    int numEscalones = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    System.out.println("Introduzca la altura de cada escalón, por favor: ");
    System.out.print("> ");
    int alturaEscalon = Integer.parseInt(System.console().readLine());
    System.out.println(" ");

    int escalon = 1;
    int numCaracteres = 1;

    while (escalon <= numEscalones) {
      // pinta la altura de cada escalon
      for (int capaEscalon = 0; capaEscalon < alturaEscalon; capaEscalon++) {
        // pinta la longitud de cada escalon
        for (int longEscalon = 0; longEscalon < numCaracteres; longEscalon++) {
          System.out.print("****");
        }

        System.out.println(" ");
      } // for

      escalon++;
      numCaracteres++;
    } // while
  }
}