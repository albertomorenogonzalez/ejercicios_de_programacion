/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
 * métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Fraccion {
  private int numerador;
  private int denominador;

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  @Override //le ponemos override para no usar el toString de la clase object
  public String toString() {
    return denominador + "/" + numerador;
  }

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  public String invierte(int numerador, int denominador) {
    String fraccionInvertida = (denominador + "/" + numerador);

    return fraccionInvertida;
  }


  public String simplifica(int numerador, int denominador) {
    int k = 9;
    boolean noIrreducible = false;
    String fraccionIrreducible = (numerador + "/" + denominador);
    String fraccionSimplificada = "";

    while ((!noIrreducible) && (k > 1)) {
      if ((numerador % k == 0) && (denominador % k == 0)) {
        numerador = numerador / k;
        denominador = denominador / k;
        fraccionSimplificada = (numerador + "/" + denominador);
        noIrreducible = true;
      }

      k--;
    } //while ((!noIrreducible) && (k > 1))

    if (k > 1) {
      return fraccionSimplificada;
    } else {
      return fraccionIrreducible;
    } //if (k > 1)
  } //public String simplifica()

  
  public String multiplica(int numerador1, int denominador1, int numerador2, int denominador2) {
    int numeradorNuevo = numerador1 * numerador2;
    int denominadorNuevo = denominador1 * denominador2;

    String nuevaFraccion = (numeradorNuevo + "/" + denominadorNuevo);

    return nuevaFraccion;
  }

  public String divide(int numerador1, int denominador1, int numerador2, int denominador2) {
    int numeradorNuevo = numerador1 * denominador2;
    int denominadorNuevo = denominador1 * numerador2;

    String nuevaFraccion = (numeradorNuevo + "/" + denominadorNuevo);

    return nuevaFraccion;
  }
}