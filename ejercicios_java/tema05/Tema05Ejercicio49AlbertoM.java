/**
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio49AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE CUANTOS NUMEROS ENTEROS POSITIVOS HAS INTRODUCIDO, EL MAXIMO, EL MINIMO Y LA MEDIA");
    System.out.println("--------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.println(" ");
    System.out.println("Para dejar de introducir números, introduzca un número primo.");
    System.out.println(" ");
    
    long numero = 2;
    int entreNumero = 1;
    int contadorNumeros = 0;
    int sumatorio = 0;
    long numMayor = 0;
    long numMenor = 0;

    while ((numero != entreNumero) && (numero > 0) && (numero != 1)) {
      System.out.print("> ");
      numero = Integer.parseInt(System.console().readLine());
      System.out.println(" ");
      
      for (entreNumero = 2; ((entreNumero < numero) && ((numero % entreNumero) != 0)); entreNumero++) { }
    
      if ((numero != entreNumero) && (numero > 0) && (numero != 1)) {
        System.out.println("Introduzca otro número, por favor: ");

        contadorNumeros++;
        sumatorio = (sumatorio + (int)numero);
        if (contadorNumeros == 1) {
          numMenor = numero;
        }

        if (numero > numMayor) {
          numMayor = numero;
        }
  
        if (numero < numMenor) {
          numMenor = numero;
        }
      }
    }

    double media = ((double)sumatorio / (double)contadorNumeros);
    
    if (contadorNumeros != 0) {
      System.out.println("Ha introducido " + contadorNumeros + " números no primos.");
      System.out.println(" ");
      System.out.println("El mayor número introducido es " + numMayor);
      System.out.println(" ");
      System.out.println("El menor número introducido es " + numMenor);
      System.out.println(" ");
      System.out.println("La media de todos ellos es " + media);
    } else {
      System.out.println("Probablemente haya introducido un número primo de pimeras o un número negativo. Por favor, vuelva a iniciar el programa.");
    }
  }
}