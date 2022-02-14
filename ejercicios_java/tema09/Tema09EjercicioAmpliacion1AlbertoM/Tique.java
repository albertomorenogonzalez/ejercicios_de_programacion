/**
 * El ayuntamiento nos va a contratar para implementar un nuevo programa que 
 * llevará el control de los aparcamientos municipales. Crea la clase Tique 
 * de tal forma que cuando se crea un nuevo tique de aparcamiento se guarde 
 * el momento en el que es creado. Cada tique llevará un número consecutivo, 
 * empezando por el 1. El precio es de 2 céntimos por minuto (0,02 €). 
 * El siguiente trozo de código que va dentro del "main" genera la salida 
 * que se muestra a continuación. Se debe crear tanto la clase Tique 
 * como el programa de prueba completo.
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tique {
  private static int contadorTique = 1;
  private int numTique;
  private int hora;
  private int minutos;
  private static double recaudacion;

  public Tique(int hora, int minutos) {
    this.hora = hora;
    this.minutos = minutos;
    this.numTique = contadorTique;
    contadorTique++;
  }

  public static int getContadorTique() {
    return contadorTique;
  }

  public static void setContadorTique(int contadorTique) {
    Tique.contadorTique = contadorTique;
  }

  public int getNumTique() {
    return numTique;
  }

  public void setNumTique(int numTique) {
    this.numTique = numTique;
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinutos() {
    return minutos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public static double getRecaudacion() {
    return recaudacion;
  }

  public static void setRecaudacion(double recaudacion) {
    Tique.recaudacion = recaudacion;
  }

  public void paga(int horaSalida, int minutosSalida) {
    int horasParking = horaSalida - this.getHora();
    int minutosParking = horasParking * 60 + (minutosSalida - this.getMinutos());

    double precio = minutosParking * 0.02;
    Tique.recaudacion = Tique.getRecaudacion() + precio;

    System.out.printf("%-8s %d%-12s %1.2f %-15s\n" ,"Tique nº" ,this.getNumTique() ,". Debe pagar" ,precio ,"euros. Gracias.");
  }
}