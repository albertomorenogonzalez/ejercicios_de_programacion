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
   * @param numeroDigitos variable que contará el número de dígitos 
   * @return número de digitos del número
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int digitos(long numero) {
    int numeroDigitos = 0;
    
    //cada vez que el bucle de una iteración el número de dígitos aumentará el número introducido se dividirá entre diez, así hasta que llegue a 0
    while (numero > 0) { 
        numeroDigitos++;
        
        numero /= 10;
    } //while (numero > 0)
    
    return numeroDigitos;
  } //public static int digitos(long numero)


  /**
   * La función devuelve el dígito que está en la posición n de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha.
   *
   * @param numero número introducido sobre el que se va a calcular
   * @param posicion posicion de la que se quiere saber el número
   * @return dígito de la posición consultada
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int digitoN(long numero, int posicion) {
    //se voltea el número para operar sobre él. Así el primer resto de ese número entre 10 será la primera cifra del número introducido
    int darLaVuelta = (funciones.funcionesTema801.voltea(numero)); 

    //se inicializa la variable dígito para guardando ahí el resto de la división de darLaVuelta entre 10, que corresponde al primer dígito del número (posición 0).
    int digito = (darLaVuelta % 10); 

    //el bucle se repetirá hasta que el valor de comprobarPosicion sea igual a posicion.
    //darLaVuelta irá disminuyendo en cada iteración, ya que en cada una el número se divide entre 10.
    //cuando el bucle pare el dígito que se quiere consultar será el que devuelva la función.
    //si se ha consultado la primera posición el bucle no empezará,
    //si se ha consultado otra, el bucle iniciará y no parará hasta que comprobarPosicion sea igual a posicion.
    for (int comprobarPosicion = 0; comprobarPosicion < posicion; comprobarPosicion++) {
      darLaVuelta = (darLaVuelta / 10);
      
      digito = (darLaVuelta % 10);
    }

    return digito;
  } //public static int digitoN(long numero)


  /**
   * La función da la posición de la primera ocurrencia de un dígito
   * dentro de un número entero. Si no se encuentra, devuelve -1.
   *
   * @param numero número introducido sobre el que se va a calcular
   * @param digito digito del que se quiere saber la posición
   * @return primera posición del dígito consultado
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int posicionDeDigito(long numero, int digito) {
    //se voltea el número para operar sobre él. Así el primer resto de ese número entre 10 será la primera cifra del número introducido.
    int darLaVuelta = (funciones.funcionesTema801.voltea(numero)); 

    //declaramos las funciones posicion y comprobarDigito. Seguidamente usaremos un bucle que no pare hasta que comprobarDigito sea igual al dígito introducido
    //o si darLaVuelta es igual a 0. En cada iteración darLaVuelta se dividirá entre 10, el resto de esa división será comprobarDigito (si es igual al digito el bucle terminará, 
    //y si la posición es igual a 0, ni siquiera empezará) y posición aumentará en 1.
    int posicion = 0;

    //se inicializa la variable dígito para guardando ahí el resto de la división de darLaVuelta entre 10, que corresponde al primer dígito del número (posición 0).
    int comprobarDigito = (darLaVuelta % 10);

    while ((comprobarDigito != digito) && (darLaVuelta > 0)) {
      darLaVuelta = (darLaVuelta / 10);

      comprobarDigito = (darLaVuelta % 10);

      posicion++;
    } //while

    //si después de un número de iteraciones darLaVuelta llega a ser 0 (el dígito introducido no ha sido encontrado en el número)
    //la función tendrá que devolver un -1.
    if (darLaVuelta == 0) {
      posicion = -1;
    }

    return posicion;
  } //public static int posicionDeDigito(long numero, int digito)


  /**
   * La función le quita a un número n dígitos por detrás (por la
   * derecha).
   *
   * @param numero número introducido sobre el que se va a calcular
   * @param numDigitos número de dígitos pedido por pantalla 
   * @return primera posición del dígito consultado
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int quitaPorDetras(long numero, int numDigitos) {
    //para quitar cifras a un número por la derecha dividimos a ese número entre diez elevado al número de dígitos introducido
    return (int)numero / (funciones.funcionesTema801.potencia(10, numDigitos));
  }
  
  
  /**
   * La función le quita a un número n dígitos por delante (por la
   * izquierda).
   *
   * @param numero número introducido sobre el que se va a calcular
   * @param numDigitos número de dígitos pedido por pantalla 
   * @return dígito de la posición consultada
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static int quitaPorDelante(long numero, int numDigitos) {
    int darLaVuelta = (funciones.funcionesTema801.voltea(numero)); //primero damos la vuelta el número introducido

    //ese número volteado lo dividimos entre diez elevado al número de dígitos introducido
    int numeroNuevoVolteado = (int)darLaVuelta / (funciones.funcionesTema801.potencia(10, numDigitos)); 

    //le damos la vuelta al número del resultado anterior y ya tenemos el resultado de la función
    return (funciones.funcionesTema801.voltea(numeroNuevoVolteado)); 
  } //public static int quitaPorDelante(long numero, int numDigitos)


  /**
   * La función añade un dígito a un número por detrás.
   *
   * @param numero número introducido sobre el que se va a calcular
   * @param digito dígito que se le va a añadir al número anterior por detrás
   * @return nuevo número formado por la unión del número y el dígito
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long pegaPorDetras(long numero, int digito) {
    return numero * 10 + digito; //el número introducido se multiplica por diez y se le suma el dígito
  } 


  /**
   * La función añade un dígito a un número por delante.
   *
   * @param numero número introducido sobre el que se va a calcular
   * @param digito dígito que se le va a añadir al número anterior por delante
   * @return nuevo número formado por la unión del dígito y el número
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long pegaPorDelante(long numero, int digito) {
    //para cumplir su objetivo la función multiplicará el dígito por 10 elevado al número de dígitos del número introducido
    //a este numero obtenido se le sumará el número introducido, consiguiendo "pegar" el dígito delante del número
    int potenciaDeDiez = (funciones.funcionesTema801.digitos(numero));

    long sumando1 = digito * (funciones.funcionesTema801.potencia(10, potenciaDeDiez));

    long nuevoNumero = sumando1 + numero;

    return nuevoNumero; 
  } //public static long pegaPorDelante(long numero, int digito)


  /**
   * La función toma como parámetros las posiciones inicial y final
   * dentro de un número y devuelve el trozo correspondiente.
   *
   * @param numero número introducido sobre el que se va a calcular
   * @param posicionInicial posición inicial del trozo que se quiere mostrar pr pantalla
   * @param posicionFinal posición final del trozo que se quiere mostrar pr pantalla
   * @return trozo del número introducido delimitado por las dos posiciones introducidas
   * 
   * @author Alberto Moreno Gonzalez
   */
  public static long trozoDeNumero(long numero, int posicionInicial, int posicionFinal) {
    long trozo = 0; //declramos la variable donde se guardará el trzo indicado
    //usaremos la variable posición trozo para buscar las posiciones de los números que se encontrarán en el trozo.
    //iniciará en la posición inical e irá aumentando en 1 en cada interación del bucle, así hasta llegar a la posición final
    int posicionTrozo = posicionInicial; 

    while (posicionTrozo <= posicionFinal) {
      //el programa buscará el dígito de la posición correspondiente 
      int digito = (funciones.funcionesTema801.digitoN(numero, posicionTrozo));

      //lo que hubiese dentro de la variable trozo se multiplicará por 10 y se le sumará el dígito recién encontrado
      trozo = trozo * 10 + digito; 

      posicionTrozo++;
    } //while (posicionTrozo <= posicionFinal)

    return trozo; 
  } //public static long trozoDeNumero(long numero, int posicionInicial, int posicionFinal) {
}