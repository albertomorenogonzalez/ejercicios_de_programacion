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
public class Pez extends AnimalDeAcuario{ 
  private String raza;


  /** CONSTRUCTOR **/

  public Pez(String nombre, String color, String raza) {
    super(nombre, color);
    this.raza = raza;
  }


  /** GETTERS Y SETTERS **/

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }


  /** MÉTODOS **/

  public Pez seApareaCon(Pez pez) {
    int nombreAleatorio = (int)(Math.random() * 2);
    String nombreHijo = "";

    switch (nombreAleatorio) {
      case 0:
        nombreHijo = this.getNombre();
        break;
      case 1:
        nombreHijo = pez.getNombre();
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
        colorHijo = pez.getColor();
        break;
      default:

    } //switch (colorAleatorio)


    int razaAleatoria = (int)(Math.random() * 2);
    String razaHijo = "";

    switch (razaAleatoria) {
      case 0:
        razaHijo = this.getRaza();
        break;
      case 1:
        razaHijo = pez.getRaza();
        break;
      default:

    } //switch (razaAleatoria)

    Pez pezHijo = new Pez (nombreHijo, colorHijo, razaHijo);

    return pezHijo;
  } //public Pez seApareaCon(Pez pez)


  @Override
  public String toString() {
    return "Soy " + this.getNombre() + ", de color " + this.getColor() + ", un pez " + this.getRaza();
  }
}