/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
 * un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como
 * máximo e intente de nuevo”. Para el grupo que llega, se busca siempre
 * la primera mesa libre (con 0 personas). Si no quedan mesas libres, se busca
 * donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos
 * personas, se podrá colocar donde haya una o dos personas. Inicialmente, las
 * mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
 * programa se ilustra a continuación:
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema07ArraysUnidEjercicio15AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE SE ENCARGA DE COLOCAR A LOS CLIENTES EN SUS MESAS");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    int[] numero = new int [10];

    int indice;

    System.out.println("┌─────────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬────┐");
    System.out.print("|Mesa nº  |");

    for (indice = 0; indice < 10; indice++) {
      System.out.printf(" %d %-1s" ,(indice + 1) ,"|");
    }

    System.out.println(" ");

    System.out.println("├─────────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼────┤");
    System.out.print("|Ocupación|");

    for (indice = 0; indice < 10; indice++) {
      numero[indice] = ((int)(Math.random() * 5));

      if (indice != 9) {
        System.out.printf(" %d %-1s" ,numero[indice] ,"|");
      } else {
        System.out.printf("  %d %-1s" ,numero[indice] ,"|");
      }
    }

    System.out.println(" ");

    System.out.println("└─────────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴────┘");


  }
}