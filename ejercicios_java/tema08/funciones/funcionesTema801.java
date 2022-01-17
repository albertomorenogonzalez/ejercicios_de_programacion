package funciones;

/**
 * Funciones de los ejercicios del tema 8 (1-14)
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
    int darLaVuelta = 0; //en esta variable se irá guardando el número al que poco a poco se le irá dando la vuelta
    
    while (numero > 0) {
      //el resto del número introducido entre 10 (su último dígito) se irá sumando a lo que haya en darLaVuelta multiplicado por 10 para actualizar darLaVuelta
      darLaVuelta = ((darLaVuelta * 10) + ((int)numero % 10)); 
      
      numero /= 10; //cada vez que el bucle de una vuelta el número introducido se dividirá entre 10, así hasta que este número sea igual a 0.
    } //while (numero > 0)

    return darLaVuelta; //si el número introducido es igual a cero significa que el número ya ha sido volteado, por lo que se devolverá ael resultado
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
    //usando la función voltea, solo necesitamos saber si el resultado final de la función es igual al número introducido, si es así, la función será verdadera; y si no, falsa
    if (funciones.funcionesTema801.voltea(numero) == numero) { 
      return true;
    } else {
      return false;
    }
  } //public static boolean esCapicua(long numero)


  /**
   * La función comprueba si el número es o no primo
   *
   * @param numero número que se va a comprobar si es o no primo
   * @return si el número es primo o no 
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static boolean esPrimo(int numero) {
    int entreNumero= 0; //inicializamos la variable entreNumero

    //un número es primo si solo es divisble entre 1 y sí mismo. Todos los números son divisibles entre uno y sí mismo, por lo que para comprobar si un número es primo o no
    //empezaremos a dividirlo entre el 2 hasta llegar a un número menos que sí mismo. Si el reso de alguna de estas divisiones es 0, significa que el número no es primo
    for (entreNumero = 2; ((entreNumero < numero) && ((numero % entreNumero) != 0)); entreNumero++) { }

    //si el bucle ha recorrido todos los números desde el 2 hasta llegar al número introducido significa que ahora entreNumero es igual al número, lo que significa que ha tenido ninguna
    //división exacta, por lo que es primo. Ya que no es posible que el bucle funcione con el 1 o el 2, añadimos a ambos en la condición de que sean primos.
    if ((entreNumero == numero) || (numero == 1) || (numero == 2)) {
      return true; //si el número es primo la variable booleana será verdadera, si no, falsa
    } else {
      return false;
    }
  } //public static boolean esPrimo(int numero)


  /**
   * La función devuelve el menor número primo que es mayor al número que
   * se pasa como parámetro.
   *
   * @param numero número que se va a comprobar si es o no primo, y a partir del que se van a buscar nuevos primos
   * @return el primer número primo mayor que el número introducido
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int siguientePrimo(int numero) {
    //para esta función utilizaremos la variable es primo e iremos incrementando en 1 el número introducido hasta ver cual de los siguientes es primo
    do {
      numero++;
    } while(!funciones.funcionesTema801.esPrimo(numero));

    return numero;
  } //public static int siguientePrimo(int numero)


  /**
   * La función, dada una base y un exponente devuelve la potencia.
   *
   * @param base base de la potencia
   * @param exponente exponente de la potencia
   * @return potencia
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int potencia(int base, int exponente) {
    int resultado = 1; //definiremos el resultado inicialmente como 1 ya que si el número está elevado a 0 su resultado es 1
    
    //el exponente indica las veces que se repite el bucle. El resultado será igual a la base por el reusltado previo (este cambia en cada iteración)
    for (int numVecesMultiplica = 0; numVecesMultiplica < exponente; numVecesMultiplica++) {
      resultado = (base * resultado);
    }

    return resultado;
  } //public static int potencia(int base, int exponente)


  /**
   * La función cuenta el número de dígitos de un número entero
   *
   * @param base 
   * @return número de digitos del número
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int digitos(long numero) {
    int numeroDigitos = 0; //variable que contará el número de dígitos 
    
    //cada vez que el bucle de una iteración el número de dígitos aumentará el número introducido se dividirá entre diez, así hasta que llegue a 0
    while (numero > 0) { 
        numeroDigitos++;
        
        numero /= 10;
    } //while (numero > 0)
    
    return numeroDigitos;
  } //public static int digitos(long numero)
}