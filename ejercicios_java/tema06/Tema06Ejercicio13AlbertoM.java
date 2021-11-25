/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio13AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TIRA DOS DADOS HASTA QUE AMBOS SACAN EL MISMO NÚMERO");
    System.out.println("------------------------------------------------------------------");
    System.out.println(" ");

    int dado1 = 0;
    int dado2 = 1;

    while (dado1 != dado2) {
      dado1 = ((int)(Math.random()*6));
      switch (dado1) {
        case 0:
          System.out.print("⚀-1 ");
          break;
        case 1:
          System.out.print("⚁-2 ");
          break;
        case 2:
          System.out.print("⚂-3 ");
          break;
        case 3:
          System.out.print("⚂-4 ");
          break;
        case 4:
          System.out.print("⚃-5 ");
          break;
        case 5:
          System.out.print("⚅-6 ");
          break;
        default:

      }

      dado2 = ((int)(Math.random()*6));
      switch (dado2) {
        case 0:
          System.out.print("⚀-1  ");
          break;
        case 1:
          System.out.print("⚁-2  ");
          break;
        case 2:
          System.out.print("⚂-3  ");
          break;
        case 3:
          System.out.print("⚃-4  ");
          break;
        case 4:
          System.out.print("⚃-5  ");
          break;
        case 5:
          System.out.print("⚅-6  ");
          break;
        default:

      }
    }
  }    
}


