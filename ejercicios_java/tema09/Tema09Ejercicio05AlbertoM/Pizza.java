/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”
 *
 * @author Alberto Moreno Gonzalez
 */
public class Pizza {
  private String tamaño;
  private String tipo;
  private String estado = "pedida";
  private boolean servida = false;
  private static int totalPedidas;
  private static int totalServidas;

  public Pizza(String tamaño, String tipo) {
    this.tamaño = tamaño;
    this.tipo = tipo;
    Pizza.totalPedidas++;
  }

  public String getTamaño() {
    return tamaño;
  }

  public void setTamaño(String tamaño) {
    this.tamaño = tamaño;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static void setTotalPedidas(int totalPedidas) {
    Pizza.totalPedidas = totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static void setTotalServidas(int totalServidas) {
    Pizza.totalServidas = totalServidas;
  }

  public boolean isServida() {
    return servida;
  }

  public void setServida(boolean servida) {
    this.servida = servida;
  }

  public void sirve() {
    if (this.isServida() == false) {
      this.setEstado("servida");
      Pizza.totalServidas++;
      this.setServida(true);
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }

  @Override
  public String toString() {
    return "pizza " + this.getTamaño() + " " + this.getTipo() + ", " + this.getEstado();
  }
}