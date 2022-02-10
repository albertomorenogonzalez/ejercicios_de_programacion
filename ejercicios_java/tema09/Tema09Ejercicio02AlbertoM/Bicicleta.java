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
public class Bicicleta extends Vehiculo {
  private static int kilometrosRecorridosBicicleta;

  public Bicicleta() {
    super();
  }

  public void caballito() {
    System.out.println("*hace el caballito con la bicicleta");
  }

  public static int getKilometrosRecorridosBicicleta() {
    return kilometrosRecorridosBicicleta;
  }

  public void setKilometrosRecorridosBicicleta(int kilometrosRecorridosBicicleta) {
    this.kilometrosRecorridosBicicleta = kilometrosRecorridosBicicleta;
  }

  public void andaBicicleta(int km) {
    System.out.println("*se monta en la bicicleta y anda...");

    System.out.println("Ha recorrido " + km + " kilómetros.");
  }

  public int sumaKilometrosBicicleta(int km) {
    kilometrosRecorridosBicicleta = kilometrosRecorridosBicicleta += km;

    return kilometrosRecorridosBicicleta;
  }
}