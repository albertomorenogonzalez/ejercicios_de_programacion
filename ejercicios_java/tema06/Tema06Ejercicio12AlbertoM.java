/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio12AlbertoM { 
  public static void main(String[] args) {

    for (int numCaracteres = 0; numCaracteres >= 0; numCaracteres++) {
      int caracteres = ((int)(Math.random() * 126) + 32);

      System.out.print((char)caracteres);
    }
  }    
}


