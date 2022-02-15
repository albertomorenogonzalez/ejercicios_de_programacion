package Ex14amg3;

/**
 * Se quiere implementar una aplicación para la gestión de un acuario. El primer paso será modelar las
 * clases necesarias. Crea las clases AnimalDeAcuario (no instanciable), Pez y Estrella estableciendo
 * la jerarquía correctamente. De todos los animales del acuario se debe conocer su nombre y color.
 * Además, se debe conocer la raza de los peces y el número de brazos de las estrellas. Si un animal
 * acuático se aparea con otro, nace un animalillo de la misma especie con las características de los
 * padres cogidas de forma aleatoria. Por ejemplo, si se aparean dos estrellas de mar, una se llama Alicia
 * y la otra Alfonso, el nombre de la cría podría ser Alicia o Alfonso. Si Alicia tiene 5 brazos y Alfonso
 * tiene 6 brazos, la cría puede tener 5 o 6 brazos pero no otra cantidad. Con los peces sucede lo mismo.
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