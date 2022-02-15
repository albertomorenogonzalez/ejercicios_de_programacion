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