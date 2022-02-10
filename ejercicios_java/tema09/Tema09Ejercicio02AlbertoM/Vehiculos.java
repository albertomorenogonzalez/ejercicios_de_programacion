import java.util.Scanner;

/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 *
 * @author Alberto Moreno Gonzalez
 */
public class Vehiculos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("VEHÍCULOS");
    System.out.println("----------");

    Bicicleta bicicleta1 = new Bicicleta();
    bicicleta1.sumaVehiculosCreados(1);
    Coche coche1 = new Coche();
    coche1.sumaVehiculosCreados(1);

    int opcion = 0;

    while (opcion != 9) {
      System.out.println("Elige una opción (1-9):");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Mostrar el total de vehículos");
      System.out.println("9. Salir\n");
      System.out.print("> ");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println(" ");

      switch (opcion) {
        case 1:
          int kMBici = (int)(Math.random() * 10);
          bicicleta1.andaBicicleta(kMBici);
          System.out.println(" ");
          bicicleta1.sumaKilometrosBicicleta(kMBici);
          bicicleta1.sumaKilometrosTotales(kMBici);
          break;
        case 2:
          bicicleta1.caballito();
          break;
        case 3:
          int kMCoche = (int)(Math.random() * 10);
          coche1.andaCoche(kMCoche);
          System.out.println(" ");
          coche1.sumaKilometrosCoche(kMCoche);
          coche1.sumaKilometrosTotales(kMCoche);
          break;
        case 4:
          coche1.quemaRueda();
          break;
        case 5:
          System.out.println("Ha recorrido con su bicicleta en total " + bicicleta1.getKilometrosRecorridosBicicleta() + " km");
          break;
        case 6:
          System.out.println("Ha recorrido con su coche en total " + coche1.getKilometrosRecorridosCoche() + " km");
          break;
        case 7:
          System.out.println("Ha recorrido en total " + Vehiculo.getKilometrosTotales() + " km");
          break;
        case 8:
          System.out.println("Hay " + Vehiculo.getVehiculosCreados() +" vehículos creados" );
          break;
        default:
        
      } //switch (opcion)

      System.out.println("\n ");
    } //while (opcion != 9)
  }
}