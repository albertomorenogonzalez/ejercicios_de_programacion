/**
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
 * encargado realizar un programa que pinte un 8 por pantalla usando la letra
 * M. Se pide al usuario la altura, que debe ser un número entero impar mayor
 * o igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
 * La anchura de la figura siempre será de 6 caracteres.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio47AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA 8S CON MS EN CONMEMORACIÓN DEL DÍA DE LA MUJER");
    System.out.println("------------------------------------------------------------------");
    System.out.println(" ");

    int altura = 0;
    
    System.out.println("Introduzca la altura del 8, por favor (número impar mayor que 5):");

    while ((altura < 5) || ((altura % 2) == 0)) {
      System.out.print("> ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      if ((altura < 5) || ((altura % 2) == 0)) {
        System.out.println("Introduzca correctamente la altura del 8, por favor (número impar mayor que 5):");
      }
    }
    
    int linea = 1;
    
    while (linea <= altura) {
      
      for (int longLinea = 1; longLinea <= 6; longLinea++) {
        if ((linea == 1) || (linea == ((altura / 2) + 1)) || (linea == altura)) {
          System.out.print("M");
        } else {
            if ((longLinea == 1) || (longLinea == 6)) {
              System.out.print("M");
            } else {
              System.out.print(" ");
            }
        }
      }
      
      System.out.println(" ");
      
      linea++;
    }
  }
} 
