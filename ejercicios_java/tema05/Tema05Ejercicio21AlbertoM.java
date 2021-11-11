/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio21AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE CUANTOS NUMEROS HAS INTRODUCIDO, CALCULA LA MEDIA DE LOS IMPARES Y DICE CUAL ES EL MAYOR DE LOS PARES");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.println(" ");
    System.out.println("Para dejar de introducir números, introduzca un número negativo.");
    System.out.println(" ");
    
    int contadorNumeros = 0;
    
    int numeroSumandosImp = 0;
    
    double sumatorioImp = 0;
    
    double numPar1 = 0;
    
    double numPar2 = 0;
    
    for (double numero = 0; numero >= 0; contadorNumeros++) {
      System.out.print("> ");
      numero = Double.parseDouble(System.console().readLine());
      System.out.println(" ");
      
      if (numero >= 0) {
        
        double par = (numero % 2);
        
        if (par != 0) {
          sumatorioImp = numero + sumatorioImp;
          
          numeroSumandosImp++;
        } else {
            numPar2 = numero;
            
            if (numPar1 < numPar2) {
              numPar1 = numPar2;
            }
        }
        
        System.out.println("Introduzca otro número, por favor: ");
      } else {
          double mediaImp = (sumatorioImp / numeroSumandosImp);
          
          System.out.println(" ");
          System.out.println("Ha introducido " + contadorNumeros + " números.");
          System.out.println(" ");
          System.out.println("La media entre los números impares introducidos es de " + mediaImp + ".");
          System.out.println(" ");
          System.out.println("El número par más grande que ha introducido es el " + numPar1 + ".");
      }
    }
  }
}
