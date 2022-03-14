package Tema10Ejercicio05AlbertoM;

/**
* Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
* una lista para almacenar la información sobre los discos en lugar de un array
* convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
* ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
* programa hecho con una lista?
* 
* @author Alberto Moreno González
*/
public class Disco {
  private int codigo;
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  public Disco(int codigo, String autor, String titulo, String genero, int duracion) {
    this.codigo = codigo;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
  }

  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
  this.codigo = codigo;
  }
  public String getAutor() {
  return autor;
  }
  public void setAutor(String autor) {
  this.autor = autor;
  }
  public String getGenero() {
  return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public String toString() {
    String cadena = "\n------------------------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nAutor: " + this.autor;
    cadena += "\nTítulo: " + this.titulo;
    cadena += "\nGénero: " + this.genero;
    cadena += "\nDuración: " + this.duracion;
    cadena += "\n------------------------------------------";
    return cadena;
  }
}