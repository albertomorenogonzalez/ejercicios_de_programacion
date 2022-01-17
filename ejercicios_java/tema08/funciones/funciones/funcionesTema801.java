package funciones;

/**
 * Funciones de los ejercicios del tema 8
 *
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo esPrimo.
 * 
 * @author Alberto Moreno Gonzalez
 */
public class funcionesTema801 { 

  /**
   * La función le da la vuelta al número (Ej.: 123 -> 321)
   *
   * @param numero número al que se le va a dar la vuelta
   * @return numero volteado
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int voltea(long numero) {
    int darLaVuelta = 0;
    
    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + ((int)numero % 10));
      
      numero /= 10;
    } //while (numero > 0)

    return darLaVuelta;
  } //public static int voltea(int numero)

  /**
   * La función comprueba si el número es o no capicúa
   *
   * @param numero número que se va a comprobar si es o no capicúa
   * @return si el número es capicúa o no 
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static boolean esCapicua(long numero) {
    if (funciones.funcionesTema801.voltea(numero) == numero) {
      return true;
    } else {
      return false;
    }
  } //public static boolean esCapicua(long numero)
}