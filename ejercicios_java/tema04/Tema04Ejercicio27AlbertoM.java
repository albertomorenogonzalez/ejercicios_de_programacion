/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio27AlbertoM {
  public static void main(String[] args) {
    System.out.println("PASTELERÍALAESQUINA.COM");
    System.out.println("------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, indique de que sabor quiere la tarta (manzana, fresa, chocolate): ");
    System.out.print("> ");
    String sabor = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    double precioTarta = 0;
    String nata;
    String nombre;
    double precioNata = 0;
    double precioNombre = 0;
    
    switch (sabor) {
      case "manzana":
        precioTarta = 18.00;
        
        System.out.println("¿Quiere nata? (si o no):");
        System.out.print("> ");
        nata = (System.console().readLine().toLowerCase());
        System.out.println(" ");
    
        System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
        System.out.print("> ");
        nombre = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.printf("%-20s           %.2f %-1s\n","Tarta de manzana:" ,precioTarta ,"€");
        
        if ("si".equals(nata)) {
          precioNata = 2.50;
          System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,precioNata ,"€");
        } 
    
        if ("si".equals(nombre)) {
          precioNombre = 2.75;
          System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,precioNombre ,"€");
        } 
        
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(precioTarta + precioNata + precioNombre) ,"€");
      break;
      case "fresa":
        precioTarta = 16.00;
        
        System.out.println("¿Quiere nata? (si o no):");
        System.out.print("> ");
        nata = (System.console().readLine().toLowerCase());
        System.out.println(" ");
    
        System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
        System.out.print("> ");
        nombre = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.printf("%-20s           %.2f %-1s\n","Tarta de fresa:" ,precioTarta ,"€");
        
        if ("si".equals(nata)) {
          precioNata = 2.50;
          System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,precioNata ,"€");
        } 
    
        if ("si".equals(nombre)) {
          precioNombre = 2.75;
          System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,precioNombre ,"€");
        } 
        
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(precioTarta + precioNata + precioNombre) ,"€");
      break;
      case "chocolate":
        System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
        System.out.print("> ");
        String tipoChocolate = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        if ("negro".equals(tipoChocolate)) {
          precioTarta = 14.00;
        
          System.out.println("¿Quiere nata? (si o no):");
          System.out.print("> ");
          nata = (System.console().readLine().toLowerCase());
          System.out.println(" ");
    
          System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
          System.out.print("> ");
          nombre = (System.console().readLine().toLowerCase());
          System.out.println(" ");
          System.out.println(" ");
          
          System.out.printf("%-20s      %.2f %-1s\n","Tarta de chocolate negro:" ,precioTarta ,"€");
        
          if ("si".equals(nata)) {
            precioNata = 2.50;
            System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,precioNata ,"€");
          } 
    
          if ("si".equals(nombre)) {
            precioNombre = 2.75;
            System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,precioNombre ,"€");
          } 
          
          System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(precioTarta + precioNata + precioNombre) ,"€");
        } else if ("blanco".equals(tipoChocolate)) {
            precioTarta = 15.00;
            
            System.out.println("¿Quiere nata? (si o no):");
            System.out.print("> ");
            nata = (System.console().readLine().toLowerCase());
            System.out.println(" ");
    
            System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
            System.out.print("> ");
            nombre = (System.console().readLine().toLowerCase());
            System.out.println(" ");
            System.out.println(" ");
            
            System.out.printf("%-20s     %.2f %-1s\n","Tarta de chocolate blanco:" ,precioTarta ,"€");
        
            if ("si".equals(nata)) {
              precioNata = 2.50;
              System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,precioNata ,"€");
            } 
    
            if ("si".equals(nombre)) {
              precioNombre = 2.75;
              System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,precioNombre ,"€");
            } 
            
            System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(precioTarta + precioNata + precioNombre) ,"€");
        }
      break;
      default:
        System.out.println("Introduzca correctamente los datos.");
    }
     
    
  } 
}
