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

    System.out.println(" ");

    int numComensales = 1;
    
    int comprobadorMesaLibre = 0;

    while ((numComensales > 0) && (comprobadorMesaLibre < 10)) {
      System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
      System.out.print("> ");
      numComensales = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      // con este bucle se comprueba si hay alguna mesa con 0 comensales
      for (comprobadorMesaLibre = 0; ((comprobadorMesaLibre < 10) && (numero[comprobadorMesaLibre] != 0)); comprobadorMesaLibre++) { }

      // si comprobadorMesaLibre llega a 10 significa que no hay mesas de 0 comensales
      // el programa buscará si es posible sentar el número de comensales introducido en una mesa donde haya hueco (hasta 4 comensales)
      if (comprobadorMesaLibre == 10) {
        for (comprobadorMesaLibre = 0; ((comprobadorMesaLibre < 10) && (numComensales + numero[comprobadorMesaLibre] > 4)); comprobadorMesaLibre++) { }
      }

      if (numComensales > 4) {
        System.out.println("Lo siento, no admitimos grupos de " + numComensales + ", haga grupos de 4 personas como máximo e intente de nuevo.");
        System.out.println(" ");
      } else if (comprobadorMesaLibre == 10) {
        System.out.println("Lo siento, en estos momentos no queda sitio.");
      } else if (numComensales == -1) {
        System.out.println("Gracias. Hasta pronto.");
      } else {
        System.out.println("Por favor, siéntense en la mesa número " + (comprobadorMesaLibre + 1));

        numero[comprobadorMesaLibre] = (numero[comprobadorMesaLibre] + numComensales);

        System.out.println(" ");

        System.out.println("┌─────────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬────┐");
        System.out.print("|Mesa nº  |");
    
        for (indice = 0; indice < 10; indice++) {
          System.out.printf(" %d %-1s" ,(indice + 1) ,"|");
        }
    
        System.out.println(" ");
    
        System.out.println("├─────────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼────┤");
        System.out.print("|Ocupación|");
    
        for (indice = 0; indice < 10; indice++) {
          if (indice != 9) {
            System.out.printf(" %d %-1s" ,numero[indice] ,"|");
          } else {
            System.out.printf("  %d %-1s" ,numero[indice] ,"|");
          }
        }
    
        System.out.println(" ");
    
        System.out.println("└─────────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴────┘");
      } // if
    } // while
  }
}