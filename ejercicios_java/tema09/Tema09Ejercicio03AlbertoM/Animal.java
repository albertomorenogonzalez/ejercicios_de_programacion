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
  private int edad;

  public Animal(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad) {
    this.nombre = nombre;
    this.sexo = sexo;
    this.color = color;
    this.alimentacion = alimentacion;
    this.tamanio = tamanio;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getAlimentacion() {
    return alimentacion;
  }

  public void setAlimentacion(String alimentacion) {
    this.alimentacion = alimentacion;
  }

  public int getTamanio() {
    return tamanio;
  }

  public void setTamanio(int tamanio) {
    this.tamanio = tamanio;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

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