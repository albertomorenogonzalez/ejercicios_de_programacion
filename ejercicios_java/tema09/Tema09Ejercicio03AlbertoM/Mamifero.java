/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Mamifero extends Animal {
  private String entorno = "terrestre";
  private String salvajeODomestico;

  public Mamifero(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad, String entorno, String salvajeODomestico) {
    super(nombre, sexo, color, alimentacion, tamanio, edad);
    this.entorno = entorno;
    this.salvajeODomestico = salvajeODomestico;
  }

  public String getEntorno() {
    return entorno;
  }

  public void setEntorno(String entorno) {
    this.entorno = entorno;
  }

  public String getSalvajeODomestico() {
    return salvajeODomestico;
  }

  public void setSalvajeODomestico(String salvajeODomestico) {
    this.salvajeODomestico = salvajeODomestico;
  }

  public boolean esCetáceo(String entorno) {
    if (entorno.toLowerCase().equals("cetáceo")) {
      return true;
    } else {
      return false;
    }
  }

  public String amamantar() {
    String amamantando = this.getNombre() + " está amamantando a sus crías";

    return amamantando;
  }

  public String emitirSonido() {
    String sonido = this.getNombre() + " está gritando";

    return sonido;
  }
}