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
    boolean palabraEsColor;
    String[] coloresResultado = new String [8];
    String[] restoResultado = new String [8];

    int indice;
    int indice2 = 0;
    int indice3 = 0;
    int contadorColores = 0;
    int contadorResto = 0;

    System.out.println("Introduzca 8 palabras:");

    for (indice = 0; indice < 8; indice++) {
      palabraEsColor = false;

      System.out.print("> ");
      palabra[indice] = (System.console().readLine().toLowerCase());

      for (comprobadorColores = 0; ((comprobadorColores < 8) && (palabraEsColor != true)); comprobadorColores++) { 
        if (palabra[indice].equals(colores[comprobadorColores])) {
          palabraEsColor = true;
        }
      }

      if ((comprobadorColores == 8) && (palabraEsColor = false)) {
        restoResultado[indice3] = palabra[indice];
        indice3++;
        contadorResto++;
      } else if (palabraEsColor = true) {
        coloresResultado[indice2] = palabra[indice];
        indice2++;
        contadorColores++;
      }
    } 

    System.out.println(" ");

    for (indice2 = 0; indice2 < contadorColores; indice2++) {
      System.out.println(coloresResultado[indice2]);
    }

    for (indice3 = 0; indice3 < contadorResto; indice3++) {
      System.out.println(restoResultado[indice3]);
    }
  }
}