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
public class AparcamientoMunicipal {
  public static void main(String[] args) {
  Tique t1 = new Tique(10, 5);
  Tique t2 = new Tique(14, 30);
  Tique t3 = new Tique(15, 00);
  t1.paga(11, 00);
  t3.paga(17, 45);
  t2.paga(18, 20);
  System.out.print("Recaudación: " + Tique.getRecaudacion() + " euros");
  }
}