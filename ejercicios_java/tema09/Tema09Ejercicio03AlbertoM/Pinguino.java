/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Pinguino extends Ave {
  private double velocidadDeNado;

  public Pinguino(String nombre, String sexo, String color, String alimentacion, int tamanio, int edad, String tipo, double envergadura, double velocidadDeNado) {
    super(nombre, sexo, color, alimentacion, tamanio, edad, tipo, envergadura);
    this.velocidadDeNado = velocidadDeNado;
  }

  public double getVelocidadDeNado() {
    return velocidadDeNado;
  }

  public void setVelocidadDeNado(double velocidadDeNado) {
    this.velocidadDeNado = velocidadDeNado;
  }

  @Override
  public double longitudAla(double envergadura) {
    return envergadura / 2 - 5;
  }

  public String nadar() {
    String nadando = this.getNombre() + " está nadando";

    return nadando;
  }

  public String incubar(String sexo) {
    String incubando = "";

    if (sexo.toLowerCase().equals("macho")) {
      incubando = this.getNombre() + " está incubando un huevo";
    } else {
      incubando = this.getNombre() + " no se encarga de incubar los huevos";
    }
    
    return incubando;
  }
}