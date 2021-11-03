/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número de derecha
 * a izquierda una posición. El dígito de más a la izquierda, pasaría a dar la vuelta y se colocaría
 * a la derecha. Si el número tiene un solo dígito, se queda igual.
 *
 * @author Alberto Moreno González
 */
public class EjercicioRepaso {
  public static void main(String[] args) {
    System.out.println("PROGRAMA CAPAZ DE DESPLAZAR TODOS LOS DIGITOS DE UN NUMERO  DE DERECHA A IZQUIERDA UNA POSICIÓN");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    if ((numero >= 0) && (numero < 10))  {
      System.out.println("El número introducido solo tiene una cifra.");
    } else {
        if ((numero >= 10) && (numero < 100)) {
          int CifraALaDerecha = (numero % 10);
          int CifrasALaIzquierda = (numero / 10);
          
          System.out.printf("%-20s%d%d" ,"El número resultante es " ,CifraALaDerecha ,CifrasALaIzquierda);
        } else if ((numero >= 100) && (numero < 1000)) {
            int CifraALaDerecha = (numero % 100);
            int CifrasALaIzquierda = (numero / 100);
            
            System.out.printf("%-20s%d%d" ,"El número resultante es " ,CifraALaDerecha ,CifrasALaIzquierda);
            
        } else if ((numero >= 1000) && (numero < 10000)) {
            int CifraALaDerecha = (numero % 1000);
            int CifrasALaIzquierda = (numero / 1000);
            
            System.out.printf("%-20s%d%d" ,"El número resultante es " ,CifraALaDerecha ,CifrasALaIzquierda);    
            
        } else if ((numero >= 10000) && (numero < 100000)) {
            int CifraALaDerecha = (numero % 10000);
            int CifrasALaIzquierda = (numero / 10000);
            
            System.out.printf("%-20s%d%d" ,"El número resultante es " ,CifraALaDerecha ,CifrasALaIzquierda);
        } else if ((numero >= 100000) && (numero < 1000000)) {
            int CifraALaDerecha = (numero % 100000);
            int CifrasALaIzquierda = (numero / 100000);
            
            System.out.printf("%-20s%d%d" ,"El número resultante es " ,CifraALaDerecha ,CifrasALaIzquierda);
        } else if ((numero >= 1000000) && (numero < 10000000)) {
            int CifraALaDerecha = (numero % 1000000);
            int CifrasALaIzquierda = (numero / 1000000);
            
            System.out.printf("%-20s%d%d" ,"El número resultante es " ,CifraALaDerecha ,CifrasALaIzquierda);
        } else if ((numero >= 10000000) && (numero < 100000000)) {
            int CifraALaDerecha = (numero % 10000000);
            int CifrasALaIzquierda = (numero / 10000000);
            
            System.out.printf("%-20s%d%d" ,"El número resultante es " ,CifraALaDerecha ,CifrasALaIzquierda);
        } else {
            if (numero < 0) {
              System.out.print("El programa no funciona con números negativos.");
            } else if (numero >= 100000) {
                System.out.print("El número introducido es demasiado grande.");
            }
        }
    }
  }
}
