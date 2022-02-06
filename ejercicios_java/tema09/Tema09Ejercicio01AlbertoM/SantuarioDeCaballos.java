/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class SantuarioDeCaballos { 
  public static void main(String[] args) {

    System.out.println("SANTUARIO DE CABALLOS");
    System.out.println("----------------------");
    System.out.println(" ");

    Caballo apolo = new Caballo("Apolo", 2.0, "macho", 2, "Clydesdale");

    System.out.println(apolo.getNombre());
    System.out.println("Mide " + apolo.getTamanio() + " metros");
    System.out.println("Es " + apolo.getSexo());
    System.out.println("Tiene " + apolo.getEdad() + " años");
    System.out.println("Es de raza " + apolo.getRaza() + "\n");

    System.out.println("Veamos lo que está haciendo Apolo...\n");

    int numAccion = (int)(Math.random() * 6);

    switch (numAccion) {
      case 0:
        apolo.correr();
        break;
      case 1:
        apolo.saltar();
        break;
      case 2:
        apolo.relinchar();
        break;
      case 3:
        apolo.comer();
        break;
      case 4:
        apolo.beber();
        break;
      case 5:
        apolo.dormir();
        break;
      default:

    } //switch (numAccion)
  }
}