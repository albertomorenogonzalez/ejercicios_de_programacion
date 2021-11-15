/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio22AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA TODOS LOS NÚMEROS PRIMOS ENTRE 2 Y 100, AMBOS INCLUDOS");
    System.out.println("----------------------------------------------------------------------------");
    System.out.println(" ");
    
    int entreNumero = 0;
    
    for (int numero = 2; numero < 100; numero++) {
      
      for (entreNumero = 2; ((entreNumero < numero) && ((numero % entreNumero) != 0)); entreNumero++) { }
     
      if (entreNumero == numero) {
        System.out.print(numero + " ");
      } 
    }
    
    System.out.println("100");
  }
}
