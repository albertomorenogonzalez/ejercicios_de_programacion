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
public class Estrella extends AnimalDeAcuario{ 
  private int numBrazos;


  /**  CONSTRUCTOR  **/

  public Estrella(String nombre, String color, int numBrazos) {
    super(nombre, color);
    this.numBrazos = numBrazos;
  }


  /**  GETTERS Y SETTERS  **/

  public int getNumBrazos() {
    return numBrazos;
  }

  public void setNumBrazos(int numBrazos) {
    this.numBrazos = numBrazos;
  }


  /**  MÉTODOS  **/

  public Estrella seApareaCon(Estrella estrella) {
    int nombreAleatorio = (int)(Math.random() * 2);
    String nombreHijo = "";

    switch (nombreAleatorio) {
      case 0:
        nombreHijo = this.getNombre();
        break;
      case 1:
        nombreHijo = estrella.getNombre();
        break;
      default:

    } //switch (nombreAleatorio)


    int colorAleatorio = (int)(Math.random() * 2);
    String colorHijo = "";

    switch (colorAleatorio) {
      case 0:
        colorHijo = this.getColor();
        break;
      case 1:
        colorHijo = estrella.getColor();
        break;
      default:

    } //switch (colorAleatorio)


    int numBrazosAleatorio = (int)(Math.random() * 2);
    int numBrazosHijo = 0;

    switch (numBrazosAleatorio) {
      case 0:
        numBrazosHijo = this.getNumBrazos();
        break;
      case 1:
        numBrazosHijo = estrella.getNumBrazos();
        break;
      default:

    } //switch (numBrazosAleatorio)

    Estrella estrellaHija = new Estrella (nombreHijo, colorHijo, numBrazosHijo);

    return estrellaHija;
  } //public Estrella seApareaCon(Estrella estrella)


  @Override
  public String toString() {
    return "Soy " + this.getNombre() + ", de color " + this.getColor() + ", una estrella con " + this.getNumBrazos() + " brazos";
  }
}