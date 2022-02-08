import java.util.Scanner;

/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
 * métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 *
 * @author Alberto Moreno Gonzalez
 */
public class ConfiguradorDeFracciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("CONFIGURADOR DE FRACCIONES");
    System.out.println("---------------------------");
    System.out.println(" ");

    Fraccion fraccion1 = new Fraccion (4, 5);
    Fraccion fraccion2 = new Fraccion (8, 3);
    Fraccion fraccion3 = new Fraccion (4, 8);

    int opcion = 0;

    while (opcion != 5) {
      System.out.println("Elija lo que quiere hacer con la fracción " + fraccion3.toString() + ":");
      System.out.println("1. Invertir");
      System.out.println("2. Simplificar");
      System.out.println("3. Multiplicar por " + fraccion1.toString());
      System.out.println("4. Dividir entre " + fraccion2.toString());
      System.out.println("5. Salir\n");
      System.out.print("> ");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println(" ");

      switch (opcion) {
        case 1:
          System.out.println("La fracción invertida es " + fraccion3.invierte(fraccion3.getNumerador(), fraccion3.getDenominador()));
          break;
        case 2:
          System.out.println("La fracción simplificada es " + fraccion3.simplifica(fraccion3.getNumerador(), fraccion3.getDenominador()));
          break;
        case 3:
          System.out.println("El resultado es " + fraccion3.multiplica(fraccion3.getNumerador(), fraccion3.getNumerador(), fraccion1.getDenominador(), fraccion3.getDenominador()));
          break;
        case 4:
          System.out.println("El resultado es " + fraccion3.divide(fraccion3.getNumerador(), fraccion3.getNumerador(), fraccion1.getDenominador(), fraccion3.getDenominador()));
          break;
        default:

      } //switch (opcion)

      System.out.println(" ");

    }
  }
}
