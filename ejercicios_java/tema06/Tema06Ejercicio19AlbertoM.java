/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio19AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA 50 NÚMEROS ENTEROS ALEATORIOS DEL -100 AL 200 Y CALCULA SU MEDIA, EL MÁXIMO DE LOS PARES Y EL MÍINIMO DE LOS IMPARES");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    int sumatorio = 0;

    int numImpar1 = 0;

    int numImpar2 = 0;
    
    int numPar1 = 0;
    
    int numPar2 = 0;

    int contador;
    
    for (contador = 0; contador < 50; contador++) {
      int numero = ((int)(Math.random() * 300) - 100);
        
      int par = (numero % 2);
        
      if (par != 0) {
        numImpar2 = numero;
        
        if (numImpar1 > numImpar2) {
          numImpar1 = numImpar2;
        }
      } else {
        numPar2 = numero;
          
        if (numPar1 < numPar2) {
          numPar1 = numPar2;
        }
      }

      System.out.print(numero + " ");
      sumatorio = (sumatorio + numero);
    } //for

    double media = (sumatorio / contador);
    
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("La media de todos los número generados es de " + media);
    System.out.println(" ");
    System.out.println("El número par más grande es el " + numPar1);
    System.out.println(" ");
    System.out.println("El número impar más pequeño es el " + numImpar1);
  }
}    