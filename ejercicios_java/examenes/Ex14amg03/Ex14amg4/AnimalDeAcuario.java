package Ex14amg4;

/**
 * Se van a utilizar las clases AnimalDeAcuario y Pez creadas en el ejercicio anterior por lo que
 * deberás hacer una copia de dichas clases en la carpeta correspondiente a este ejercicio. Además de
 * hacer la copia, crea la clase Pecera. De una pecera se debe saber su nombre o identificador y los
 * litros de capacidad. En una pecera se pueden meter peces. Para determinar la cantidad máxima de
 * peces que caben en una pecera, se ha de tener en cuenta que no se deben meter más de 4 peces por
 * litro de capacidad. En cualquier momento se podrá mostrar información sobre la pecera: nombre, litros
 * de capacidad, número de peces que contiene y un listado con todos ellos.
 * 
 * @author Alberto Moreno Gonzalez
 * 
 * Fecha: 15 - 2 - 2022
 */
public abstract class AnimalDeAcuario { 
  private String nombre;
  private String color;


  /**  CONSTRUCTOR  **/

  public AnimalDeAcuario(String nombre, String color) {
    this.nombre = nombre;
    this.color = color;
  }


  /**  GETTERS Y SETTERS  **/

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  /** MÉTODOS **/

  @Override
  public String toString() {
    return "Soy " + this.getNombre() + ", de color " + this.getColor();
  }
}