/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Caballo { 
  private String nombre;
  private double tamanio;
  private String sexo;
  private int edad;
  private String raza;

  public Caballo (String nombre, double tamanio, String sexo, int edad, String raza) {
    this.nombre = nombre;
    this.tamanio = tamanio;
    this.sexo = sexo;
    this.edad = edad;
    this. raza = raza;
  } //public Caballo (String nombre, double tamanio, String sexo, int edad, String raza)

  /* MÉTODOS */

  public void correr() {
    String accion = "¡" + this.nombre + " está corriendo!";

    System.out.print(accion);
  }

  public void saltar() {
    String accion = "¡" + this.nombre + " está saltando!";

    System.out.print(accion);
  }

  public void relinchar() {
    String accion = "¡" + this.nombre + " está relinchando!";

    System.out.print(accion);
  }

  public void comer() {
    String accion = "¡" + this.nombre + " está comiendo!";

    System.out.print(accion);
  }

  public void beber() {
    String accion = "¡" + this.nombre + " está bebiendo!";

    System.out.print(accion);
  }

  public void dormir() {
    String accion = "¡" + this.nombre + " está durmiendo!";

    System.out.print(accion);
  }

  /* GETTER Y SETTERS */

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getTamanio() {
    return tamanio;
  }

  public void setTamanio(double tamanio) {
    this.tamanio = tamanio;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
}