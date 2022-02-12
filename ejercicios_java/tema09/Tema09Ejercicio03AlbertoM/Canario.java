/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Canario extends Ave {
  private boolean canta;

  public Canario(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad, String tipo, double envergadura, boolean canta) {
    super(nombre, sexo, color, alimentacion, tamanio, edad, tipo, envergadura);
    this.canta = canta;
  }

  public boolean isCanta() {
    return canta;
  }

  public void setCanta(boolean canta) {
    this.canta = canta;
  }

  public String canta() {
    if (this.canta = true) {
      return "¡" + this.getNombre() + " está cantando!";
    } else {
      return this.getNombre() + " no puede cantar...";
    }
  }

  @Override
  public double longitudAla(double envergadura) {
    return (int) (envergadura / 2 - 3);
  }

  @Override
  public String comer() {
    String comiendo = getNombre() + " está comiendo alpiste";

    return comiendo;
  }
}