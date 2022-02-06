import java.util.Scanner; //importamos la clase Scanner

/**
 * Escribe un programa que genere los n primeros términos de la sucesión look
 * and say. El primer término es 1. A continuación se va leyendo - un uno - por
 * tanto tenemos 11, se sigue leyendo – dos unos – por tanto tenemos 21, etc.
 * Se recomienda usar arrays para almacenar los dígitos porque los tipos int y
 * long son muy limitados en cuanto al número de dígitos. También puede resultar
 * de ayuda utilizar las funciones convierteArrayEnString y concatena definidas en los
 * ejercicios anteriores.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema08Ejercicio49AlbertoM { 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //declaramos la variable para usar la clase Scanner

    System.out.println("PROGRAMA QUE GENERA LOS N PRIMEROS TÉRMINOS DE LA SUCESIÓN LOOK AND SAY");
    System.out.println("------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("¿Cuántos términos de la sucesión look and say quiere calcular?: ");
    System.out.print("> ");
    int numTerminos = Integer.parseInt(s.nextLine());
    System.out.println(" ");

    String numero = "1";

    for (int i = 0; i < numTerminos; i++) {
      int j;

      System.out.print(numero + " ");

      for (j = 0; ((j < numero.length()) && (numero.charAt(0) == numero.charAt(j))); j++) { }

      numero = String.valueOf(j) + numero;
    }
  }
}