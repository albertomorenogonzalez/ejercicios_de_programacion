/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Lagarto extends Animal {
  private String medio;
  private int numDientes;

  public Lagarto(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad, String medio, int numDientes) {
    super(nombre, sexo, color, alimentacion, tamanio, edad);
    this.medio = medio;
    this.numDientes = numDientes;
  }

  public String getMedio() {
    return medio;
  }

  public void setMedio(String medio) {
    this.medio = medio;
  }

  public int getNumDientes() {
    return numDientes;
  }

  public void setNumDientes(int numDientes) {
    this.numDientes = numDientes;
  }

  @Override
  public String comer() {
    String comiendo = this.getNombre() + " está comiendo insectos";

    return comiendo;
  }

  public String tomarElSol() {
    String tomar = this.getNombre() + " está tomando el sol";

    return tomar;
  }

  public String correr() {
    String corriendo = this.getNombre() + " está corriendo de tí";

    return corriendo;
  }
}