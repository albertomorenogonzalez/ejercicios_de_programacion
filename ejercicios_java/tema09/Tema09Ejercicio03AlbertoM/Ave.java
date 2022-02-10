/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Ave extends Animal{
  private String tipo;
  private double envergadura;

  public Ave(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad, String tipo, double envergadura) {
    super(nombre, sexo, color, alimentacion, tamanio, edad);
    this.tipo = tipo;
    this.envergadura = envergadura;
  }

  public String volar() {
    String volando = this.getNombre() + " está volando";

    return volando;
  }

  public int longitudAla(int envergadura) {
    return envergadura / 2 - 10;
  }

  public boolean puedeVolar(String ave) {
    if (ave.equals("Pinguino")) {
      return false;
    } else {
      return true;
    }
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getEnvergadura() {
    return envergadura;
  }

  public void setEnvergadura(double envergadura) {
    this.envergadura = envergadura;
  }
}