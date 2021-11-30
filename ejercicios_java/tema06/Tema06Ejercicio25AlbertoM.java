/**
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio25AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA 100 NÚMEROS AL AZAR");
    System.out.println("----------------------------------------");
    System.out.println(" ");

    int entreNumero;

    for (int contadorNumeros = 0; contadorNumeros < 100; contadorNumeros++) {
      int numero = ((int)(Math.random() * (201 - 10)) + 10);

      for (entreNumero = 2; ((entreNumero < numero) && ((numero % entreNumero) != 0)); entreNumero++) { }
    
      if ((entreNumero == numero) || (numero == 1) || (numero == 2)) {
        System.out.print("#" + numero + "#" +  " ");
      } else if ((numero % 5) == 0) {
        System.out.print("[" + numero + "]" +  " ");
      } else {
        System.out.print(numero +  " ");
      }
    }
  }
} 