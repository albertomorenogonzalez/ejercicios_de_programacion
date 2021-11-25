/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 * programa intentará adivinar el número que estás pensando - un número entre 0
 * y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 * debe preguntar si el número que estás pensando es mayor o menor que el que
 * te acaba de decir.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio14AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE INTENTA ADIVINAR EL NÚMERO EN EL QUE ESTAS PENSANDO");
    System.out.println("-----------------------------------------------------------------");
    System.out.println(" ");

    int intento = 0;
    int acierto = 0;
    int numeroMaquina = ((int)(Math.random() * 101));
    int topeMaximo = 101;
    int topeMinimo = 0;

    while ((acierto == 0) && (intento < 5)) {
      System.out.println("¿Es " + numeroMaquina + " el número en el que estás pensando? (sí o no)");
      System.out.print("> ");
      String respuesta = (System.console().readLine().toLowerCase());
      System.out.println(" ");

      if ((respuesta.equals("sí")) || (respuesta.equals("si"))) {
        System.out.println("¡Bien, he adivinado el número! :D");
        acierto = 1;
      } else if (respuesta.equals("no")) {
        intento++;
          
        if (intento != 5) {
          System.out.println(":(");

          if (intento == 4) {
            System.out.println("Me queda " + (5 - intento) + " intento, no puedo fallar esta última oportunidad.");
          } else {
            System.out.println("Me quedan " + (5 - intento) + " intentos.");
          }
          
          System.out.println(" ");
          System.out.println("¿El número es mayor o menor? (mayor o menor)");
          System.out.print("> ");
          respuesta = (System.console().readLine().toLowerCase());
          System.out.println(" ");

          if (respuesta.equals("menor")) {
            if (numeroMaquina < topeMaximo) {
              topeMaximo = numeroMaquina;
            }
          } else if (respuesta.equals("mayor")) {
            if (numeroMaquina > topeMinimo) {
              topeMinimo = (numeroMaquina + 1);
            }


          }

          numeroMaquina = ((int)(Math.random() * (topeMaximo - topeMinimo)) + topeMinimo);
        }
      } 
      
      if (intento == 5) {
        System.out.println("Me he quedado sin intentos :'(");
      }
    }
  }    
}