/**
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
 * sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
 * durante el 2018, han recibido muchos pedidos del cartel que muestra el número
 * 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
 * usuario se le pedirán dos datos, la altura del cartel y el número de espacios
 * que habrá entre los números. La altura mínima es 5. La anchura de los números
 * siempre es la misma. La parte superior de los cincos también es siempre igual.
 * La parte inferior del 5 sí que varía en función de la altura.

 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio50AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA POR PANTALLA EL NÚMERO 155 CON ASTERISCOS");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");
    
    int altura = 0;
    int espacios = 0;

    while ((altura < 5) || (espacios < 1)) {
      System.out.println("Introduzca ahora la altura, por favor (mínimo 5):");
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      System.out.println("Introduzca el número de espacios entre los números, por favor (mínimo 1): ");
      System.out.print("> ");
      espacios = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      if ((altura < 5) || (espacios < 1)) {
        System.out.println("Introduzca correctamente los datos");
        System.out.println(" ");
      }
    }
    
    int linea = 1;
    
    while (linea <= altura) {
      //Uno
      System.out.print("*");

      //Espacios entre el 1 y el primer 5
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }

      //Primer 5
      for (int cinco1 = 1; cinco1 <= 4; cinco1++) {
        if ((linea == 2) && (cinco1 > 1)) {
          System.out.print(" ");
        } else if (((linea > 3) && (linea < altura)) && (cinco1 < 4)) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
        
      }

      //Espacios entre el primer cinco y el segundo 5
      for (int numEspacios = 1; numEspacios <= espacios; numEspacios++) {
        System.out.print(" "); 
      }

      //Segundo cinco
      for (int cinco2 = 1; cinco2 <= 4; cinco2++) {
        if ((linea == 2) && (cinco2 > 1)) {
          System.out.print(" ");
        } else if (((linea > 3) && (linea < altura)) && (cinco2 < 4)) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      
      //Salto de línea
      System.out.println(" ");
      
      linea++;
    } //while
  }
}