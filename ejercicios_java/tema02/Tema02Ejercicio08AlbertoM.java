/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatena-
 * ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * Al poner la cadena de caracteres como letra1 + letra2 + letra3 + letra4 + letra5 
 * nos da error ya que no podemos usar los operadores así comos si fuera un int. 
 * Como todas las cadenas de caracteres en String deben ir entre comillas dobles
 * ponemos una cadena vacía junto al operador de suma precediendo a la concatenación 
 * anterior para almacenarla dentro. Lo podemos ver a continuación.
 *
 * @author Alberto Moreno González
 */
public class Tema02Ejercicio08AlbertoM {
  public static void main(String[] args) {
    char letra1 = 'P';
    char letra2 = 'a';
    char letra3 = 'p';
    char letra4 = 'e';
    char letra5 = 'l';
    String Papel = " " + letra1 + letra2 + letra3 + letra4 + letra5;
    
    System.out.println(Papel);
  }
}
