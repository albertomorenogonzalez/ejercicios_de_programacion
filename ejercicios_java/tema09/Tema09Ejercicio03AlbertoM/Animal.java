/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public abstract class Animal {
  private String nombre;
  private String sexo;
  private String color;
  private String alimentacion;
  private int tamanio;
  private String color;
  private int edad;

  public String comer() {
    String comiendo = this.nombre + " está comiendo";

    return comiendo;
  }

  public String curiosear() {
    String curioseando = this.nombre + " está curioseando";

    return curioseando;
  }

  public String dormir() {
    String durmiendo = this.nombre + " está durmiendo";

    return durmiendo;
  }
}