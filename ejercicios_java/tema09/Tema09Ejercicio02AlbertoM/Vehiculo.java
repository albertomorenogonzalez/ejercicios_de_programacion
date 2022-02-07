/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 *
 * @author Alberto Moreno Gonzalez
 */
public abstract class Vehiculo {
  private int vehiculosCreados = 0;
  private int kilometrosTotales = 0;

  public int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public void setVehiculosCreados(int vehiculosCreados) {
    this.vehiculosCreados = vehiculosCreados;
  }

  public int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public void setKilometrosTotales(int kilometrosTotales) {
    this.kilometrosTotales = this.kilometrosTotales + kilometrosTotales;
  }
}