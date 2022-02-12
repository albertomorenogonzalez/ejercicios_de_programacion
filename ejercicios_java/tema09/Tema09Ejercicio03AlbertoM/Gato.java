/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Gato extends Mamifero {
  private String razaGato;

  public Gato(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad, String entorno,String salvajeODomestico, String razaGato) {
    super(nombre, sexo, color, alimentacion, tamanio, edad, entorno, salvajeODomestico);
    this.razaGato = razaGato;
  }

  public String getRazaGato() {
    return razaGato;
  }

  public void setRazaGato(String razaGato) {
    this.razaGato = razaGato;
  }

  @Override
  public String emitirSonido() {
    String sonido = this.getNombre() + " está maullando";

    return sonido;
  }

  public String lavarse() {
    String lavandose = this.getNombre() + " se está lavando";

    return lavandose;
  }

  public String araniar() {
    String aranaindo = this.getNombre() + " te está arañando";

    return aranaindo;
  }
}