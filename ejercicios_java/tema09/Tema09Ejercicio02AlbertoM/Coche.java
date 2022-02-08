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
public class Coche extends Vehiculo {
  private int kilometrosRecorridosCoche;

  public Coche(int vehiculosCreados, int kilometrosTotales, int kilometrosRecorridosCoche) {
    super(vehiculosCreados, kilometrosTotales);
    this.kilometrosRecorridosCoche = kilometrosRecorridosCoche;
  }

  public void quemaRueda() {
    System.out.println("*quema rueda con el coche");
  }

  public int getKilometrosRecorridosCoche() {
    return kilometrosRecorridosCoche;
  }

  public void setKilometrosRecorridosCoche(int kilometrosRecorridosCoche) {
    this.kilometrosRecorridosCoche = kilometrosRecorridosCoche;
  }

  public void andaCoche(int km) {
    System.out.println("*se monta en el coche y anda...");

    System.out.println("Ha recorrido " + km + " kilómetros.");
  }

  public int sumaKilometrosCoche(int km) {
    return this.kilometrosRecorridosCoche += km;
  }
}