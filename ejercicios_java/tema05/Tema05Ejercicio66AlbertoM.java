/**
 * La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
 * para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
 * vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
 * debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
 * de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
 * no es un número impar mayor o igual que 3, el programa debe mostrar un
 * mensaje de error.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio66AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA UNA SEÑAL PARA DESVIAR EL TRÁFICO A LA DERECHA POR PANTALLA");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Introduzca la altura de la señal, por favor (número impar mayor o igual que 3): ");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
      
    if (((altura % 2) == 0) || (altura < 3)) {
      System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
    } else {
      int linea = 1;
      int espacios = 1;
      
      while (linea <= altura) {
        // el número de espacios previos a la figura aumenta hasta que la punta de la flecha se pinta
        if (linea < ((altura/2) + 1)) {
          for (int numEspacios = 1; numEspacios < espacios; numEspacios++) {
            System.out.print(" "); 
          } 

          espacios++;
        // el número de espacios previos a la figura disminuye después de haber pintado la punta de la flecha
        } else {
          for (int numEspacios = espacios; numEspacios > 1; numEspacios--) {
            System.out.print(" "); 
          }

          espacios--;
        } // if

        // caracteres de la flecha pintados
        System.out.println("*    *");
        
        linea++;
      } // while
    } // if
  }
}