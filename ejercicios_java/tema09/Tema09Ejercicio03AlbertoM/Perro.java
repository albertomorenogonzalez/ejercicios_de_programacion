/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Perro extends Mamifero {
  private String razaPerro;

  public Perro(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad, String entorno, String salvajeODomestico, String razaPerro) {
    super(nombre, sexo, color, alimentacion, tamanio, edad, entorno, salvajeODomestico);
    this.razaPerro = razaPerro;
  }

  public String getRazaPerro() {
    return razaPerro;
  }

  public void setRazaPerro(String razaPerro) {
    this.razaPerro = razaPerro;
  }

  @Override
  public String emitirSonido() {
    String sonido = this.getNombre() + " está ladrando";

    return sonido;
  }

  public String perseguirCola() {
    String persiguiendose = this.getNombre() + " se está persiguiendo la cola";

    return persiguiendose;
  }

  public String morder() {
    String mordiendo = this.getNombre() + " está mordiendo algo";

    return mordiendo;
  }
}