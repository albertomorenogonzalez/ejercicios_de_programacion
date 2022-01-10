/**
 * 4.  Escribe un programa que genere de forma aleatoria el menú del día de un restaurante
 * vegetariano. El menú se compone de ensalada, plato principal y postre. A continuación se
 * muestra una tabla con todas las opciones posibles. Hay que tener en cuenta que si hay arroz
 * al curry como plato principal, no se debe ofrecer arroz con leche como postre.
 *
 * @author Alberto Moreno González
 * 
 * 14/12/2021
 */
public class Ex14amg04 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA DE FORMA ALEATORIA EL MENÚ DEL DÍA DE UN RESTAURANTE VEGETARIANO");
    System.out.println("-------------------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Menú del dia");
    System.out.println("-------------");

    int numEnsalada = ((int)(Math.random() * 3));
    String[] ensalada = {"tomate y mozzarella", "rúcula y queso de cabra", "endivias con nueces y miel"};
    System.out.println("Ensalada de " + ensalada[numEnsalada]);

    int numPlatoPpal = ((int)(Math.random() * 3));
    String[] platoPpal = {"arroz al curry", "quinoa con verduras", " espagetis al pesto"};
    System.out.println("Plato principal: " + platoPpal[numPlatoPpal]);


    int numPostre = 1;
    if (numPlatoPpal == 0) {
      while (numPostre == 0) {
        numPostre = ((int)(Math.random() * 3));
      }
    } else {
      numPostre = ((int)(Math.random() * 3));
      String[] postre = {"arroz con leche", "natillas", "tarta de chocolate"};
      System.out.println("Postre: " + postre[numPostre]);
    } // if
  }
}