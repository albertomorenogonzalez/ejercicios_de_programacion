/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefne el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 *
 * @author Alberto Moreno Gonzalez
 */
public class PeloPicoPata {
  public static void main(String[] args) {
    System.out.println("PELO, PICO, PATA");
    System.out.println("-----------------");
    System.out.println(" ");

    Ave ave1 = new Ave ("Braviary", "Macho", "Shiny", "Carnívoro", 200, 2, "Rapaz", 200);
    Canario canario1 = new Canario ("Piolín", "Hembra", "Amarillo", "Hervíboro", 15, 2, "Doméstico", 10, true);
    Pinguino pinguino1 = new Pinguino ("Skipper", "Macho", "Blanco", "Carnívoro", 70, 2, "Marino", 60, 70.5);
    Mamifero mono1 = new Mamifero ("Monke", "Macho", "Marrón", "Omnívoro", 90, 5, "Jungla", "Salvaje");
    Gato gato1 = new Gato ("Atenea", "Hembra", "Carne", "Carnívoro", 20, 3, "Ciudad", "Doméstico", "Sphinx");
    Perro perro1 = new Perro ("Pipo", "Macho", "Negro", "Omnívoro", 50, 3, "Bosque", "Doméstico", "Bodegeuro");
    Lagarto lagarto1 = new Lagarto ("Dragonite", "Hembra", "Naranja" ,"Carnívoro", 200, 4, "Montaña", 50);

    int numAnimal = (int)(Math.random() * 7);
    int numAccion;

    switch (numAnimal) {
      case 0:
        System.out.println(ave1.getNombre());
        System.out.println("Es " + ave1.getSexo());
        System.out.println("Es " + ave1.getColor());
        System.out.println("Es " + ave1.getAlimentacion());
        System.out.println("Mide " + (ave1.getTamanio() / 100) + " metros");
        System.out.println("Tiene " + ave1.getEdad() + " años");
        System.out.println("Es un ave " + ave1.getTipo());
        System.out.println("Su envergadura es de " + (ave1.getEnvergadura() / 100) + " metros\n");
        
        numAccion = (int)(Math.random() * 5);

        switch (numAccion) {
          case 0:
            System.out.println(ave1.comer());
            break;
          case 1:
            System.out.println(ave1.curiosear());
            break;
          case 2:
            System.out.println(ave1.dormir());
            break;
          case 3:
            System.out.println("La longitud de una de sus alas es de " + ave1.longitudAla(ave1.getEnvergadura()) + " cm");
            break;
          case 4:
            System.out.println(ave1.puedeVolar("Ave"));

            System.out.println(ave1.volar());
            break;
          default:

        } //switch (numAccion)
        break;
      case 1:
        System.out.println(canario1.getNombre());
        System.out.println("Es " + canario1.getSexo());
        System.out.println("Es " + canario1.getColor());
        System.out.println("Es " + canario1.getAlimentacion());
        System.out.println("Mide " + canario1.getTamanio() + " cm");
        System.out.println("Tiene " + canario1.getEdad() + " años");
        System.out.println("Es un ave " + canario1.getTipo());
        System.out.println("Su envergadura es de " + canario1.getEnvergadura() + " cm\n");
        
        numAccion = (int)(Math.random() * 6);

        switch (numAccion) {
          case 0:
            System.out.println(canario1.comer());
            break;
          case 1:
            System.out.println(canario1.curiosear());
            break;
          case 2:
            System.out.println(canario1.dormir());
            break;
          case 3:
            System.out.println("La longitud de una de sus alas es de " + canario1.longitudAla(canario1.getEnvergadura()) + " cm");
            break;
          case 4:
            System.out.println(canario1.puedeVolar("Canario"));
            
            System.out.println(canario1.volar());
            break;
          case 5:
            System.out.println(canario1.canta());
            break;
          default:

        } //switch (numAccion)
        break;
      case 2:
        System.out.println(pinguino1.getNombre());
        System.out.println("Es " + pinguino1.getSexo());
        System.out.println("Es " + pinguino1.getColor());
        System.out.println("Es " + pinguino1.getAlimentacion());
        System.out.println("Mide " + pinguino1.getTamanio() + " cm");
        System.out.println("Tiene " + pinguino1.getEdad() + " años");
        System.out.println("Es un ave " + pinguino1.getTipo());
        System.out.println("Su envergadura es de " + pinguino1.getEnvergadura() + " cm");
        System.out.println("Puede nadar a " + pinguino1.getVelocidadDeNado() + " km/h\n");

        
        numAccion = (int)(Math.random() * 7);

        switch (numAccion) {
          case 0:
            System.out.println(pinguino1.comer());
            break;
          case 1:
            System.out.println(pinguino1.curiosear());
            break;
          case 2:
            System.out.println(pinguino1.dormir());
            break;
          case 3:
            System.out.println("La longitud de una de sus alas es de " + pinguino1.longitudAla(pinguino1.getEnvergadura()) + " cm");
            break;
          case 4:
            System.out.println(pinguino1.puedeVolar("Pinguino"));
            break;
          case 5:
            System.out.println(pinguino1.nadar());
            break;
          case 6:
            System.out.println(pinguino1.incubar(pinguino1.getSexo()));
            break;
          default:

        } //switch (numAccion)
        break;
      case 3:
        System.out.println(mono1.getNombre());
        System.out.println("Es " + mono1.getSexo());
        System.out.println("Es " + mono1.getColor());
        System.out.println("Es " + mono1.getAlimentacion());
        System.out.println("Mide " + mono1.getTamanio() + " cm");
        System.out.println("Tiene " + mono1.getEdad() + " años");
        System.out.println("Su entorno es " + mono1.getEntorno());
        System.out.println("Es " + mono1.getSalvajeODomestico() + "\n");

        numAccion = (int)(Math.random() * 5);

        switch (numAccion) {
          case 0:
            System.out.println(mono1.comer());
            break;
          case 1:
            System.out.println(mono1.curiosear());
            break;
          case 2:
            System.out.println(mono1.dormir());
            break;
          case 3:
            System.out.println(mono1.emitirSonido());
            break;
          case 4:
            if (!mono1.esCetáceo(mono1.getEntorno())) {
              System.out.print("No e");
            } else {
              System.out.print("E");
            }

            System.out.println("s un cetáceo");
            break;
          default:

        } //switch (numAccion)
        break;
      case 4:
        System.out.println(gato1.getNombre());
        System.out.println("Es " + gato1.getSexo());
        System.out.println("Es de color " + gato1.getColor());
        System.out.println("Es " + gato1.getAlimentacion());
        System.out.println("Mide " + gato1.getTamanio() + " cm");
        System.out.println("Tiene " + gato1.getEdad() + " años");
        System.out.println("Su entorno es " + gato1.getEntorno());
        System.out.println("Es " + gato1.getSalvajeODomestico());
        System.out.println("Es de raza " + gato1.getRazaGato() + "\n");

        numAccion = (int)(Math.random() * 8);

        switch (numAccion) {
          case 0:
            System.out.println(gato1.comer());
            break;
          case 1:
            System.out.println(gato1.curiosear());
            break;
          case 2:
            System.out.println(gato1.dormir());
            break;
          case 3:
            System.out.println(gato1.emitirSonido());
            break;
          case 4:
            System.out.println(gato1.amamantar());
            break;
          case 5:
            if (!gato1.esCetáceo(gato1.getEntorno())) {
              System.out.print("No e");
            } else {
              System.out.print("E");
            }

            System.out.println("s un cetáceo");
            break;
          case 6:
            System.out.println(gato1.lavarse());
            break;
          case 7:
            System.out.println(gato1.araniar());
            break;
          default:

        } //switch (numAccion)
        break;
      case 5:
        System.out.println(perro1.getNombre());
        System.out.println("Es " + perro1.getSexo());
        System.out.println("Es " + perro1.getColor());
        System.out.println("Es " + perro1.getAlimentacion());
        System.out.println("Mide " + perro1.getTamanio() + " cm");
        System.out.println("Tiene " + perro1.getEdad() + " años");
        System.out.println("Su entorno es " + perro1.getEntorno());
        System.out.println("Es " + perro1.getSalvajeODomestico());
        System.out.println("Es de raza " + perro1.getRazaPerro() + "\n");

        numAccion = (int)(Math.random() * 7);

        switch (numAccion) {
          case 0:
            System.out.println(perro1.comer());
            break;
          case 1:
            System.out.println(perro1.curiosear());
            break;
          case 2:
            System.out.println(perro1.dormir());
            break;
          case 3:
            System.out.println(perro1.emitirSonido());
            break;
          case 4:
            if (!perro1.esCetáceo(perro1.getEntorno())) {
              System.out.print("No e");
            } else {
              System.out.print("E");
            }

            System.out.println("s un cetáceo");
            break;
          case 5:
            System.out.println(perro1.perseguirCola());
            break;
          case 6:
          System.out.println(perro1.morder());
            break;
          default:

        } //switch (numAccion)
        break;
      case 6:
        System.out.println(lagarto1.getNombre());
        System.out.println("Es " + lagarto1.getSexo());
        System.out.println("Es " + lagarto1.getColor());
        System.out.println("Es " + lagarto1.getAlimentacion());
        System.out.println("Mide " + lagarto1.getTamanio() + " cm");
        System.out.println("Tiene " + lagarto1.getEdad() + " años");
        System.out.println("Suele encontrarse en: " + lagarto1.getMedio());
        System.out.println("Tiene " + lagarto1.getNumDientes() + " dientes\n");

        numAccion = (int)(Math.random() * 5);

        switch (numAccion) {
          case 0:
            System.out.println(lagarto1.comer());
            break;
          case 1:
            System.out.println(lagarto1.curiosear());
            break;
          case 2:
            System.out.println(lagarto1.dormir());
            break;
          case 3:
            System.out.println(lagarto1.tomarElSol());
            break;
          case 4:
          System.out.println(lagarto1.correr());
            break;
          default:

        } //switch (numAccion)
        break;
      default:

    } //switch (numAnimal)
  }
}