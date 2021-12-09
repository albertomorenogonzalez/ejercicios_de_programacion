/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio14AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PIDE 8 PALABRAS Y LA ALMACENA EN UN ARRAY. LUEGO MOSTRARÁ PRIMERO LAS QUE SEA COLORES Y DESPUÉS EL RESTO");
    System.out.println("----------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");

    String[] palabra = new String [8];

    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    int comprobadorColores;
    boolean palabraEsColor = false;
    String[] coloresResultado = new String [8];

    int indice;
    int indice2 = 0;

    System.out.println("Introduzca 8 palabras:");

    for (indice = 0; indice < 8; indice++) {
      System.out.print("> ");
      palabra[indice] = (System.console().readLine().toLowerCase());

      for (comprobadorColores = 0; ((comprobadorColores < 9) && (palabraEsColor = false)); comprobadorColores++) {
        
      }
        if (palabra[indice].equals(colores[comprobadorColores])) {
          System.out.println(palabra[indice]);
          System.out.println(colores[comprobadorColores]);
          palabraEsColor = true;
        }
      if (palabraEsColor = true) {
        coloresResultado[indice2] = palabra[indice];
        indice2++;
      }
    }

    System.out.println(" ");

    for (indice2 = 0; indice2 < 8; indice2++) {
      System.out.println(coloresResultado[indice2]);
    }
  }
}