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
public class Pecera{ 
  private String nombre;
  private int litrosCapacidad;
  private static int cantPeces;
  private static String listaPeces = "";
  private int cantMaxPeces;


  /** CONSTRUCTOR **/

  public Pecera(String nombre, int litrosCapacidad) {
    this.nombre = nombre;
    this.litrosCapacidad = litrosCapacidad;
    this.cantMaxPeces = litrosCapacidad * 4;
  }


  /** GETTERS Y SETTERS **/

  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public int getLitrosCapacidad() {
    return litrosCapacidad;
  }


  public void setLitrosCapacidad(int litrosCapacidad) {
    this.litrosCapacidad = litrosCapacidad;
  }


  public static int getCantPeces() {
    return cantPeces;
  }


  public static void setCantPeces(int cantPeces) {
    Pecera.cantPeces = cantPeces;
  }


  public int getCantMaxPeces() {
    return cantMaxPeces;
  }


  public void setCantMaxPeces(int cantMaxPeces) {
    this.cantMaxPeces = cantMaxPeces;
  }


  /** MÉTODOS **/

  public void mete(Pez pez) {
    if (Pecera.getCantPeces() < this.getCantMaxPeces()) {
      listaPeces = listaPeces + pez + "\n";

      Pecera.cantPeces++;
    } else {
      System.out.println("Pecera llena, no se pueden meter más peces.");
    }
  }


  @Override
  public String toString() {
    return this.getNombre() + ", de " + this.getLitrosCapacidad() + " litros , contiene " + Pecera.getCantPeces() + " peces:\n" + listaPeces;
  }
}